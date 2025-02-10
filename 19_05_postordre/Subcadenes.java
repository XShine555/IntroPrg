public class Subcadenes {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        text = cleanString(text);
        postOrdre(text);
    }
    
    public static String cleanString(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char iChar = text.charAt(i);
            if (Character.isLetter(iChar))
                result += iChar;
        }

        return result;
    }

    public static void postOrdre(String text) {
        if (text.length() <= 1) {
            System.out.printf("%4d: %s%n", text.length(), text);
            return;
        }
        int mid = text.length() / 2;
        postOrdre(text.substring(0, mid));
        postOrdre(text.substring(mid));
        System.out.printf("%4d: %s%n", text.length(), text);
    }
}
