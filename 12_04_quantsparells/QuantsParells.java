/*
 * Exercici 12_04. Quants parell
 * Iker Rivera Garcia
 * 16/09/2024
 * Programa que le pedirá al usuario números, cuando introduzca uno negativo dejará de pedir números y pondrá la cantidad de veces que ha introducido un número par.
*/

public class QuantsParells {
	public static void main(String[] args) {
		int par = 0;
		System.out.println("Introdueix un valor");
		int valor = Integer.parseInt(Entrada.readLine());
		while (valor >= 0) {
			if (valor % 2 == 0) {
				par++;
			}
			System.out.println("Introdueix un valor");
			valor = Integer.parseInt(Entrada.readLine());
		}
		System.out.format("Nombre de parells introduïts: %s", par);
	}
}
