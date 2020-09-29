package model;

/**
 * Author: Mark Amerkamp (markamerkamp@gmail.com)
 * Veel plezier ermee!
 */
public class Werknemer extends Persoon {

    private static final double GRENSWAARDE_BONUS = 4500.00;
    private double maandSalaris;

    public Werknemer(String naam, String woonplaats, Afdeling afdeling, double maandSalaris) {
        super(naam, woonplaats, afdeling);
        setMaandSalaris(maandSalaris);
        this.maandSalaris = maandSalaris;
    }

    public Werknemer(String naam) {
        super(naam);
    }

    public Werknemer() {
    }

    public static double getGrenswaardeBonus() {
        return GRENSWAARDE_BONUS;
    }

    public boolean heeftRechtOpBonus() {
        if (maandSalaris > GRENSWAARDE_BONUS) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double berekenJaarInkomen() {
        return heeftRechtOpBonus() ? maandSalaris * 13: maandSalaris * 12;
    }

    @Override
    public String toString(){
        return String.format("%s en is een werknemer %s recht op een bonus.",
                super.toString(),
                heeftRechtOpBonus() ? "met" : "zonder");
    }

    public double getMaandSalaris() {
        return maandSalaris;
    }

    public void setMaandSalaris(double maandSalaris) throws IllegalArgumentException {
        if (maandSalaris <= 0) {
            throw new IllegalArgumentException("Het maandsalaris mag niet negatief zijn");
        }

        this.maandSalaris = maandSalaris;

    }
}

