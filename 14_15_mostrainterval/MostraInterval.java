public class MostraInterval {
    public static void main(String[] args) {
        System.out.println("text?");
        String text = Entrada.readLine();
        int textLen = text.length();

        System.out.println("inici?");
        int start = Integer.parseInt(Entrada.readLine());
        start = Math.max(0, Math.min(textLen - 1, start));

        System.out.println("final?");
        int end = Integer.parseInt(Entrada.readLine());
        end = Math.max(0, Math.min(textLen - 1, end));

        for (int i = start; i <= end; i++) {
            char iChar = text.charAt(i);
            System.out.println(iChar);
        }
    }
}
