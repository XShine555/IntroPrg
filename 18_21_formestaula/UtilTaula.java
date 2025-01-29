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
    
    public static void inicialitzaPrimeraDiagonal(boolean[][] taula) {
        for (int i = 0; i < taula.length; i++) {
            for (int j = 0; j < taula[i].length; j++) {
                taula[i][j] = i == j;
            }
        }
    }

    public static void inicialitzaSegonaDiagonal(boolean[][] taula) {
        for (int i = 0; i < taula.length; i++) {
            int j = taula[i].length - 1 - i;
            if (j >= 0 && j < taula[i].length) {
                taula[i][j] = true;
            }
        }
    }

    public static void inicialitzaHoritzontalMig(boolean[][] taula) {
        if (taula.length < 1 || taula[0].length < 1)
            return;

        int mult = 0;
        if (taula.length % 2 == 0)
            mult = 1;

        int midRow = taula.length / 2 - mult;

        for (int j = 0; j < taula[0].length; j++) {
            taula[midRow][j] = true;
        }
    }

    public static void inicialitzaVerticalMig(boolean[][] taula) {
        if (taula.length < 1 || taula[0].length < 1)
            return;

        int mult = 0;
        if (taula[0].length % 2 == 0)
            mult = 1;

        int midCol = taula[0].length / 2 - mult;

        for (int i = 0; i < taula.length; i++) {
            taula[i][midCol] = true;
        }
    }

    public static void inicialitzaQuarts(boolean[][] taula) {
        inicialitzaHoritzontalMig(taula);
        inicialitzaVerticalMig(taula);
    }

    public static void inicialitzaCreu(boolean[][] taula) {
        inicialitzaPrimeraDiagonal(taula);
        inicialitzaSegonaDiagonal(taula);
    }

    public static void inicialitzaPasVianants(boolean[][] taula) {
        for (int col = 0; col < taula.length; col++){
            for (int row = 0; row < taula[col].length; row++) {
                taula[col][row] = col % 2 == 1;
            }
        }
    }

    public static void inicialitzaZebra(boolean[][] taula) {
        for (int col = 0; col < taula.length; col++){
            for (int row = 0; row < taula[col].length; row++) {
                taula[col][row] = row % 2 == 1;
            }
        }
    }

    public static void inicialitzaEscacs(boolean[][] taula) {
        for (int col = 0; col < taula.length; col++){
            int mult = col % 2 == 0 ? 1 : 0;
            for (int row = 0; row < taula[col].length; row++) {
                taula[col][row] = row % 2 == mult;
            }
        }
    }
}
