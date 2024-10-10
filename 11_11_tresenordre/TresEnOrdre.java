/*
 * Exercici 11_11. Tres en ordre
 * 04/10/2024
 * Iker Rivera Garcia
 * Programa que ordena tres números de menor a mayor.
 */

public class TresEnOrdre {
	public static void main(String[] args) {
		System.out.println("Primer?");
		int arg1 = Integer.parseInt(Entrada.readLine());
		System.out.println("Segon?");
		int arg2 = Integer.parseInt(Entrada.readLine());
		System.out.println("Tercer?");
		int arg3 = Integer.parseInt(Entrada.readLine());

		int num1, num2, num3;

		if (arg1 > arg2 && arg1 > arg3) {
			num1 = arg1;
			if (arg2 > arg3) {
				num2 = arg2;
				num3 = arg3;
			}
			else {
				num2 = arg3;
				num3 = arg2;
			}
		}
		else if (arg2 > arg1 && arg2 > arg3) {
			num1 = arg2;
			if (arg3 > arg1) {
				num2 = arg3;
				num3 = arg1;
			}
			else {
				num2 = arg1;
				num3 = arg3;
			}
		}
		else {
			num1 = arg3;
			if (arg1 > arg2) {
				num2 = arg1;
				num3 = arg2;
			}
			else {
				num2 = arg2;
				num3 = arg1;
			}
		}

		System.out.format("%d, %d i %d", num3, num2, num1);
	}
}
