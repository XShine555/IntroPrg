/*
 * Iker Rivera Garcia
 * 15/03/2025
 * Clase GatRenat, provas amb els modificadors de accessibilitat.
 */
public class GatRenat {
    private int vides = 7;
    private String posicio = "estirat";

    public void setVides(int value) {
        vides = value;
    }

    public int getVides() {
        return vides;
    }

    public void setPosicio(String value) {
        if (value.equals("dret") || value.equals("assegut") || value.equals("estirat"))
            posicio = value;
    }

    public String getPosicio() {
        return posicio;
    }
}
