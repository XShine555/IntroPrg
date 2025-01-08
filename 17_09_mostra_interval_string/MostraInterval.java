/*
 * Exercici 17_09. Secció d'un String (modular)
 * Iker Rivera Garcia
 * Muestra un rango de caracteres de un texto.
 */

 public class MostraInterval {
    public static void main(String[] args) {
        System.out.println("text?");
        String text = Entrada.readLine();
        
        System.out.println("inici?");
        int start = Integer.parseInt(Entrada.readLine());

        System.out.println("final?");
        int end = Integer.parseInt(Entrada.readLine());

        System.out.println(UtilString.intervalString(text, start, end));
    }
}
