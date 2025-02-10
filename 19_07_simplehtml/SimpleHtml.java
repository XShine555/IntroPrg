public class SimpleHtml {
    public static void mostraTextAHtml(String text) {
        mostraTextAHtml(text, false);
    }
    
    private static void mostraTextAHtml(String text, boolean inList) {
        if(text.isEmpty())
            return;
        
        int index = indexOfAny(text, new char[]{'(', '['});
        if(index == -1) {
            if(inList)
                System.out.print(text.trim());
            else
                System.out.print("<p>" + text.trim() + "</p>");
            return;
        }
        
        if(!inList) {
            System.out.print("<ol><li>");
            System.out.print(text.substring(0, index).trim());
        } else {
            System.out.print(text.substring(0, index).trim());
        }
        
        char opening = text.charAt(index);
        char closing = (opening == '(') ? ')' : ']';
        String openList = (opening == '(') ? "<ol>" : "<ul>";
        String closeList = (opening == '(') ? "</ol>" : "</ul>";
        
        int endList = text.indexOf(closing, index + 1);
        if(endList == -1)
            endList = text.length();
        
        String listContent = text.substring(index + 1, endList);
        String[] items = listContent.split(",");
        
        System.out.print(openList);
        for(String item : items) {
            if(item.isEmpty())
                continue;
            System.out.print("<li>");
            mostraTextAHtml(item, true);
            System.out.print("</li>");
        }
        System.out.print(closeList);

        if(endList + 1 < text.length())
            mostraTextAHtml(text.substring(endList + 1), inList);
        
        if(!inList) {
            System.out.print("</li></ol>");
        }
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
