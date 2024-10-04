public class Ascensor {
	public static void main(String[] args) {
		System.out.println("pis?");
		String pis = Entrada.readLine();
		System.out.println("botó?");
		String boto = Entrada.readLine();

		String nuevoPis = "";

		switch (pis) {
			case "planta baixa":
				nuevoPis = switch (boto) {
					case "pujar dos" -> "segon pis";
					case "pujar un" ->  "primer pis";
					default -> "error";
				};
				break;
			case "primer pis":
				nuevoPis = switch (boto) {
					case "pujar un" -> "segon pis";
					case "baixar un" -> "planta baixa";
					default -> "error";
				};
				break;
			case "segon pis":
				nuevoPis = switch (boto) {
					case "baixar un" -> "primer pis";
					case "baixar dos" -> "planta baixa";
					default -> "error";
				};
				break;
			default:
				nuevoPis = "error";
				break;
		}
		System.out.println(nuevoPis);
	}
}
