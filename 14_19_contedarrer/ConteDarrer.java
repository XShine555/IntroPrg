/*
 * Exercici 14_19. Endevina amb control
 * Iker Rivera Garcia
 * 18/11/2024
 * Programa que busca la palabra final mayúscula dentro del siguiente texto.
 */

public class ConteDarrer {
    public static void main(String[] args) {
        System.out.println("Introdueix texts (enter sol per finalitzar)");
        String text = Entrada.readLine();
        char toFind = Character.MAX_VALUE;
        boolean canExit = false;

        while (!text.isBlank() && !canExit) {
            // Busca una letra mayúscula.
            if (toFind == Character.MAX_VALUE) {
                System.out.println("bé");
            }
            else {
                boolean foundAnything = false;
                for (int i = 0; i < text.length(); i++) {
                    char iChar = Character.toUpperCase(text.charAt(i));
                    if (iChar == toFind) {
                        foundAnything = true;
                    }
                }

                canExit = !foundAnything;
                if (foundAnything) {
                    System.out.println("bé");
                }
            }
            if (!canExit) {
                toFind = Character.toUpperCase(text.charAt(text.length() - 1));

                text = Entrada.readLine();
            }
        }

        System.out.println("Adéu");
    }
}