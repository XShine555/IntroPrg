public class TrobaMesProxim {
	public static void main(String[] args) {
		System.out.println("Introdueix l'àncora");
		int initialValue = Integer.parseInt(Entrada.readLine());

		if (initialValue < 0) {
			System.out.println("Àncora no vàlida");
		}
		else {
			int userValue = 0, nearValue = Integer.MAX_VALUE, differenceValue = Integer.MAX_VALUE;

			System.out.println("Introdueix un valor");
			userValue = Integer.parseInt(Entrada.readLine());

			if (userValue < 0) {
				System.out.println("No s'ha introduït cap valor positiu");
			}
			else {
				do {
					int difference = Math.abs(initialValue - userValue);

					if (difference <= differenceValue) {

						if (userValue < nearValue) {
							differenceValue = difference;
							nearValue = userValue;
						}
						else if (difference == differenceValue && userValue < nearValue) {
							nearValue = userValue;
						}
					}

					System.out.println("Introdueix un valor");
					userValue = Integer.parseInt(Entrada.readLine());
				}
				while (userValue > -1);

				System.out.println(String.format("El valor introduït més pròxim a %s és %s", initialValue, nearValue));
			}
		}
	}
}
