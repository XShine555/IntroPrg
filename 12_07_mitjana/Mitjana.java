public class Mitjana {
	public static void main(String[] args) {
		int contador = 0;
		int total = 0;
		for (; ;) {
			System.out.println("Introdueix un valor");
			int value = Integer.parseInt(Entrada.readLine());
			if (value < 0 || value > 100) {
				break;
			}
			contador++;
			total += value;
		}
		if (contador == 0) {
			System.out.println("Cap nota vàlida introduïda");
		}
		else {
			float value = total / contador;
			System.out.format("La mitjana de les notes vàlides és %s", value);
		}
	}
}
