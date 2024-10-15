public class SumaNotes {
	public static void main(String[] args) {
		int valor;
		int suma = 0;
		for (;;) {
			System.out.println("Introdueix una nota");
			valor = Integer.parseInt(Entrada.readLine());
			if (valor < 0 || valor > 100) {
				break;
			}
			suma += valor;
		}
		System.out.format("La suma de les notes vàlides és %s", suma);
	}
}
