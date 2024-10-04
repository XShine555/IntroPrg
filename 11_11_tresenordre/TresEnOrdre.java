/*
 * Exercici 11_11. Tres en ordre
 * 04/10/2024
 * Iker Rivera Garcia
 * Programa que ordena tres números de menor a mayor, usando Arrays.Sort();
 */

import java.util.Arrays;

public class TresEnOrdre {
	public static void main(String[] args) {
		System.out.println("Primer?");
		int arg1 = Integer.parseInt(Entrada.readLine());
		System.out.println("Segon?");
		int arg2 = Integer.parseInt(Entrada.readLine());
		System.out.println("Tercer?");
		int arg3 = Integer.parseInt(Entrada.readLine());

		int[] intArray = {arg1, arg2, arg3};
		Arrays.sort(intArray);

		System.out.format("%d, %d i %d", intArray[0], intArray[1], intArray[2]);
	}
}
