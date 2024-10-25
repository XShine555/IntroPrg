/*
 * Exercici 13_09. Suma valors entre dos nombres
 * Iker Rivera Garcia
 * 25/10/2024
 * Programa que le pedirá dos valores al usuario y los irá sumando hasta llegar al valor más alto introducido.
*/

public class SumaInterval {
	public static void main(String[] args) {
		System.out.println("primer?");
		int primer = Integer.parseInt(Entrada.readLine());
		System.out.println("segon?");
		int segon = Integer.parseInt(Entrada.readLine());

		int max = primer, min = segon;

		if (segon > primer) {
			max = segon;
			min = primer;
		}

		int lastValue = 0;
		for (int i = min; i <= max; i++) {
			int sum = lastValue + i;
			System.out.println(String.format("%s + %s = %s", lastValue, i, sum));
			lastValue = sum;
		}
	}
}
