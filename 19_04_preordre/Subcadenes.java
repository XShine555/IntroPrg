public class Subcadenes {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        preOrdre(text);
    }    

    public static void preOrdre(String text) {
        System.out.printf("%4d: %s%n", text.length(), text);
        if (text.length() <= 1)
            return;
        int mid = text.length() / 2;
        preOrdre(text.substring(0, mid));
        preOrdre(text.substring(mid));
    }
}
