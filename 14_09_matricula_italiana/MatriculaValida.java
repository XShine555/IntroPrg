public class MatriculaValida {
	public static void main(String[] args) {
		System.out.println("Introduïu una matrícula");
		String matricula = Entrada.readLine();

		if (matricula.length() == 7) {
			String firstPart = matricula.substring(0, 2);
			String secondPart = matricula.substring(2, 5);
			String thirdPart = matricula.substring(5, 7);

			boolean isValid = true;

			for (int i = 0; i <= firstPart.length() -1; i++) {
				if (!Character.isLetter(firstPart.charAt(i))) {
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
					if (!Character.isLetter(thirdPart.charAt(i))) {
						isValid = false;
					}
				}
			}

			String msg = isValid ? "És una matrícula italiana vàlida" : "No és una matrícula italiana vàlida";

			System.out.println(msg);
		}
		else {
			System.out.println("No és una matrícula italiana vàlida");
		}
	}
}
