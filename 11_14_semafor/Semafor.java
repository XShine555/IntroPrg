/*
 * Exercici 11_14. La guia de semàfors
 * 04/10/2024
 * Iker Rivera Garcia
 * Programa que dependiendo del color del semáforo dice: espera, corre, pasa o ves al oculista.
 */

public class Semafor {
	public static void main(String[] args) {
		System.out.println("Color?");
		String color = Entrada.readLine();
		if (color.equals("vermell")) {
			System.out.println("espera");
		}
		else if (color.equals("groc")) {
			System.out.println("corre!");
		}
		else if (color.equals("verd")) {
			System.out.println("passa");
		}
		else {
			System.out.println("ves a l'oculista");
		}
	}
}
