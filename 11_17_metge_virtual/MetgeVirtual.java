public class MetgeVirtual {
	public static void main(String[] args) {
		System.out.println("esternuts? (sí o no)");
		String estornuda = Entrada.readLine();
		if (estornuda.equals("si") || estornuda.equals("sí")) {
			System.out.println("mal de cap? (sí o no)");
			String malDeCabeza = Entrada.readLine();
			if (malDeCabeza.equals("si") || malDeCabeza.equals("sí")) {
				System.out.println("problemes d'estómac? (sí o no)");
				String problemasDeEstomago = Entrada.readLine();
				if (problemasDeEstomago.equals("sí")) {
					System.out.println("pren paracetamol");
				}
				else {
					System.out.println("pren aspirina");
				}
			}
			else {
				System.out.println("tos? (sí o no)");
				String tos = Entrada.readLine();
				if (tos.equals("si") || tos.equals("sí")) {
					System.out.println("edat?");
					int edad = Integer.parseInt(Entrada.readLine());
					if (edad < 12) {
						System.out.println("pren un carmel de mel");
					}
					else {
						System.out.println("pren carmel d'eucaliptus");
					}
				}
				else {
					System.out.println("vine a la consulta");
				}
			}
		}
		else {
			System.out.println("tos? (sí o no)");
			String tos = Entrada.readLine();
			if (tos.equals("si") || tos.equals("sí")) {
				System.out.println("edat?");
				int edad = Integer.parseInt(Entrada.readLine());
				if (edad < 12) {
					System.out.println("pren carmel de mel");
				}
				else {
					System.out.println("pren carmel d'eucaliptus");
				}
			}
			else {
				System.out.println("vine a la consulta");
			}
		}
	}
}
