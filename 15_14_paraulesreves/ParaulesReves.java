public class ParaulesReves {
    public static void main(String[] args) {
        System.out.println("Text?");
        String userInput = Entrada.readLine();

        for (int i = userInput.length() - 1; i > -1; i--) {
            System.out.print(userInput.charAt(i));
        }
    }    
}
