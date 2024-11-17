/*
 * Exercici 11_04. Exercici d'operador ternari
 * 04/10/2024
 * Iker Rivera Garcia
 * Programa que indica si el número proporcionat com a primer argument
 * és parell o senar.
 * Si no s'especifica cap número, el resultat és indeterminat.
 */
public class ParellSenar {
    public static void main(String[] args) {
        int numero = Integer.parseInt(args[0]);
        System.out.println(numero % 2 == 0 ? String.format("El número %s és parell", numero) : String.format("El número %s és senar", numero));
    }
}
