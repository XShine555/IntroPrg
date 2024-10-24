public class NaturalsEntre {
	public static void main(String[] args) {
		System.out.println("Valor inicial?");
		String stringInicial = Entrada.readLine();
		int numInicial = Integer.parseInt(stringInicial);
		System.out.println("Valor final?");
		String stringFinal = Entrada.readLine();
		int numFinal = Integer.parseInt(stringFinal);
		System.out.println("Salt?");
		int numSalto = Integer.parseInt(Entrada.readLine());

		while (numInicial <= numFinal) {
			System.out.println(numInicial);
			numInicial += numSalto;
		}
	}
}
