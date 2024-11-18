public class CadenaContinua {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();

        if (text.isEmpty()) {
            System.out.println("error");
        } else {
            System.out.println("Nombre?");
            int num = Integer.parseInt(Entrada.readLine());

            int textLen = text.length();

            String result = "";

            for (int i = 0; i < num; i++) {
                char iChar = text.charAt(i % textLen);
                result += iChar;
            }

            System.out.println(result);
        }
    }    
}
