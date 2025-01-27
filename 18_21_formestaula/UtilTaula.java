public class UtilTaula {
    public static String taulaToString(boolean[][] taula, char caracterTrue, char caracterFalse) {
        String resultat = "";
        for (int i=0; i<taula.length; i++) {
            for (int j=0; j<taula[i].length; j++) {
                char value = taula[i][j] ? caracterTrue : caracterFalse;
                resultat += value;
            }
            resultat += "\n";
        }
        return resultat;
    }
    
    public static boolean[][] inicialitzaPrimeraDiagonal(boolean[][] taula) {
        for (int i = 0; i < taula.length; i++) {
            for (int j = 0; j < taula[i].length; j++) {
                taula[i][j] = i == j;
            }
        }
        return taula;
    }

    public static boolean[][] inicialitzaVerticalMig(boolean[][] taula) {
        int mult = 0;
        if (taula[1].length % 2 == 0)
            mult = 1;
        int mid = taula[1].length / 2 - mult;
        for (int i = 0; i < taula.length; i++) {
            taula[i][mid] = true;
        }
        return taula;
    }

    public static boolean[][] inicialitzaHoritzontalMig(boolean[][] taula) {
        int mult = 0;
        if (taula.length % 2 == 0)
            mult = 1;
        int mid = taula.length / 2 - mult;
        for (int i = 0; i < taula[mid].length; i++) {
            taula[mid][i] = true;
        }
        return taula;
    }
}
