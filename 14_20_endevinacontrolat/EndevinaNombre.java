public class EndevinaNombre {
    public static void main(String[] args) {
        int numberArg = Integer.parseInt(Entrada.readLine());

        System.out.println("Nombre?");
        String userInput = Entrada.readLine();

        while (!userInput.isBlank()) {
            boolean isNumber = true;
            for (int i = 0; i < userInput.length(); i++) {
                char iChar = userInput.charAt(i);
                if (!Character.isDigit(iChar)) {
                    isNumber = false;
                    break;
                }
            }
            if (isNumber) {
                int number = Integer.parseInt(userInput);
                if (number > 100 || number < 1) {
                    System.out.println("Fora de rang");
                }
                else if (number > numberArg) {
                    System.out.println("Massa gran");
                }
                else {
                    System.out.println("Massa petit");
                }
            }
            else {
                System.out.println("Només nombres");
            }

            userInput = Entrada.readLine();
        }

        System.out.println("Cancel·lat!");
    }
}
