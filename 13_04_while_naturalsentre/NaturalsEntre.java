public class NaturalsEntre {
	public static void main(String[] args) {
		System.out.println("Valor inicial?");
		int numInicial = Integer.parseInt(Entrada.readLine());

		System.out.println("Valor final?");
		int numFinal = Integer.parseInt(Entrada.readLine());

		System.out.println("Salt?");
		int numSalto = Integer.parseInt(Entrada.readLine());

		if (numInicial < 0 || numInicial < 0 || numFinal < 0 || numInicial > numFinal ) {
			System.out.println("Valor no vàlid");
		}
		else {
			while (numInicial <= numFinal) {
				System.out.println(numInicial);
				numInicial += numSalto;
			}
		}
	}
}
