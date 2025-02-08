/*
 * Clase UtilTaula, contiene metodos para manipular tablas, como convertir una tabla a un string, inicializar una tabla con un valor, etc.
 */

public class UtilTaula {
    public static String taulaToString(int[][] taula) {
        String resultat = "";
        for (int i=0; i<taula.length; i++) {
            for (int j=0; j<taula[i].length; j++) {
                int value = taula[i][j];
                resultat += getSpace(value) + value;
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

    private static String getSpace(int number) {
        int length = getIntLength(number);
        String space = " ";
        for (int i = 0; i < 7 - length; i++) {
            space += " ";
        }
        return space;
    }

    private static int getIntLength(int number) {
        String value = String.valueOf(number);
        return value.length(); 
    }
}
