/*
 * Vi.java
 * Classe Vi
 * Representa un vi amb nom, preu i estoc
 * El nom del vi no pot ser null ni buit
 * El preu i l'estoc no poden ser negatius
 */

public class Vi {
    private static final int defaultEstoc = 0;
    private static final int invalidValue = -1;
    private static final String notValidNom = "NOM NO VÀLID!";

    private String nom;
    private int preu;
    private int estoc;

    public Vi(String nom, int preu) {
        this(nom, preu, defaultEstoc);
    }

    public Vi(String nom, int preu, int estoc) {
        this.nom = normalitzaNom(nom);

        if (estoc < 0)
            estoc = invalidValue;

        if (preu < 0)
            preu = invalidValue;

        this.preu = preu;
        this.estoc = estoc;
    }

    public String getNom() {
        return nom;
    }

    public int getPreu() {
        return preu;
    }

    public void setPreu(int preu) {
        if (preu < 0)
            return;

        this.preu = preu;
    }

    public int getEstoc() {
        return estoc;
    }

    public void setEstoc(int estoc) {
        if (estoc < 0)
            return;

        this.estoc = estoc;
    }

    public boolean esValid() {
        return !nom.equals(notValidNom) && estoc != invalidValue && preu != invalidValue;
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
