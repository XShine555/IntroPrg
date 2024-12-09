/*
 * Exercici 16_04. El lloro quadrat
 * Iker Rivera Garcia
 * 09/12/2024
 * Programa que es repite todo lo que diga el usuario acaso que ponga "dibuixa quadrat" o "dibuixa rectangle" que dibujara lo que el usuario haya pedido.
 */

public class LloroQuadrat {
    public static void main(String[] args) {
        String input = "";
        do {
            System.out.println("El lloro espera paraula:");
            input = Entrada.readLine();

            getResponse(input);
        }
        while (!input.isBlank());

        System.out.println("Adéu");
    }

    public static void getResponse(String input) {
        if (input.equals("dibuixa quadrat"))
            dibuixaQuadrat();
        else if (input.equals("dibuixa rectangle"))
            dibuixaRectangle();
        else if (!input.isBlank())
            System.out.println(String.format("El lloro repeteix: %s", input));
    }

    public static void dibuixaQuadrat() {
        for (int y=0; y < 5; y++) {
            dibuixaLiniaQuadrat();
            System.out.println();
        }
    }

    public static void dibuixaLiniaQuadrat() {
        for (int x = 0; x < 5; x++) {
            System.out.print(" X");
        }
    }

    public static void dibuixaRectangle() {
        for (int y=0; y < 5; y++) {
            dibuixaLiniaRectangle();
            System.out.println();
        }
    }

    public static void dibuixaLiniaRectangle() {
        for (int x = 0; x < 10; x++) {
            System.out.print(" X");
        }
    }
}
