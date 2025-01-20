/*
 * Programa que suma els enters que hi ha a la llista de valors que rep com a
 */

public class SumaEnters {
    public static void main(String[] args) {
        int[] enters = filtraEnters(args);
        int suma = sumaEnters(enters);
        System.out.println(suma);
    }

    // nombre d'enters a valors
    public static int quantsEnters(String[] valors) {
        int cont = 0;
        for (int i = 0; i < valors.length; i++) {
            if (UtilString.esEnter(valors[i])) {
                cont++;
            }
        }
        return cont;
    }

    // enters que hi ha a valors
    public static int[] filtraEnters(String[] valors) {
        int index = 0;
        int[] array = new int[quantsEnters(valors)];

        for (int i = 0; i < valors.length; i++) {
            if (UtilString.esEnter(valors[i])) {
                array[index] = Integer.parseInt(valors[i]);
                index++;
            }
        }

        return array;
    }

    // suma dels valors
    public static int sumaEnters(int[] valors) {
        int suma = 0;
        for (int i = 0; i < valors.length; i++) {
            suma += valors[i];
        }
        return suma;
    }
}
