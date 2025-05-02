/*
 * Iker Rivera Garcia
 * Exercici 31_01. La classe
 * Vi.java
 * Classe Vi, Representa un vi amb nom, preu i estoc
 */

public class Vi {
    private static final int DEFAULT_ESTOC = 0;
    private static final int INVALID_VALUE = -1;
    private static final String INVALID_NAME = "NOM NO VÀLID!";
    private static final char[] SPECIAL_CHARS = { '\'' };

    private String nom;
    private int preu;
    private int estoc;

    public Vi(String nom, int preu) {
        this(nom, preu, DEFAULT_ESTOC);
    }

    public Vi(String nom, int preu, int estoc) {
        this.nom = normalitzaNom(nom);

        if (estoc < 0)
            estoc = INVALID_VALUE;

        if (preu < 0)
            preu = INVALID_VALUE;

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
        return !nom.equals(INVALID_NAME) && estoc != INVALID_VALUE && preu != INVALID_VALUE;
    }

    public static String normalitzaNom(String nom) {
        if (nom == null || nom.isBlank()) {
            return INVALID_NAME;
        }

        String result = "";

        for (int i = 0; i < nom.length(); i++) {
            char thisChar = nom.charAt(i);

            if (i > 0) {
                char lastChar = nom.charAt(i - 1);

                if (Character.isLetterOrDigit(thisChar)
                        || (Character.isWhitespace(thisChar) && !Character.isWhitespace(lastChar))
                        || isSpecialChar(thisChar)) {
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

    private static boolean isSpecialChar(char character) {
        for (char specialChar : SPECIAL_CHARS) {
            if (character == specialChar) {
                return true;
            }
        }

        return false;
    }

    public String[] aArrayString() {
        return new String[] {
                this.nom,
                String.valueOf(this.preu),
                String.valueOf(this.estoc),
        };
    }

    public static Vi deArrayString(String[] array) {
        if (array.length != 3) {
            return null;
        }

        String nom = array[0];
        if (nom.isBlank()) {
            return null;
        }

        String preuString = array[1];
        int preu = 0;
        try {
            preu = Integer.parseInt(preuString);
            if (preu < 0) {
                return null;
            }
        } catch (NumberFormatException e) {
            return null;
        }

        String estocString = array[2];
        int estoc = 0;
        try {
            estoc = Integer.parseInt(estocString);
            if (estoc < 0) {
                return null;
            }
        } catch (NumberFormatException e) {
            return null;
        }

        return new Vi(nom, preu, estoc);
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
