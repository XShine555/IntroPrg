public class DoWhile {
	public static void main(String[] args) {
		int value = 0;
		int last = 0;
		int cont = 0;
		do {
			last = value;

			System.out.println("Introdueix un valor");
			value = Integer.parseInt(Entrada.readLine());
			cont++;
		}
		while (value > last);
		System.out.println("Longitud de la següència creixent: " + cont);
	}
}
