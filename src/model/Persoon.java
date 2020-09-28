package model;

/**
 * Author: Mark Amerkamp (markamerkamp@gmail.com)
 * Veel plezier ermee!
 */
public abstract class Persoon {
    final static double GRENSWAARDE_BONUS = 4500.00;

    protected static String DEFAULTWAARDE_NAAM = "Onbekend";
    public static int aantalPersonen = 0;
    protected int personeelsNummer;
    protected String naam;
    protected String woonplaats;
    protected Afdeling afdeling;


    public Persoon(String naam, String woonplaats, Afdeling afdeling) {
        this.naam = naam;
        this.woonplaats = woonplaats;
        this.afdeling = afdeling;
        this.personeelsNummer = aantalPersonen++;
    }

    public Persoon(String naam) {
        this(naam, "Onbekend", new Afdeling());
    }

    public Persoon() {
        this(DEFAULTWAARDE_NAAM);
    }

    public abstract double berekenJaarInkomen();


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


    public Afdeling getAfdeling() {
        return afdeling;
    }

    public void setAfdeling(Afdeling afdeling) {
        this.afdeling = afdeling;
    }

    @Override
    public String toString() {
        return naam + " woont in " + woonplaats + " en werkt op afdeling " + afdeling;
    }
}
