public class LloroVocalIniciFi {
    public static void main(String[] args) {
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("El lloro demana paraula amb vocal a l'inici o/i final");
            String input = Entrada.readLine();

            if (input.isBlank()) {
                System.out.println("El lloro demana confirmació per finalitzar");
                String response = Entrada.readLine();

                if (UtilitatsConfirmacio.respostaABoolean(response))
                    break;
            }
            else {
                char firstChar = input.charAt(0);
                char lastChar = input.charAt(input.length());

                if (UtilString.esVocal(firstChar) || UtilString.esVocal(lastChar))
                    System.out.println("El lloro diu: " + input);
            }
        }
		System.out.println("Adéu");
	}
}
