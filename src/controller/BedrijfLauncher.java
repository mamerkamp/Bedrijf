package controller;

import model.Persoon;

/**
 * Author: Mark Amerkamp (markamerkamp@gmail.com)
 * Veel plezier ermee!
 */
public class BedrijfLauncher {

    public static void main(String[] args) {

        String[] afdelingen = new String[4];
        afdelingen[0] = "Uitvoering";
        afdelingen[1] = "Support";
        afdelingen[2] = "Management";
        afdelingen[3] = "Documentatie";

        System.out.println(Persoon.aantalPersonen)

        Persoon baas = new Persoon("Mark", "Den Haag", 10000, afdelingen[2]);
        System.out.println(Persoon.aantalPersonen);
        System.out.println(baas.getPersoneelsNummer());
        Persoon medewerker = new Persoon("Caroline", "Delft", 4000);
        System.out.println(Persoon.aantalPersonen);
        System.out.println(medewerker.getPersoneelsNummer());

        Persoon assistent = new Persoon("Klaas");
        Persoon manager = new Persoon();
        System.out.println(Persoon.aantalPersonen);

        System.out.printf("%s verdient %.2f en heeft %s recht op een bonus", baas.getNaam(), baas.getMaandSalaris(), baas.heeftRechtOpBonus());
        System.out.println();
        System.out.printf("%s verdient %.2f en heeft %s recht op een bonus", medewerker.getNaam(), medewerker.getMaandSalaris(), medewerker.heeftRechtOpBonus());

    }
}
