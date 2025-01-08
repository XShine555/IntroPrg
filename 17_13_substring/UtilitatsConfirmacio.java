/*
 * Exercici 17_13. Substrings
 * Iker Rivera Garcia
 * Clase que proporciona métodos para convertir respuestas de texto en valores booleanos.
*/

public class UtilitatsConfirmacio {
    public static boolean respostaABoolean(String resposta) {
        if (resposta.isBlank()) {
            return false;
        }
        resposta = resposta.toLowerCase();
        String withoutSpaces = "";

        for (int i = 0; i < resposta.length(); i++) {
            char iChar = resposta.charAt(i);
            if (!Character.isWhitespace(iChar))
                withoutSpaces += iChar;
        }
        return withoutSpaces.equals("s") || withoutSpaces.equals("y") || withoutSpaces.equals("sí") || withoutSpaces.equals("yes") || withoutSpaces.equals("si") || withoutSpaces.equals("vale") || withoutSpaces.equals("yeah");
    }
}