public class TrobaMaxim {
	public static void main(String[] args) {
		int maxValue = 0;
		for (; ;) {
			System.out.println("Introdueix un valor");
			int input = Integer.parseInt(Entrada.readLine());
			if (input < 0) {
				break;
			}
			if (input > maxValue) {
				maxValue = input;
			}
		}
		System.out.println("El màxim és " + maxValue);
	}
}
