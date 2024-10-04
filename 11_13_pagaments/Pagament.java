public class Pagament {
	public static void main(String[] args) {
		System.out.println("Preu?");
		int preu = Integer.parseInt(Entrada.readLine());
		System.out.println("Paga?");
		int paga = Integer.parseInt(Entrada.readLine());

		int total = preu - paga;

		if (total == 0) {
			System.out.println("No sobra ni falta res");
		}
		else if (total > 0) {
			System.out.format("Falten %s€", total);
		}
		else {
			System.out.format("Sobren %s€", Math.abs(total));
		}
	}
}
