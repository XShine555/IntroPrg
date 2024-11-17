/*
 * Exercici 11_13. Pagaments
 * 04/10/2024
 * Iker Rivera Garcia
 * Calcula sobre un precio si faltan, sobran o no faltan ni sobra dinero.
 */

public class Pagament {
	public static void main(String[] args) {
		System.out.println("Preu?");
		int preu = Integer.parseInt(Entrada.readLine());
		System.out.println("Paga?");
		int paga = Integer.parseInt(Entrada.readLine());

		if (preu > paga) {
			System.out.format("Falten %d€", preu - paga);
		}
		else if (preu < paga) {
			System.out.format("Sobren %d€", paga - preu);
		}
		else {
			System.out.println("No sobra ni falta res");
		}
	}
}
