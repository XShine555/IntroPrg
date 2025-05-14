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
        this.nom = UtilString.normalitzaString(nom);

        if (estoc < 0)
            estoc = INVALID_VALUE;

        if (preu < 0)
            preu = INVALID_VALUE;

        this.preu = preu;
        this.estoc = estoc;

        this.ref = UtilString.normalitzaString(ref);
        this.lloc = UtilString.normalitzaString(lloc);
        this.origen = UtilString.normalitzaString(origen);
        this.tipus = UtilString.normalitzaString(tipus);
        this.collita = UtilString.normalitzaString(collita);
    }

    public String getRef() {
        return ref;
    }

    public String getLloc() {
        return this.lloc;
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

    public void setLloc(String value) throws IllegalArgumentException {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("El lloc no pot ser null o buit");
        }

        value = UtilString.normalitzaString(value);
        if (value == null)
            return;

        this.lloc = value;
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

    public static boolean esValid(
        String ref,
        String nom,
        int preu,
        int estoc,
        String lloc,
        String origen,
        String tipus,
        String collita
    ) {
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

    public String[] aArrayString() {
        return new String[] {
                this.ref,
                this.nom,
                String.valueOf(this.preu),
                String.valueOf(this.estoc),
                this.lloc,
                this.origen,
                this.tipus,
                this.collita,
        };
    }

    public static Vi deArrayString(String[] array) {
        if (array.length != 8) {
            return null;
        }

        String ref = array[0];
        if (ref.isBlank()) {
            return null;
        }

        String nom = array[1];
        if (nom.isBlank()) {
            return null;
        }

        String preuString = array[2];
        int preu = 0;
        try {
            preu = Integer.parseInt(preuString);
            if (preu < 0) {
                return null;
            }
        } catch (NumberFormatException e) {
            return null;
        }

        String estocString = array[3];
        int estoc = 0;
        try {
            estoc = Integer.parseInt(estocString);
            if (estoc < 0) {
                return null;
            }
        } catch (NumberFormatException e) {
            return null;
        }

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
                    Nom: %s
                    Preu: %d
                    Estoc: %d
                    Lloc: %s
                    D.O.: %s
                    Tipus: %s
                    Collita: %s
                """, ref, nom, preu, estoc, lloc, origen, tipus, collita);
    }
}
