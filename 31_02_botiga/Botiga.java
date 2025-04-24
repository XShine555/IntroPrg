public class Botiga {
    private static final int DEFAULT_MAX_VINS = 10;
    private Vi[] vins;

    public Botiga() {
        this(DEFAULT_MAX_VINS);
    }

    public Botiga(int maxVins) {
        this.vins = new Vi[maxVins];
    }

    public Vi afegeix(Vi vi) {
        for (int i = 0; i < vins.length; i++) {
            if (vins[i] == null) {
                vins[i] = vi;
                return vi;
            }
        }

        return null;
    }

    public Vi elimina(String nom) {
        for (int i = 0; i < vins.length; i++) {
            Vi vi = vins[i];

            if (vi != null && vi.getNom().equals(nom)) {
                vins[i] = null;
                return vi;
            }
        }

        return null;
    }

    public Vi cerca(String nom) {
        for (int i = 0; i < vins.length; i++) {
            Vi vi = vins[i];

            if (vi != null && vi.getNom().equals(nom)) {
                return vi;
            }
        }

        return null;
    }
}
