public class NaturalsEntre {
	public static void main(String[] args) {
		System.out.println("Valor inicial?");
		int numInicial = Integer.parseInt(Entrada.readLine());

		if (numInicial < 0) {
			System.out.println("Valor no vàlid");
		}
		else {
			System.out.println("Valor final?");
			int numFinal = Integer.parseInt(Entrada.readLine());

			if (numFinal <= 0 || numInicial > numFinal) {
				System.out.println("Valor no vàlid");
			}
			else {
				System.out.println("Salt?");
				int numSalto = Integer.parseInt(Entrada.readLine());

				if (numSalto <= 0) {
					System.out.println("Valor no vàlid");
				}
				else {
					for (int i = numInicial; i <= numFinal; i += numSalto) {
						System.out.println(i);
					}
				}
			}
		}
	}
}
