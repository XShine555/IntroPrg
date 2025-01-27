public class UtilTaula {
    public static String taulaToString(int[][] taula) {
        String resultat = "";
        for (int i=0; i<taula.length; i++) {
            for (int j=0; j<taula[i].length; j++) {
                resultat += "          " + taula[i][j];
            }
            resultat += "\n";
        }
        return resultat;
    }   

    public static void inicialitzaTaula(int[][] taula, int value) {
        for (int i = 0; i < taula.length; i++) {
            for (int j = 0; j < taula[i].length; j++) {
                taula[i][j] = value;
            }
        }
    }
}
