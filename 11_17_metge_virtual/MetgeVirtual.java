public class MetgeVirtual {
	public static void main(String[] args) {
		System.out.println("esternuts? (sí o no)");
		String estornuda = Entrada.readLine();
		if (estornuda.equals("si") || estornuda.equals("sí")) {
			System.out.println("mal de cap? (sí o no)");
			String malDeCabeza = Entrada.readLine();
			if (malDeCabeza.equals("si") || malDeCabeza.equals("sí")) {
				System.out.println("problemes d'estòmac? (sí o no)");
				String problemasDeEstomago = Entrada.readLine();
				if (problemasDeEstomago.equals("sí")) {
					System.out.println("pren àcid acetil salicílic");
				}
				else {
					System.out.println("pren una aspirina.");
				}
				return;
			}
		}
		else {
			System.out.println("tos? (sí o no)");
			String tos = Entrada.readLine();
			if (tos.equals("si") || tos.equals("sí")) {
				System.out.println("edad?");
				int edad = Integer.parseInt(Entrada.readLine());
				if (edad > 12) {
					System.out.println("pren un caramel de mel");
				}
				else {
					System.out.println("caramel d’eucaliptus");
				}
			}
		}
	}
}
