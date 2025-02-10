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

        String insideTag = text.substring(indexOfStart + 1, indexOfEnd);
        String[] items = insideTag.split(",");

        for (int i = 0; i < items.length; i++) {
            System.out.format("<li>%s</li>", items[i].trim());
        }

        if (endTag == ')') {
            System.out.print("</ol>");
        } else if (endTag == ']') {
            System.out.print("</ul>");
        }

        String leftOver = text.substring(indexOfEnd + 1);
        mostraTextAHtml(leftOver);
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
