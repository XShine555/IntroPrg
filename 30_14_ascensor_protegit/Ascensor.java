/*
 * Iker Rivera Garcia
 * 15/03/2025
 * Clase Ascensor, que tiene dos atributos, pis y moviment, y sus metodos get y set
 */

public class Ascensor {
    private int pis = -1;
    private String moviment = "aturat";
    
    public void setPis(int value) {
        if (pis >= -1 && pis <= 10)
            pis = value;
    }

    public int getPis() {
        return pis;
    }

    public void setMoviment(String value) {
        if (moviment.equals("aturat") || moviment.equals("pujant") || moviment.equals("baixant"))
            moviment = value;
    }

    public String getMoviment() {
        return moviment;
    }
}
