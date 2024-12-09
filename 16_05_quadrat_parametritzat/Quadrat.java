/*
 * Exercici 16_03. Quadrats modulars
 * Iker Rivera Garcia
 * 09/12/2024
 * Dibuja un cuadrado con la longitud que haya introducido el usuario.
 */

public class Quadrat {
    public static void main(String[] args) {
        dibuixaQuadrat(Integer.parseInt(args[0]));
    }

    public static void dibuixaQuadrat(int length) {
        for (int y=0; y < length; y++) {
            dibuixaLinia(length);
            System.out.println();
        }
    }

    public static void dibuixaLinia(int length) {
        for (int x = 0; x < length; x++) {
            System.out.print(" X");
        }
    }
}
