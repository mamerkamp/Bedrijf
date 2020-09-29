package controller;

import model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * Author: Mark Amerkamp (markamerkamp@gmail.com)
 * Veel plezier ermee!
 */
public class BedrijfLauncher {

    public static void main(String[] args) {
//
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

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Geef de naam: ");
        String inputNaam = keyboard.nextLine();
        System.out.print("Geef de woonplaats: ");
        String inputWoonplaats = keyboard.nextLine();
        System.out.print("Geef de naam van de afdeling: ");
        String inputAfdeling = keyboard.nextLine();
        System.out.print("Geef de afdeling locatie: ");
        String inputAfdelingPlaats = keyboard.nextLine();

        boolean onjuisteInvoer = true;

        while (onjuisteInvoer) {
            System.out.print("Geef het maandsalaris: ");


            try {
                double inputSalaris = keyboard.nextDouble();
                Werknemer werknemer = new Werknemer(inputNaam, inputWoonplaats, new Afdeling(inputAfdeling, inputAfdelingPlaats), inputSalaris);
                System.out.println(werknemer);
                onjuisteInvoer = false;
                keyboard.close();
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            } catch (InputMismatchException exception) {
                System.out.println("Geen geldige invoer");
                keyboard.nextLine();
            }
            finally {
                System.out.println("Je invoer is op de juiste wijze afgehandeld");
            }
        }
    }

    public static void toonJaarInkomen(Persoon persoon) {
        System.out.printf("%s verdient %.2f per jaar\n", persoon.getNaam(), persoon.berekenJaarInkomen());
    }
}
