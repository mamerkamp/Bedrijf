package controller;

import model.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;


/**
 * Author: Mark Amerkamp (markamerkamp@gmail.com)
 * Veel plezier ermee!
 */
public class BedrijfLauncher {

    public static void main(String[] args) {


        ArrayList<Afdeling> afdelingen = new ArrayList<>();
        File afdelingenBestand = new File("resources/Afdelingen.txt");

        Scanner invoer = null;
        try{
            invoer = new Scanner(afdelingenBestand);
            while (invoer.hasNextLine()) {
                String afdelingNaam = invoer.nextLine();
                String afdelingPlaats = invoer.nextLine();
                afdelingen.add(new Afdeling(afdelingNaam, afdelingPlaats));
            }
        }
        catch (FileNotFoundException e) {
                System.out.println("Het bestand is niet gevonden");
        } finally {
            if (invoer != null) {
                invoer.close();
            }
        }


        ArrayList<Persoon> personen = new ArrayList<>();
        File personenBestand = new File("resources/Personen.csv");

        Scanner invoerPersonen = null;
        try{
            invoerPersonen = new Scanner(personenBestand);
            while (invoerPersonen.hasNextLine()) {
                String[] regelArray = invoerPersonen.nextLine().split(",");
                String type = regelArray[0];
                String naam = regelArray[1];
                String woonplaats = regelArray[3];
                int index = Integer.parseInt(regelArray[3]);
                double geld = Double.parseDouble(regelArray[4]);

                switch (type) {
                    case "Werknemer":
                        personen.add(new Werknemer(naam, woonplaats, afdelingen.get(index), geld));
                        break;
                    case "Zzper":
                        personen.add(new Zzper(naam, woonplaats, afdelingen.get(index), geld));
                        break;
                    case "Vrijwilliger":
                        personen.add(new Vrijwilliger(naam, woonplaats, afdelingen.get(index)));
                        break;
                }
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Het bestand is niet gevonden");
        } finally {
            if (invoerPersonen != null) {
                invoerPersonen.close();
            }
        }

        Collections.sort(personen);
        for (Persoon s : personen) {
            System.out.println(s);
        }

        File uitvoerBestand = new File("resources/PersonenPerAfdeling.txt");
        try {
            PrintWriter writer = new PrintWriter(uitvoerBestand);
            for (Afdeling afdeling : afdelingen) {
                writer.println("Afdeling: " + afdeling.getAfdelingsNaam());
                for (Persoon persoon : personen) {
                    if (persoon.getAfdeling() == afdeling) {
                        writer.println("-- " + persoon);
                    }
                }
                writer.println();
            }
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Bestand kon niet worden aangemaakt");
        }



//        Afdeling[] afdelingen = new Afdeling[4];
//        afdelingen[0] = new Afdeling("Uitvoering" ,"Hilversum");
//        afdelingen[1] = new Afdeling("Support", "Amsterdam");
//        afdelingen[2] = new Afdeling("Management", "Almere");
//        afdelingen[3] = new Afdeling("Documentatie", "Gouda");
//
//
//        ArrayList<Persoon> personen = new ArrayList<>();
//
//        personen.add(new Werknemer("Mark", "Den Haag", afdelingen[2],10000 ));
//        personen.add(new Werknemer("Angelique", "Rotterdam", afdelingen[2], 5000));
//        personen.add(new Werknemer("Caroline", "Delft,", afdelingen[1], 4000 ));
//        personen.add(new Zzper("Klaas","Diemen", afdelingen[3], 50.00));
//        personen.add(new Vrijwilliger("Ambi", "Amsterdam", afdelingen[0]));
//        personen.add(new Vrijwilliger("Naledi", "Gaborone", afdelingen[1]));
//        personen.add(new Vrijwilliger("Ceren", "Istanboel", afdelingen[2]));
//        personen.add(new Vrijwilliger("Haining", "Shaoxing", afdelingen[3]));
//
//        for (Persoon persoon : personen) {
//            if(persoon instanceof Zzper) {
//                ((Zzper) persoon).huurIn(320);
//            }
//            if(persoon instanceof Vrijwilliger) {
//                ((Vrijwilliger) persoon).huurIn(160);
//            }
//        }
//        Collections.sort(personen);
//        for (Persoon persoon : personen) {
//            System.out.println(persoon);
//            toonJaarInkomen(persoon);
//        }
//
//        Scanner keyboard = new Scanner(System.in);
//        System.out.print("Geef de naam: ");
//        String inputNaam = keyboard.nextLine();
//        System.out.print("Geef de woonplaats: ");
//        String inputWoonplaats = keyboard.nextLine();
//        System.out.print("Geef de naam van de afdeling: ");
//        String inputAfdeling = keyboard.nextLine();
//        System.out.print("Geef de afdeling locatie: ");
//        String inputAfdelingPlaats = keyboard.nextLine();
//
//        boolean onjuisteInvoer = true;
//
//        while (onjuisteInvoer) {
//            System.out.print("Geef het maandsalaris: ");
//
//
//            try {
//                double inputSalaris = keyboard.nextDouble();
//                Werknemer werknemer = new Werknemer(inputNaam, inputWoonplaats, new Afdeling(inputAfdeling, inputAfdelingPlaats), inputSalaris);
//                System.out.println(werknemer);
//                onjuisteInvoer = false;
//                keyboard.close();
//            } catch (IllegalArgumentException exception) {
//                System.out.println(exception.getMessage());
//            } catch (InputMismatchException exception) {
//                System.out.println("Geen geldige invoer");
//                keyboard.nextLine();
//            }
//            finally {
//                System.out.println("Je invoer is op de juiste wijze afgehandeld");
//            }
//        }
//    }
//
//    public static void toonJaarInkomen(Persoon persoon) {
//        System.out.printf("%s verdient %.2f per jaar\n", persoon.getNaam(), persoon.berekenJaarInkomen());
//    }
    }
}
