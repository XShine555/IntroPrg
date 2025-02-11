/*
 * Iker Rivera Garcia
 * 11/02/2025
 * 19_07_simplehtml
 * Clase SimpleHtml, se encarga de convertir un texto a HTML valido atraves de la función muestraTextAHtml, que recibe un texto y lo convierte a HTML valido usando recursión y funciones auxiliares.
 */

public class SimpleHtml {
    public static void mostraTextAHtml(String text) {
        mostraTextAHtml(text, false);
    }

    public static void mostraTextAHtml(String text, boolean inList) {
        if (text.isEmpty())
            return;

        char firstCharacter = text.charAt(0);
        if (firstCharacter == '(' || firstCharacter == '[') {
            char closing = (firstCharacter == '(') ? ')' : ']';
            int closeTag = findMatching(text, 1, 1, firstCharacter, closing);
            
            if (closeTag == -1) {
                char last = text.charAt(text.length() - 1);
                closeTag = (last == ')' || last == ']') ? text.length() - 1 : text.length();
            }

            String listContent = text.substring(1, closeTag);
            if (firstCharacter == '(') {
                System.out.print("<ol>");
                processList(listContent);
                System.out.print("</ol>");
            } else {
                System.out.print("<ul>");
                processList(listContent);
                System.out.print("</ul>");
            }
            
            int nextPosition = closeTag + 1;
            if (nextPosition < text.length())
                mostraTextAHtml(text.substring(nextPosition), inList);
        } else {
            int nextIndex = findNextDelim(text, 0);
            String left = text.substring(0, nextIndex).trim();
            
            if (!left.isEmpty()) {
                if (inList)
                    System.out.print(left);
                else
                    System.out.format("<p>%s</p>", left);
            }
            
            if (nextIndex < text.length())
                mostraTextAHtml(text.substring(nextIndex), inList);
        }
    }

    private static void processList(String text) {
        if (text.isEmpty())
            return;
        int commaIndex = findComma(text, 0);
        if (commaIndex == -1) {
            System.out.print("<li>");
            mostraTextAHtml(text, true);
            System.out.print("</li>");
        } else {
            String item = text.substring(0, commaIndex);
            String rest = text.substring(commaIndex + 1);
            System.out.print("<li>");
            mostraTextAHtml(item, true);
            System.out.print("</li>");
            processList(rest);
        }
    }

    private static int findNextDelim(String text, int pos) {
        if (pos >= text.length())
            return text.length();
        char currentCharacter = text.charAt(pos);
        if (currentCharacter == '(' || currentCharacter == '[')
            return pos;
        return findNextDelim(text, pos + 1);
    }

    private static int findComma(String text, int pos) {
        if (pos >= text.length())
            return -1;
        char currentCharacter = text.charAt(pos);
        if (currentCharacter == '(' || currentCharacter == '[') {
            char closing = (currentCharacter == '(') ? ')' : ']';
            int match = findMatching(text, pos + 1, 1, currentCharacter, closing);
            pos = (match == -1) ? text.length() - 1 : match;
            return findComma(text, pos + 1);
        } else if (currentCharacter == ',') {
            return pos;
        }
        return findComma(text, pos + 1);
    }

    private static int findMatching(String text, int index, int count, char open, char close) {
        if (index >= text.length())
            return -1;
        char currentCharacter = text.charAt(index);
        if (currentCharacter == open)
            count++;
        else if (currentCharacter == close)
            count--;
        if (count == 0)
            return index;
        return findMatching(text, index + 1, count, open, close);
    }
}