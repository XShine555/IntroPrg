public class UtilTaula {
    public static char[][] substitueix(char[][] taula, char inici, char fi) {
        char[][] resultat = new char[taula.length][];
        for (int i = 0; i < taula.length; i++) {
            resultat[i] = new char[taula[i].length];
            for (int j = 0; j < taula[i].length; j++) {
                if (taula[i][j] == inici) {
                    resultat[i][j] = fi;
                } else {
                    resultat[i][j] = taula[i][j];
                }
            }
        }
        return resultat;
    }
}
