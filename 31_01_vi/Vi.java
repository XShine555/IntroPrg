public class Vi {
    private static final int defaultEstoc = 0;
    private static final String notValidNom = "NOM NO VÀLID!";

    private String nom;
    private int preu;
    private int estoc;

    public Vi(String nom, int preu) {
        this(nom, preu, defaultEstoc);
    }

    public Vi(String nom, int preu, int estoc) {
        this.nom = normalitzaNom(nom);
        setPreu(preu);
        setEstoc(estoc);
    }

    public String getNom() {
        return nom;
    }

    public int getPreu() {
        return preu;
    }

    public void setPreu(int preu) {
        if (preu < 0)
            preu = -1;

        this.preu = preu;
    }

    public int getEstoc() {
        return estoc;
    }

    public void setEstoc(int estoc) {
        if (estoc < 0)
            estoc = -1;

        this.estoc = estoc;
    }

    public boolean esValid() {
        return !nom.equals(notValidNom) || estoc != -1 || preu != -1;
    }

    public static String normalitzaNom(String nom) {
        if (nom == null || nom.isBlank()) {
            return notValidNom;
        }

        String result = "";

        for (int i = 0; i < nom.length(); i++) {
            char thisChar = nom.charAt(i);

            if (i > 0) {
                char lastChar = nom.charAt(i - 1);

                if (Character.isLetterOrDigit(thisChar)
                        || (Character.isWhitespace(thisChar) && !Character.isWhitespace(lastChar))) {
                    result += thisChar;
                }
            }
            else {
                if (Character.isLetterOrDigit(thisChar)) {
                    result += thisChar;
                }
            }
        }

        return result.trim();
    }

    @Override
    public String toString() {
        return String.format("""
                    Vi: %s
                    Preu: %d
                    Estoc: %d
                """, nom, preu, estoc);
    }
}
