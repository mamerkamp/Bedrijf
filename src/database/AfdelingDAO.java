package database;

import model.Afdeling;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Author: Mark Amerkamp (markamerkamp@gmail.com)
 * Veel plezier ermee!
 */
public class AfdelingDAO {

    private DBaccess dBaccess;

    public AfdelingDAO(DBaccess dBaccess) {
        this.dBaccess = dBaccess;
    }

    public void slaAfdelingOp(Afdeling afdeling) {
        String sql = "INSERT INTO afdeling VALUES (?, ?);";

        try {
            try {
                PreparedStatement preparedStatement = dBaccess.getConnection().prepareStatement(sql);
                preparedStatement.setString(1, afdeling.getAfdelingsNaam());
                preparedStatement.setString(2, afdeling.getAfdelingsPlaats());
                preparedStatement.executeUpdate();

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        } finally {
            System.out.println("Succesvol ingeladen");

        }
    }

    public void geefAfdelingenMetPlaats(String afdelingplaats) {

        String sql2 = "SELECT * FROM afdeling WHERE afdelingsplaats = (?);";
            try {
                PreparedStatement preparedStatement = dBaccess.getConnection().prepareStatement(sql2);

                preparedStatement.setString(1, afdelingplaats);
                ResultSet resultSet = preparedStatement.executeQuery();

                while(resultSet.next()) {
                    String naamAfdeling = resultSet.getString("afdelingsnaam");
                    String plaatsAfdeling = resultSet.getString("afdelingsplaats");
                    System.out.println(new Afdeling(naamAfdeling, plaatsAfdeling));
                }

            } catch (SQLException sqlfout) {
                System.out.println(sqlfout);
            }

    }
}
