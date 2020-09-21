package controller;

import model.Persoon;

/**
 * Author: Mark Amerkamp (markamerkamp@gmail.com)
 * Veel plezier ermee!
 */
public class BedrijfLauncher {

    public static void main(String[] args) {

        System.out.println(Persoon.aantalPersonen);

        Persoon baas = new Persoon("Mark", "Den Haag", 10000);
        System.out.println(Persoon.aantalPersonen);
        System.out.println(baas.getPersoneelsNummer());
        Persoon medewerker = new Persoon("Caroline", "Delft", 4000);
        System.out.println(Persoon.aantalPersonen);
        System.out.println(medewerker.getPersoneelsNummer());

        Persoon assistent = new Persoon("Klaas");
        Persoon manager = new Persoon();
        System.out.println(Persoon.aantalPersonen);

//        if(baas.heeftRechtOpBonus()){
//            System.out.printf("%s verdient %.2f en heeft wel recht op een bonus", baas.getNaam(), baas.getMaandSalaris());
//        } else {
//            System.out.printf("%s verdient %.2f en heeft geen recht op een bonus", baas.getNaam(), baas.getMaandSalaris());
//        }
//        System.out.println();
//        if(medewerker.heeftRechtOpBonus()){
//            System.out.printf("%s verdient %.2f en heeft wel recht op een bonus", medewerker.getNaam(), medewerker.getMaandSalaris());
//        } else {
//            System.out.printf("%s verdient %.2f en heeft geen recht op een bonus", medewerker.getNaam(), medewerker.getMaandSalaris());
//        }
        System.out.printf("%s verdient %.2f en heeft %s recht op een bonus", baas.getNaam(), baas.getMaandSalaris(), baas.heeftRechtOpBonus());
        System.out.println();
        System.out.printf("%s verdient %.2f en heeft %s recht op een bonus", medewerker.getNaam(), medewerker.getMaandSalaris(), medewerker.heeftRechtOpBonus());

    }
}
