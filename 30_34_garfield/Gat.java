public class Gat {
    private String nom;
    private int vides = 7;
    private String posicio = "estirat";

    public Gat() {
        this.nom = "anònim";
    }

    public Gat(String nom) {
        this.nom = nom;   
    }

    public Gat(String nom, int vides) {
        this.nom = nom;
        this.vides = vides;
    }

    public Gat(String nom, String posicio) {
        this.nom = nom;
        this.posicio = posicio;
    }

    public Gat(String nom, int vides, String posicio) {
        this.nom = nom;
        this.vides = vides;
        this.posicio = posicio;
    }

    public String getNom() {
        return nom;
    }

    public int getVides() {
        return vides;
    }

    public void setVides(int value) {
        if (value >= 0 && value <= 10)
            vides = value;
    }

    public String getPosicio() {
        return posicio;
    }

    public void setPosicio(String value) {
        if (value.equals("dret") || value.equals("assegut") || value.equals("estirat"))
            posicio = value;
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
