public class Semafor {
	public static void main(String[] args) {
		System.out.println("Color?");
		String color = Entrada.readLine();
		if (color.equals("vermell")) {
			System.out.println("espera");
		}
		else if (color.equals("groc")) {
			System.out.println("corre!");
		}
		else {
			System.out.println("passa");
		}
	}
}
