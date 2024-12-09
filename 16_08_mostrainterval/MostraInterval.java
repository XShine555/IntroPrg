/*
 * Exercici 16_08. Secció d'un String
 * Iker Rivera Garcia
 * 09/12/2024
 * Muestra un rango de caracteres de un texto.
 */

public class MostraInterval {
    public static void main(String[] args) {
        System.out.println("text?");
        String text = Entrada.readLine();
        int textLen = text.length();

        System.out.println("inici?");
        int start = Integer.parseInt(Entrada.readLine());
        start = Math.max(0, Math.min(textLen - 1, start));

        System.out.println("final?");
        int end = Integer.parseInt(Entrada.readLine());
        end = Math.max(0, Math.min(textLen - 1, end));

        mostraInterval(text, start, end);
    }

    public static void mostraInterval(String text, int inici, int fi) {
        boolean isReverse = inici > fi;

        if (isReverse) {
            for (int i = inici; i >= fi; i--) {
                System.out.println(text.charAt(i));
            }
        } else {
            for (int i = inici; i <= fi; i++) {
                System.out.println(text.charAt(i));
            }
        }
    }
}
