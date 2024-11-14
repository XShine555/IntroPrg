public class LloroVocalIniFi {
	public static void main(String[] args) {
                System.out.println("Paraula?");
                String userInput = Entrada.readLine();

                while (!userInput.isBlank()) {
                        char firstChar = userInput.charAt(0);
			char lastChar = userInput.charAt(userInput.length() - 1);

			if (
				(firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u')
				&& (lastChar == 'a' || lastChar == 'e' || lastChar == 'i' || lastChar == 'o' || lastChar == 'u')
			) {
				System.out.format("Repeteixo: %s%n", userInput);
			}

                        System.out.println("Paraula?");
                        userInput = Entrada.readLine();
                }
                System.out.println("Adéu");
	}
}
