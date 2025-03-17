/*
 * Iker Rivera Garcia
 * 17/03/2025
 * Clase GatRenat, clase que modela un gat amb els seus atributs i mètodes.
 */

public class GatRenat {
    private int vides = 7;
    private String posicio = "estirat";
    
    public String mor() {
        if (!esViu()) {
            return "...";
        }

        vides--;
        if (vides > 0) {
            return "auch";
        }
        else {
            return "ximpún";
        }
    }

    public String reviu() {
        return reviu(1);
    }

    //String reviu(): quan en Renat està mort, li afegeix una vida i retorna un crit d'alegria "guai!". Si no estava mort, però, retorna el típic silenci de punts suspensius "...".
    public String reviu(int i) {
        if (vides == 0) {
            vides = i;
            return "...";
        }
        else {
            return "...";
        }
    }

    public void setVides(int value) {
        if (value >= 0 && value <= 10) {
            vides = value;
        }
    }

    public void setPosicio(String value) {
        if (value.equals("seu") || value.equals("dret") || value.equals("assegut") || value.equals("estirat")) {
            posicio = value;
        }
    }

    public int getVides() {
        return vides;
    }

    public String getPosicio() {
        return posicio;
    }

    public boolean esViu() {
        return vides >= 1;
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

    public String aixecat() {
        if (posicio.equals("dret"))
            return "passo de fer res";
        posicio = "dret";
        return "ja m'aixeco";
    }
    
    public String seu() {
        if (posicio.equals("assegut"))
            return "passo de fer res";
        posicio = "assegut";
        return "ja m'assec";
    }

    public String estirat() {
        if (posicio.equals("estirat"))
            return "passo de fer res";
        posicio = "estirat";
        return "ja m'estiro";   
    }
}
