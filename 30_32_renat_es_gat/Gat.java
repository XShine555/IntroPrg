/*
 * Iker Rivera Garcia
 * 28/03/2025
 * Classe Gat, que representa un gat amb un nombre de vides i una posició.
 */

public class Gat {
    private int vides = 7;
    private String posicio = "estirat";

    public int getVides() {
        return vides;
    }    

    public void setVides(int vides) {
        if (vides >= 0) {
            this.vides = vides;
        } else {
            this.vides = 7;
        }
    }

    public String getPosicio() {
        return posicio;
    }

    public void setPosicio(String posicio) {
        if (posicio.equals("estirat") || posicio.equals("dret") || posicio.equals("assegut")) {
            this.posicio = posicio;
        }
    }
}
