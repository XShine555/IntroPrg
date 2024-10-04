/*
 * Exercici 11_01. La presó
 * 04/10/2024
 * Iker Rivera Garcia
 * Programa que recorda que els majors d'edat són responsables davant la
 * llei
 */
public class Preso {
    public static void main(String[] args) {
        System.out.println("Com us dieu?");
        String nom = Entrada.readLine();
        System.out.println("Quants anys teniu?");
        int edat = Integer.parseInt(Entrada.readLine());
        if (edat >= 18) {
		System.out.println("Vos ja podeu anar a la presó!");
        }
        System.out.println(String.format("Aneu amb compte %s", nom) );
    }
}
