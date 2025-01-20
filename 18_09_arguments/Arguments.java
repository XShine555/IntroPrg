/*
 * Programa que verifica si los argumentos de la línea de comandos son enteros.
 */

public class Arguments {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String currentString = args[i];

            System.out.format("[%s] \"%s\": %s%n", i, currentString, UtilString.esEnter(currentString) ? "és enter" : "no és enter");
        }
    }
}