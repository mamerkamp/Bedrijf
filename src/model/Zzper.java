package model;

/**
 * Author: Mark Amerkamp (markamerkamp@gmail.com)
 * Veel plezier ermee!
 */
public class Zzper extends Persoon {
    private double uurTarief;
    private int urenGewerkt;

    public Zzper(String naam, String woonplaats, Afdeling afdeling, double uurTarief) {
        super(naam, woonplaats, afdeling);
        this.uurTarief = uurTarief;
        this.urenGewerkt = 0;
    }

    public void huurIn(int uren) {
        urenGewerkt += uren;
    }

    @Override
    public String toString(){
        return String.format("%s en is een zzp-er met een uurtarief van %.2f",
                super.toString(), uurTarief);

    }

    @Override
    public double berekenJaarInkomen() {
        return urenGewerkt * uurTarief;
    }

    public double getUurTarief() {
        return uurTarief;
    }

    public void setUurTarief(double uurTarief) {
        this.uurTarief = uurTarief;
    }

    public int getUrenGewerkt() {
        return urenGewerkt;
    }

    public void setUrenGewerkt(int urenGewerkt) {
        this.urenGewerkt = urenGewerkt;
    }
}
