public class Gat implements EsserViu {
    private static final int VIDES_INICIALS = 7;
    private static final String NOM_INICIAL = "anònim";

    private int vides = VIDES_INICIALS;
    private String nom = NOM_INICIAL;

    public Gat(String nom) {
        this(nom, VIDES_INICIALS);
    }

    public Gat(String nom, int vides) {
        if (nom != null && !nom.isBlank()) {
            this.nom = nom;   
        }
        this.vides = vides;
    }

    public String getNom() {
        return this.nom;
    }

    public int getVides() {
        return this.vides;
    }

    public void setVides(int vides) {
        this.vides = vides;
    }

    @Override
    public boolean esViu() {
        return this.vides > 0;
    }

    @Override
    public String mor() {
        int nextVides = this.vides - 1;
        if (nextVides> 0) {
            this.vides = nextVides;
            return "adéu món cruel";
        } else {
            return "ja l'he espifiada";
        }
    }

    @Override
    public String reviu() {
        if (this.vides < VIDES_INICIALS) {
            this.vides++;
            return "encara miolo";
        } else {
            return "guai!";
        }
    }
}
