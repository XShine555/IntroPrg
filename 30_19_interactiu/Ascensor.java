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
        return pis == -1;
    }

    public boolean esAdalt() {
        return pis == 10;
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

    public boolean aturat() {
        if (moviment.equals("aturt"))
            return false;
        moviment = "aturat";
        return true;
    }

    public boolean arrencaAmunt() {
        if (moviment.equals("pujant"))
            return false;
        moviment = "pujant";
        return true;
    }

    public boolean arrencaAbaix() {
        if (moviment.equals("baixant"))
            return false;
        moviment = "baixant";
        return true;
    }

    public int seguentPis() {
        if (esPujant())
            return pis + 1;
        if (esBaixant())
            return pis - 1;
        return pis;
    }
}