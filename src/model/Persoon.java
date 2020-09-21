package model;

/**
 * Author: Mark Amerkamp (markamerkamp@gmail.com)
 * Veel plezier ermee!
 */
public class Persoon {
    final static double GRENSWAARDE_BONUS = 4500.00;

    public static int aantalPersonen = 0;
    private int personeelsNummer;
    private String naam;
    private String woonplaats;
    private double maandSalaris;


    public Persoon(String naam, String woonplaats, double maandSalaris) {
//        this(naam, woonplaats, maandSalaris);
        this.naam = naam;
        this.woonplaats = woonplaats;
        this.maandSalaris = maandSalaris;

        this.personeelsNummer = aantalPersonen++;
    }

    public Persoon(String naam) {
        this(naam, "Onbekend", 0);
        this.personeelsNummer = aantalPersonen++;
    }

    public Persoon() {
        this("Onbekend", "Onbekend", 0);
        this.personeelsNummer = aantalPersonen++;
    }

    public String heeftRechtOpBonus() {
        if (maandSalaris >= GRENSWAARDE_BONUS) {
            return "wel";
        }
        return "geen";
    }

    public double berekenJaarInkomen() {
        return maandSalaris * 12;
    }

    public int getPersoneelsNummer() {
        return personeelsNummer;
    }

    public void setPersoneelsNummer(int personeelsNummer) {
        this.personeelsNummer = personeelsNummer;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    public double getMaandSalaris() {
        return maandSalaris;
    }

    public void setMaandSalaris(double maandSalaris) {
        this.maandSalaris = maandSalaris;
    }
}
