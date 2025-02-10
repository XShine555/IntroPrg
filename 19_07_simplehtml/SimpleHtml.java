public class SimpleHtml {
    public static void mostraTextAHtml(String text) {
        if (text.isEmpty())
            return;

        int indexOfStart = indexOfAny(text, new char[]{'(', '['});

        if (indexOfStart == -1) {
            System.out.format("<p>%s</p>", text);
            return;
        }
        else if (indexOfStart > 0) {
            System.out.format("<p>%s</p>", text.substring(0, indexOfStart).trim());
        }

        int indexOfEnd = indexOfAny(text, new char[]{')', ']'});
        if (indexOfEnd == -1) return;

        char startTag = text.charAt(indexOfStart);
        char endTag = text.charAt(indexOfEnd);

        if (startTag == '(') {
            System.out.print("<ol>");
        } else if (startTag == '[') {
            System.out.print("<ul>");
        }

        String insideTag = text.substring(indexOfStart + 1, indexOfEnd).trim();

        if (!insideTag.isEmpty()) {
            mostraLlista(insideTag);
        }

        if (endTag == ')') {
            System.out.print("</ol>");
        } else if (endTag == ']') {
            System.out.print("</ul>");
        }

        String leftOver = text.substring(indexOfEnd + 1);
        mostraTextAHtml(leftOver);
    }

    private static void mostraLlista(String text) {
        int comma = text.indexOf(',');

        if (comma == -1) {
            System.out.format("<li>%s</li>", text.trim());
        }
        else {
            System.out.format("<li>%s</li>", text.substring(0, comma).trim());
            mostraLlista(text.substring(comma + 1));
        }
    }

    private static int indexOfAny(String text, char[] chars) {
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < chars.length; j++) {
                if (text.charAt(i) == chars[j]) {
                    return i;
                }
            }
        }
        return -1;
    }
}
