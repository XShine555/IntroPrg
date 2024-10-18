public class Estadistiques {
	public static void main(String[] args) {
		float contador = 0;
		int min = 0, max = 0, total = 0;
		for (; ;) {
			System.out.println("Introdueix un valor");
			int value = Integer.parseInt(Entrada.readLine());
			if (value < 0 || value > 100) {
				break;
			}
			if (value < min) {
				min = value;
			}
			if (value > max) {
				max = value;
			}
			contador++;
			total += value;
		}
		if (contador == 0) {
			System.out.println("Cap valor vàlid introduït");
		} else {
			System.out.println("El mínim és: " + min);
			System.out.println("La mitjana és: " + total / contador);
			System.out.println("El màxim és: " + max);
		}
	}
}
