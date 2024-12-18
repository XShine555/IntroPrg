/*
 * Exercici 17_04. Matrícules italianes
 * Iker Rivera Garcia
 * 18/12/2024
 * Programa que comprueba si las matrículas italianas son válidas.
*/

public class MatriculaValida {
	public static void main(String[] args) {
		System.out.println("Introduïu una matrícula");
		String matricula = Entrada.readLine();

		boolean isValid = true;

		if (matricula.length() == 7) {
			String firstPart = "";
			String secondPart = "";
			String thirdPart = "";

			for (int i = 0; i < matricula.length(); i++) {
				if (i < 2) {
					firstPart += matricula.charAt(i);
				} else if (i < 5) {
					secondPart += matricula.charAt(i);
				} else if (i < 7) {
					thirdPart += matricula.charAt(i);
				}
			}

			for (int i = 0; i <= firstPart.length() -1; i++) {
				char thisChar = firstPart.charAt(i);
                if (!esLletraValidaPerMatriculaItaliana(thisChar))
                    isValid = false;
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
					if (!esLletraValidaPerMatriculaItaliana(thisChar))
                        isValid = false;
				}
			}
		}
		else {
			isValid = false;
		}

		String msg = isValid ? "És una matrícula italiana vàlida" : "No és una matrícula italiana vàlida";

		System.out.println(msg);
	}

    public static boolean esLletraValidaPerMatriculaItaliana(char thisChar) {
        return Character.isLetter(thisChar) && Character.isUpperCase(thisChar) && thisChar != 'È' && thisChar != 'É' && thisChar != 'Ç' && thisChar != 'À' && thisChar != 'Ñ' && thisChar != 'ß' && thisChar != 'I' && thisChar != 'O' && thisChar != 'Q' && thisChar != 'U';
    }
}