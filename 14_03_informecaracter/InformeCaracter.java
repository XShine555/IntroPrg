public class InformeCaracter {
	public static void main(String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();

		if (text.isBlank()) {
			System.out.println("Error");
		}
		else {
			System.out.println("Posició?");
			int pos = Integer.parseInt(Entrada.readLine());

			if (text.length() < pos || pos < 0) {
				System.out.println("Error");
			}
			else {
				char character = text.charAt(pos);

				System.out.format("Character.getName('%s'): %s%n", character, Character.getName(character));
				System.out.format("Character.isDigit('%s'): %s%n", character, Character.isDigit(character));
				System.out.format("Character.isJavaIdentifierStart('%s'): %s%n", character, Character.isJavaIdentifierStart(character));
				System.out.format("Character.isJavaIdentifierPart('%s'): %s%n", character, Character.isJavaIdentifierPart(character));
				System.out.format("Character.isLetter('%s'): %s%n", character, Character.isLetter(character));
				System.out.format("Character.isLowerCase('%s'): %s%n", character, Character.isLowerCase(character));
				System.out.format("Character.isUpperCase('%s'): %s%n", character, Character.isUpperCase(character));
				System.out.format("Character.isWhitespace('%s'): %s%n", character, Character.isWhitespace(character));
				System.out.format("Character.toLowerCase('%s'): %s%n", character, Character.toLowerCase(character));
				System.out.format("Character.toUpperCase('%s'): %s%n", character, Character.toUpperCase(character));
			}
		}
	}
}
