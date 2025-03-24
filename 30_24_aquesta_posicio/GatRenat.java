/*
 * Iker Rivera Garcia
 * 24/03/2025
 * Clase GatRenat, que tiene dos atributos, vides y posicio, y un constructor que inicializa los atributos.
 */

 public class GatRenat {
    private int vides = 7;
    private String posicio;

    public GatRenat(int vides, String posicio) {
        setVides(vides);
        if (posicio.equals("estirat") || posicio.equals("dret") || posicio.equals("assegut"))
            setPosicio(posicio);
        else
            setPosicio("estirat");
    }
    public int getVides() { return vides; }
    public String getPosicio() { return posicio; }

    public void setVides(int vides) {
        if (vides >= 0)  {
            this.vides = vides;
        }
    }
    public void setPosicio(String posicio) {
        this.posicio = posicio;
    }
    @Override
    public String toString() { return String.format("Vides: %d. Posició: %s", vides, posicio); }
    public static void main(String[] args) {
        System.out.println(new GatRenat(7, "dret"));
    }
}