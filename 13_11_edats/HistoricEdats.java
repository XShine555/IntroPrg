public class HistoricEdats {
	public static void main(String[] args) {
		System.out.println("nom?");
		String nom = Entrada.readLine();

		if (nom.isBlank()) {
			System.out.println("Entrada incorrecta");
		}
		else {
			System.out.println("edat?");
			int edat = Integer.parseInt(Entrada.readLine());

			
				System.out.println("any actual?");
				int any = Integer.parseInt(Entrada.readLine());

				if (any < 1971) {
					System.out.println("Entrada incorrecta");
				} else {
					for (int i = edat; i > 0; i--) {
						int thisAny = any - i;
						int thisEdat = edat - (any - thisAny);

						String message = switch (thisEdat) {
							case 0 -> String.format("El %s vau néixer", thisAny);
							case 1 -> String.format("El %s teníeu %s any", thisAny, thisEdat);
							default -> String.format("El %s teníeu %s anys", thisAny, thisEdat);
						};
						System.out.println(message);
					}
				}
			System.out.println("Adéu " + nom);
			}
		}
	}
