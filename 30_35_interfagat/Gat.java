public class Gat implements EsserViu {
    private int vides = 7;
    private String nom = "anònim";

    public Gat(String nom) {
        this(nom, 7);
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

    public boolean esViu() {
        return this.vides != 0;
    }

    public String mor() {
        int nextVides = this.vides - 1;
        if (nextVides >= 0) {
            this.vides = nextVides;
            return "adéu món cruel";
        } else {
            this.vides = 0;
            return "ja l'he espifiada";
        }
    }

    public String reviu() {
        if (this.vides <= 0) {
            this.vides++;
            return "guai!";
        } else {
            return "encara miolo";
        }
    }
}
