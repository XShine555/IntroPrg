/*
 * Exercici 12_10. Endevina el nombre
 * Iker Rivera Garcia
 * 28/10/2024
 * Programa que te pedirá un número del 1 al 100 hasta que encierres un número que haya elegido.
*/

public class EndevinaNombre {
	public static void main(String[] args) {
		int valorInput = 0;
		int valorPensado = Integer.parseInt(args[0]);
		System.out.println("Ves introduint enters entre 1 i 100 fins que encertis el que jo he pensat");
		while (valorPensado != valorInput) {
			System.out.println("Introdueix un valor");
			valorInput = Integer.parseInt(Entrada.readLine());

			String message;
			if (valorInput > 100) {
				message = "Com a màxim 100";
			}
			else if (valorInput < 1) {
				message = "Com a mínim 1";
			}
			else if (valorInput < valorPensado) {
				message = "És més gran que " + valorInput;
			}
			else if (valorInput > valorPensado) {
				message = "És més petit que " + valorInput;
			}
			else {
				message = "Has encertat!";
			}
			System.out.println(message);
		}
	}
}
