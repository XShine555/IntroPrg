public class QuantsParells {
	public static void main(String[] args) {
		int par = 0;
		for (;;) {
			System.out.println("Introdueix un valor");
			int valor = Integer.parseInt(Entrada.readLine());
			if (valor < 0) {
				break;
			}
			else if (valor % 2 == 0) {
				par++;
			}
		}
		System.out.format("Nombre de parells introduïts: %", par);
	}
}
