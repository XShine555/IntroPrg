/*
 * Exercici 14_09. Matrícules italianes
 * Iker Rivera Garcia
 * 15/11/2024
 * Programa que comprueba si las matrículas italianas son válidas.
*/

public class MatriculaValida {
	public static void main(String[] args) {
		System.out.println("Introduïu una matrícula");
		String matricula = Entrada.readLine();

		boolean isValid = true;

		if (matricula.length() == 7) {
			String firstPart = "";
			for (int i = 0; i < 2; i++) firstPart += matricula.charAt(i);
			String secondPart = "";
			for (int i = 2; i < 5; i++) secondPart += matricula.charAt(i);
			String thirdPart = "";
			for (int i = 5; i < 7; i++) thirdPart += matricula.charAt(i);

			for (int i = 0; i <= firstPart.length() -1; i++) {
				char thisChar = firstPart.charAt(i);
				if (!Character.isLetter(thisChar) || !Character.isUpperCase(thisChar) || thisChar == 'Ç' || thisChar == 'À' || thisChar == 'Ñ' || thisChar == 'ß' || thisChar == 'I' || thisChar == 'O' || thisChar == 'Q' || thisChar == 'U') {
					isValid = false;
				}
			}

			if (isValid) {
				for (int i = 0; i <= secondPart.length() - 1; i++) {
					if (!Character.isDigit(secondPart.charAt(i))) {
						isValid = false;
					}
				}
			}
			if (isValid) {
				for (int i = 0; i <= thirdPart.length() - 1; i++) {
					char thisChar = thirdPart.charAt(i);
					if (!Character.isLetter(thisChar) || !Character.isUpperCase(thisChar) || thisChar == 'Ç' || thisChar == 'À' || thisChar == 'Ñ' || thisChar == 'ß' || thisChar == 'I' || thisChar == 'O' || thisChar == 'Q' || thisChar == 'U') {
						isValid = false;
					}
				}
			}
		}
		else {
			isValid = false;
		}

		String msg = isValid ? "És una matrícula italiana vàlida" : "No és una matrícula italiana vàlida";

		System.out.println(msg);
	}
}
