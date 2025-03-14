/*
 * Iker Rivera Garcia
 * 15/03/2025
 * Clase GatRenat, provas amb els modificadors de accessibilitat.
 */

public class GatRenat {
    private int vides = 7;
    private String posicio = "estirat";
    
    public void setVides(int value) {
        if (value >= 1 && value <= 10) {
            vides = value;
        }
    }

    public void setPosicio(String value) {
        if (value.equals("dret") || value.equals("assegut") || value.equals("estirat")) {
            posicio = value;
        }
    }

    public boolean esViu() {
        return vides > 0;
    }

    public boolean esDret() {
        return posicio.equals("dret");
    }

    public boolean esAssegut() {
        return posicio.equals("assegut");
    }

    public boolean esEstirat() {
        return posicio.equals("estirat");
    }
}