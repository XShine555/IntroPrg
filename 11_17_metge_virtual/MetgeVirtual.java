/*
 * 11_17_metge_virtual
 * Iker Rivera Garcia
 * 10/09/2024
 * Un medico virtual que te da un diagnostico dependiendo de las respuestas.
*/

public class MetgeVirtual {
	public static void main(String[] args) {
		boolean tieneEstornudos = false, tieneProblemasEstomago = false, tieneMalDeCabeza = false, tieneTos = false;

		System.out.println("esternuts? (sí o no)");
		tieneEstornudos = Entrada.readLine().equals("sí");

		if (tieneEstornudos) {
			System.out.println("mal de cap? (sí o no)");
			tieneMalDeCabeza = Entrada.readLine().equals("sí");

			if (tieneMalDeCabeza) {
				System.out.println("problemes d'estómac? (sí o no)");
				tieneProblemasEstomago = Entrada.readLine().equals("sí");

				if (tieneProblemasEstomago) {
					System.out.println("pren paracetamol");
				}
				else {
					System.out.println("pren aspirina");
				}
			}
		}
		if (!tieneMalDeCabeza) {
			System.out.println("tos? (sí o no)");
			tieneTos = Entrada.readLine().equals("sí");

			if (tieneTos) {
				System.out.println("edat?");
				int edad = Integer.parseInt(Entrada.readLine());

				if (edad < 12) {
					System.out.println("pren un carmel de mel");
				}
				else {
					System.out.println("pren un carmel d'eucaliptus");
				}
			}
		}
		if (!tieneMalDeCabeza && !tieneTos) {
			System.out.println("vine a la consulta");
		}
	}
}
