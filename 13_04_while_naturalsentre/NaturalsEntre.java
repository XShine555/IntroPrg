public class NaturalsEntre {
	public static void main(String[] args) {
		System.out.println("Valor inicial?");
		int numInicial = Integer.parseInt(Entrada.readLine());
		System.out.println("Valor final?");
		int numFinal = Integer.parseInt(Entrada.readLine());
		System.out.println("Salt?");
		int numSalto = Integer.parseInt(Entrada.readLine());

		int currentNum = 0;

		while (currentNum < numFinal) {
			currentNum += numSalto;
			System.out.println(currentNum);
		}
	}
}
