package controller;

import model.Afdeling;
import model.Persoon;

import java.sql.SQLOutput;


/**
 * Author: Mark Amerkamp (markamerkamp@gmail.com)
 * Veel plezier ermee!
 */
public class BedrijfLauncher {

    public static void main(String[] args) {

        Afdeling[] afdelingen = new Afdeling[4];
        afdelingen[0] = new Afdeling("Uitvoering" ,"Hilversum");
        afdelingen[1] = new Afdeling("Support", "Amsterdam");
        afdelingen[2] = new Afdeling("Management", "Almere");
        afdelingen[3] = new Afdeling("Documentatie", "Gouda");


        Persoon baas = new Persoon("Mark", "Den Haag", afdelingen[2]);
        Persoon medewerker = new Persoon("Caroline", "Delft", afdelingen[1]);
        Persoon assistent = new Persoon("Klaas");

        System.out.println("Het aantal personen in het bedrijf is " + Persoon.aantalPersonen);
        System.out.printf("%s werkt in %s en woont in %s\n", baas.getNaam(), baas.getAfdeling().getAfdelingsPlaats(),
                baas.getWoonplaats());
        //System.out.printf("%s werkt op de afdeling %s en verdient %.2f\n", medewerker.getNaam(),
        //        medewerker.getAfdeling().getAfdelingsNaam(), medewerker.getMaandSalaris());
        System.out.printf("%s werkt op de afdeling %s en woont in %s", assistent.getNaam(),
                assistent.getAfdeling().getAfdelingsNaam(), assistent.getWoonplaats());


    }
}
