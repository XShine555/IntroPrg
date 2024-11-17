/*
 * Exercici 14_10. Matrícules italianes (ampliació)
 * Iker Rivera Garcia
 * 15/11/2024
 * Programa que comprueba si las matrículas italianas son válidas.
*/

public class MatriculaValidaAmpliada {

	public static void main(String[] args) {
		System.out.println("Introduïu una matrícula");
		String matricula = Entrada.readLine();

		int matriculaLength = matricula.length();

		if (matriculaLength > 7) {
			System.out.println("No és una matrícula italiana vàlida: massa llarga");
		} else if (matriculaLength < 7) {
			System.out.println("No és una matrícula italiana vàlida: massa curta");
		} else {
			String firstPart = matricula.substring(0, 2);
			String secondPart = matricula.substring(2, 5);
			String thirdPart = matricula.substring(5, 7);

			boolean isValid = true;

			for (int i = 0; i <= firstPart.length() - 1; i++) {
				char thisChar = firstPart.charAt(i);
				if (!Character.isLetter(thisChar) || !Character.isUpperCase(thisChar) || thisChar == 'Ç'
						|| thisChar == 'À' || thisChar == 'Ñ' || thisChar == 'ß' || thisChar == 'I' || thisChar == 'O'
						|| thisChar == 'Q' || thisChar == 'U') {
					isValid = false;
					break;
				}
			}

			if (isValid) {
				for (int i = 0; i <= secondPart.length() - 1; i++) {
					if (!Character.isDigit(secondPart.charAt(i))) {
						isValid = false;
						break;
					}
				}
			}
			if (isValid) {
				for (int i = 0; i <= thirdPart.length() - 1; i++) {
					char thisChar = thirdPart.charAt(i);
					if (!Character.isLetter(thisChar) || !Character.isUpperCase(thisChar) || thisChar == 'Ç'
							|| thisChar == 'À' || thisChar == 'Ñ' || thisChar == 'ß' || thisChar == 'I'
							|| thisChar == 'O' || thisChar == 'Q' || thisChar == 'U') {
						isValid = false;
						break;
					}
				}
			}

			String msg = isValid ? "És una matrícula italiana vàlida" : "No és una matrícula italiana vàlida";

			System.out.println(msg);

			// Ampliación

			for (int i = 0; i <= firstPart.length() - 1; i++) {
				char thisChar = firstPart.charAt(i);

				if (!Character.isLetter(thisChar)) {
					System.out.format("%s: Ha de ser una lletra%n", thisChar);
				} else if (!Character.isUpperCase(thisChar)) {
					System.out.format("%s: Ha de ser majúscula%n", thisChar);
				} else if (thisChar == 'Ç' || thisChar == 'À' || thisChar == 'Ñ' || thisChar == 'ß' || thisChar == 'I'
						|| thisChar == 'O' || thisChar == 'Q' || thisChar == 'U') {
					System.out.format("%s: No és una lletra vàlida%n", thisChar);
				} else {
					System.out.format("%s: Correcte%n", thisChar);
				}
			}

			for (int i = 0; i <= secondPart.length() - 1; i++) {
				char thisChar = secondPart.charAt(i);

				if (!Character.isDigit(thisChar)) {
					System.out.format("%s: Ha de ser un dígit%n", thisChar);
				} else {
					System.out.format("%s: Correcte%n", thisChar);
				}
			}

			for (int i = 0; i <= thirdPart.length() - 1; i++) {
				char thisChar = thirdPart.charAt(i);

				if (!Character.isLetter(thisChar)) {
					System.out.format("%s: Ha de ser una lletra%n", thisChar);
				} else if (!Character.isUpperCase(thisChar)) {
					System.out.format("%s: Ha de ser majúscula%n", thisChar);
				} else if (thisChar == 'Ç' || thisChar == 'À' || thisChar == 'Ñ' || thisChar == 'ß' || thisChar == 'I'
						|| thisChar == 'O' || thisChar == 'Q' || thisChar == 'U') {
					System.out.format("%s: No és una lletra vàlida%n", thisChar);
				} else {
					System.out.format("%s: Correcte%n", thisChar);
				}
			}
		}
	}
}
