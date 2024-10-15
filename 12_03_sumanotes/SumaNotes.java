public class SumaNotes {
	public static void main(String[] args) {
		int valor = 0;
		int suma = 0;
		while (valor >= 0 && valor <= 100) {
			System.out.println("Introdueix una nota");
			valor = Integer.parseInt(Entrada.readLine());
			suma += valor;
		}
		System.out.format("La suma de les notes vàlides és %s", suma);
	}
}
