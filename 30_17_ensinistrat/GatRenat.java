/*
 * Iker Rivera Garcia
 * 17/03/2025
 * Clase GatRenat, clase que modela un gat amb els seus atributs i mètodes.
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

    public boolean esEstirat() {
        return posicio.equals("estirat");
    }

    public boolean esAssegut() {
        return posicio.equals("assegut");
    }

    public boolean esDret() {
        return posicio.equals("dret");
    }

    public boolean esViu() {
        return vides > 0;
    }

    public String aixecat() {
        if (posicio.equals("aixecat"))
            return "passo de fer res";
        posicio = "aixecat";
        return "ja m'aixeco";
    }
    
    public String seu() {
        if (posicio.equals("seu"))
            return "passo de fer res";
        posicio = "seu";
        return "ja m'assec";
    }

    public String estirat() {
        if (posicio.equals("estirat"))
            return "passo de fer res";
        posicio = "estirat";
        return "ja m'estiro";   
    }
}
