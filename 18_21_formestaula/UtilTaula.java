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
        int mult = taula[1].length % 2 == 0 ? 1 : 0;
        int mid = taula[1].length / 2 - mult;

        for (int i = 0; i < taula.length; i++) {
            taula[i][mid] = true;
        }
        return taula;
    }

    public static boolean[][] inicialitzaHoritzontalMig(boolean[][] taula) {
        int mult = taula.length % 2 == 0 ? 1 : 0;
        int mid = taula.length / 2 - mult;

        for (int i = 0; i < taula[mid].length; i++) {
            taula[mid][i] = true;
        }
        return taula;
    }

    public static boolean[][] inicialitzaSegonaDiagonal(boolean[][] taula) {
        for (int i = 0; i < taula.length; i++) {
            for (int j = 0; j < taula[i].length; j++) {
                taula[i][j] = i + j == taula.length - 1;
            }
        }
        return taula;
    }

    public static boolean[][] inicialitzaQuarts(boolean[][] taula) {
        taula = inicialitzaHoritzontalMig(taula);
        taula = inicialitzaVerticalMig(taula);
        
        return taula;
    }

    public static boolean[][] inicialitzaCreu(boolean[][] taula) {
        taula = inicialitzaPrimeraDiagonal(taula);
        taula = inicialitzaSegonaDiagonal(taula);

        return taula;
    }

    public static boolean[][] inicialitzaPasVianants(boolean[][] taula) {
        for (int col = 0; col < taula.length; col++){
            for (int row = 0; row < taula[col].length; row++) {
                taula[col][row] = col % 2 == 1;
            }
        }

        return taula;
    }

    public static boolean[][] inicialitzaZebra(boolean[][] taula) {
        for (int col = 0; col < taula.length; col++){
            for (int row = 0; row < taula[col].length; row++) {
                taula[col][row] = row % 2 == 1;
            }
        }

        return taula;
    }

    public static boolean[][] inicialitzaEscacs(boolean[][] taula) {
        for (int col = 0; col < taula.length; col++){
            int mult = col % 2 == 0 ? 1 : 0;
            for (int row = 0; row < taula[col].length; row++) {
                taula[col][row] = row % 2 == mult;
            }
        }

        return taula;
    }
}
