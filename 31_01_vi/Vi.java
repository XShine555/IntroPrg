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
        this.preu = preu;
    }

    public int getEstoc() {
        return estoc;
    }

    public void setEstoc(int estoc) {
        this.estoc = estoc;
    }

    public boolean esValid() {
        return nom == notValidNom;
    }

    public static String normalitzaNom(String nom) {
        if (nom == null || nom.isBlank()) {
            return notValidNom;
        }

        String result = "";

        for (int i = 1; i < nom.length(); i++) {
            char lastChar = nom.charAt(i - 1);
            char thisChar = nom.charAt(i);

            if (Character.isLetterOrDigit(thisChar)
                    || (Character.isWhitespace(thisChar) && !Character.isWhitespace(lastChar))) {
                result += thisChar;
            }
        }

        return result;
    }
}
