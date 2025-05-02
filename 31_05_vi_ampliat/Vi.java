/*
 * Iker Rivera Garcia
 * Exercici 31_01. La classe
 * Vi.java
 * Classe Vi, Representa un vi amb nom, preu i estoc
 */

public class Vi {
    private static final int DEFAULT_ESTOC = 0;
    private static final int INVALID_VALUE = -1;
    private static final String INVALID_NAME = null;
    private static final char[] SPECIAL_CHARS = { '\'' };

    private String nom;
    private int preu;
    private int estoc;

    private String ref;
    private String lloc;
    private String origen;
    private String tipus;
    private String collita;

    public Vi(
            String ref,
            String nom, 
            int preu, 
            int estoc,
            String lloc,
            String origen,
            String tipus,
            String collita
        ) {
        this.nom = normalitzaString(nom);

        if (estoc < 0)
            estoc = INVALID_VALUE;

        if (preu < 0)
            preu = INVALID_VALUE;

        this.preu = preu;
        this.estoc = estoc;

        this.ref = ref;
        this.lloc = lloc;
        this.origen = origen;
        this.tipus = tipus;
        this.collita = collita;
    }

    public String getRef() {
        return ref;
    }

    public String getLloc() {
        return lloc;
    }

    public String getOrigen() {
        return origen;
    }

    public String getTipus() {
        return tipus;
    }

    public String getCollita() {
        return collita;
    }

    public void setRef(String ref) {
        this.ref = ref;
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
        return 
            (nom != null && !nom.isBlank()) &&
            (ref != null && !ref.isBlank()) &&
            (lloc != null && !lloc.isBlank()) &&
            (origen != null && !origen.isBlank()) &&
            (tipus != null && !tipus.isBlank()) &&
            (collita != null && !collita.isBlank()) &&
            estoc != INVALID_VALUE && 
            preu != INVALID_VALUE;
    }

    public static String normalitzaString(String nom) {
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
        if (array.length != 8) {
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

        String ref = array[3];
        String lloc = array[4];
        String origen = array[5];
        String tipus = array[6];
        String collita = array[7];
        if (ref.isBlank() || lloc.isBlank() || origen.isBlank() || tipus.isBlank() || collita.isBlank()) {
            return null;
        }

        return new Vi(ref, nom, preu, estoc, lloc, origen, tipus, collita);
    }

    @Override
    public String toString() {
        return String.format("""
            
                    Ref: %s
                    Vi: %s
                    Preu: %d
                    Estoc: %d
                    Lloc: %s
                    D.O.: %s
                    Tipus: %s
                    Collita: %s
                """, ref, nom, preu, estoc, lloc, origen, tipus, collita);
    }
}
