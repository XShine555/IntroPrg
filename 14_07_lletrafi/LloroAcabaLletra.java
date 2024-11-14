public class LloroAcabaLletra  {
	public static void main(String[] args) {
                System.out.println("Paraula?");
                String userInput = Entrada.readLine();

                while (!userInput.isBlank()) {
			String upper = userInput.toUpperCase();
			char vocal = upper.charAt(upper.length()-1);
			boolean esVocal = vocal == 'A' || vocal == 'E' || vocal == 'I' || vocal == 'O' || vocal == 'U';
			if (!esVocal && upper.endsWith(String.valueOf(vocal))) {
				System.out.format("Repeteixo: %s%n", userInput);
			}

                        System.out.println("Paraula?");
                        userInput = Entrada.readLine();
                }
                System.out.println("Adéu");
	}
}
