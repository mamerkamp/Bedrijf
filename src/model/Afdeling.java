package model;

/**
 * Author: Mark Amerkamp (markamerkamp@gmail.com)
 * Veel plezier ermee!
 */
public class Afdeling {

    private String afdelingsNaam;
    private String afdelingsPlaats;

    public Afdeling(String afdelingsNaam, String afdelingsPlaats) {
        this.afdelingsNaam = "Onbekend";
        this.afdelingsPlaats = "Onbekend";
    }

    public Afdeling() {

    }

    public String getAfdelingsNaam() {
        return afdelingsNaam;
    }

    public void setAfdelingsNaam(String afdelingsNaam) {
        this.afdelingsNaam = afdelingsNaam;
    }

    public String getAfdelingsPlaats() {
        return afdelingsPlaats;
    }

    public void setAfdelingsPlaats(String afdelingsPlaats) {
        this.afdelingsPlaats = afdelingsPlaats;
    }
}
