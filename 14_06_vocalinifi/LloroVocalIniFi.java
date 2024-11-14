public class LloroVocalIniFi {
	public static void main(String[] args) {
                System.out.println("Paraula?");
                String userInput = Entrada.readLine();

                while (!userInput.isBlank()) {
			String upper = userInput.toUpperCase();
			if (
			(upper.startsWith("A") || upper.startsWith("E") || upper.startsWith("I") || upper.startsWith("O") || upper.startsWith("U"))
			&& (upper.endsWith("A") || upper.endsWith("E") || upper.endsWith("I") || upper.endsWith("O") || upper.endsWith("U"))) {
				System.out.format("Repeteixo: %s%n", userInput);
			}

                        System.out.println("Paraula?");
                        userInput = Entrada.readLine();
                }
                System.out.println("Adéu");
	}
}
