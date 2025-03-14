/*
 * Iker Rivera Garcia
 * 15/03/2025
 * Clase Ascensor, que tiene dos atributos, pis y moviment, y sus metodos get y set
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
}
