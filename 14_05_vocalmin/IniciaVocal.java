public class IniciaVocal {
	public static void main(String[] args) {
		System.out.println("El lloro pregunta paraula que comenci amb vocal en minúscules");
		String userInput = Entrada.readLine();

		while (!userInput.isBlank()) {
			char firstChar = userInput.charAt(0);

			switch (firstChar) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					System.out.format("El lloro diu: %s%n", userInput);
					break;
			}

			System.out.println("El lloro pregunta paraula que comenci amb vocal en minúscules");
			userInput = Entrada.readLine();
		}
		System.out.println("Adéu");
	}
}
