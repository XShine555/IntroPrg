public class NaturalsEntre {
	public static void main(String[] args) {
		System.out.println("Valor inicial?");
		int numInicial = Integer.parseInt(Entrada.readLine());

		System.out.println("Valor final?");
		int numFinal = Integer.parseInt(Entrada.readLine());

		System.out.println("Salt?");
		int numSalto = Integer.parseInt(Entrada.readLine());

		if (numSalto == 0 || numInicial < numInicial) {
			System.out.println("fatal");
			return;
		}

		while (numInicial <= numFinal) {
			System.out.println(numInicial);
			numInicial += numSalto;
		}
	}
}
