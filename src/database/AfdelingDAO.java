package database;

import model.Afdeling;

import java.sql.PreparedStatement;
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
}
