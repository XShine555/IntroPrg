public class Subcadenes {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        preOrdre(text);
    }    

    public static void preOrdre(String s) {
        System.out.println(s.length() + ": " + s);
        if (s.length() <= 1)
            return;
        int mid = s.length() / 2;
        preOrdre(s.substring(0, mid));
        preOrdre(s.substring(mid));
    }
}
