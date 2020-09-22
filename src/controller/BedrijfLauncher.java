package controller;

import model.Afdeling;
import model.Persoon;
import model.Werknemer;
import model.Zzper;


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


        Werknemer baas = new Werknemer("Mark", "Den Haag",  afdelingen[2], 10000.00);
        Werknemer medewerker = new Werknemer("Caroline", "Delft", afdelingen[1], 4000.00);
        Zzper assistent = new Zzper("Klaas", "Diemen", afdelingen[3], 50.0);

        assistent.huurIn(160);
        System.out.println("Het aantal personen in het bedrijf is " + Persoon.aantalPersonen);
        System.out.println();
        System.out.println(baas);
        System.out.println(medewerker);
        System.out.println(assistent);

        System.out.println();
        System.out.printf("%s verdient %.2f per jaar.\n", baas.getNaam(), baas.berekenJaarInkomen());
        System.out.printf("%s verdient %.2f per jaar.\n", medewerker.getNaam(), medewerker.berekenJaarInkomen());
        System.out.printf("%s verdient %.2f per jaar.\n", assistent.getNaam(), assistent.berekenJaarInkomen());


    }
}
