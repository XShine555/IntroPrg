public class SimpleHtml {
    public static void mostraTextAHtml(String text) {
        if (text.isEmpty())
            return;
        text.replace(" ", "");

        int index = indexOfAny(text, new char[]{'(', '['});
        if (index == -1) {
            System.out.print("<p>" + text.trim() + "</p>");
            return;
        }

        if (index > 0)
            System.out.print("<p>" + text.substring(0, index).trim() + "</p>");

        char opening = text.charAt(index);
        char closing = (opening == '(') ? ')' : ']';
        String openList = (opening == '(') ? "<ol>" : "<ul>";
        String closeList = (opening == '(') ? "</ol>" : "</ul>";
        System.out.print(openList);

        int endList = text.indexOf(closing, index + 1);
        if (endList == -1) {
            endList = text.length();
        }
        
        String listContent = text.substring(index + 1, endList);
        
        String[] items = listContent.split(",");
        for (String item : items) {
            System.out.print("<li>" + item.trim() + "</li>");
        }
        System.out.print(closeList);

        if (endList + 1 < text.length())
            mostraTextAHtml(text.substring(endList + 1));
    }

    private static int indexOfAny(String text, char[] chars) {
        int min = Integer.MAX_VALUE;
        for (char c : chars) {
            int i = text.indexOf(c);
            if (i != -1 && i < min)
                min = i;
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
