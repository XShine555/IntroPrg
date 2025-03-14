/*
 * Iker Rivera Garcia
 * 15/03/2025
 * Clase Ascensor, que tiene dos atributos, pis y posicio, y sus metodos get y set
 */

public class Ascensor {
    private int pis = -1;
    private String posicio = "aturat";
    
    public void setPis(int value) {
        if (pis >= -1 && pis <= 10)
            pis = value;
    }

    public int getPis() {
        return pis;
    }

    public void setPosicio(String value) {
        if (posicio.equals("aturat") || posicio.equals("pujant") || posicio.equals("baixant"))
            posicio = value;
    }

    public String getPosicio() {
        return posicio;
    }
}
