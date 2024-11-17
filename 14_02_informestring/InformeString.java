/*
 * Exercici 14_02. Informe d'un String
 * Iker Rivera Garcia
 * 15/11/2024
 * Programa que muestra información sobre el texto introducido.
*/

public class InformeString {
	public static void main(String[] args) {
		System.out.println("Text principal?");
		String textoPrincipal = Entrada.readLine();

		System.out.println("Text secundari?");
		String textoSecundario = Entrada.readLine();

		System.out.println("Número positiu?");
		int numPos = Integer.parseInt(Entrada.readLine());

		System.out.format("\"%s\".length(): %s%n", textoPrincipal, textoPrincipal.length());
		System.out.format("\"%s\".startsWith(\"%s\"): %s%n", textoPrincipal, textoSecundario, textoPrincipal.startsWith(textoSecundario));
		System.out.format("\"%s\".endsWith(\"%s\"): %s%n", textoPrincipal, textoSecundario, textoPrincipal.endsWith(textoSecundario));
		System.out.format("\"%s\".equals(\"%s\"): %s%n", textoPrincipal, textoSecundario, textoPrincipal.equals(textoSecundario));
		System.out.format("\"%s\".equalsIgnoreCase(\"%s\"): %s%n", textoPrincipal, textoSecundario, textoPrincipal.equalsIgnoreCase(textoSecundario));
		System.out.format("\"%s\".isBlank(): %s%n", textoPrincipal, textoPrincipal.isBlank());
		System.out.format("\"%s\".isEmpty(): %s%n", textoPrincipal, textoPrincipal.isEmpty());
		System.out.format("\"%s\".charAt(%s): %s%n", textoPrincipal, numPos, textoPrincipal.charAt(numPos));
		System.out.format("\"%s\".concat(\"%s\"): %s%n", textoPrincipal, textoSecundario, textoPrincipal.concat(textoSecundario));
		System.out.format("\"%s\".repeat(%s): %s%n", textoPrincipal, numPos, textoPrincipal.repeat(numPos));
		System.out.format("\"%s\".toUpperCase(): %s%n", textoPrincipal, textoPrincipal.toUpperCase());
		System.out.format("\"%s\".toLowerCase(): %s%n", textoPrincipal, textoPrincipal.toLowerCase());
	}
}
