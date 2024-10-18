public class TrobaMaxim {
	public static void main(String[] args) {
		int maxValue = 0;

		System.out.println("Introdueix un valor");
		int value = Integer.parseInt(Entrada.readLine());

		while (value >= 0) {
			if (value > maxValue) {
				maxValue = value;
			}
			System.out.println("Introdueix un valor");
			value = Integer.parseInt(Entrada.readLine());
		}
		System.out.println("El màxim és " + maxValue);
	}
}
