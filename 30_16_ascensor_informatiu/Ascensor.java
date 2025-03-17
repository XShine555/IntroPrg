/*
 * Iker Rivera Garcia
 * 17/03/2025
 * Clase Ascensor, clase que modela un ascensor amb els seus atributs i mètodes.
 */

public class Ascensor {
    private int pis = -1;
    private String moviment = "aturat";

    public void setPis(int value) {
        if (value >= -1 && value <= 10)
            pis = value;
    }

    public int getPis() {
        return pis;
    }

    public void setMoviment(String value) {
        if (value.equals("aturat") || value.equals("pujant") || value.equals("baixant"))
            moviment = value;
    }

    public String getMoviment() {
        return moviment;
    }

    public boolean esAbaix() {
        return pis > 0;
    }

    public boolean esAdalt() {
        return pis < 9;
    }

    public boolean esAturat() {
        return moviment.equals("aturat");
    }

    public boolean esEnMoviment() {
        return esPujant() || esBaixant();
    }

    public boolean esPujant() {
        return moviment.equals("pujant");
    }

    public boolean esBaixant() {
        return moviment.equals("baixant");
    }

    public String comEsta() {
        return String.format("%s al pis %s", moviment, pis);
    }
}