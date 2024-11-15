public class LloroAcabaLletra  {
	public static void main(String[] args) {
                System.out.println("Paraula?");
                String userInput = Entrada.readLine();

                while (!userInput.isBlank()) {
			String upper = userInput.toUpperCase();
			char vocal = 'a';
			for (int i = upper.length()-1; i > 0; i--) {
				char charAt = upper.charAt(i);
				if (Character.isDigit(charAt)) {
					vocal = charAt;
					break;
				}
			}
//			char vocal = upper.charAt(upper.length()-1);
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
