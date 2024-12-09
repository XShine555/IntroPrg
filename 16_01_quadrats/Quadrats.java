/*
 * Exercici 16_01. Molts quadrats
 * Iker Rivera Garcia
 * 09/12/2024
 * Dibuja un cuadrado 5 x 5 las veces que el usuario indique.
 */
public class Quadrats {
    public static void main(String[] args) {
        System.out.println("Quants?");
        int amount = Integer.parseInt(Entrada.readLine());

        for (int i = 0; i < amount; i++) {
            for (int y = 0; y < 5; y++) {
                for (int x = 0; x < 5; x++) {
                    System.out.print(" X");
                }
                System.out.println();
            }
            System.out.println();
        }
    }    
}
