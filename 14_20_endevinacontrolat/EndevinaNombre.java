public class EndevinaNombre {
    public static void main(String[] args) {
        int numberArg = Integer.parseInt(args[0]);

        System.out.println("Nombre?");
        String userInput = Entrada.readLine();

        boolean hasWin = false;

        while (!userInput.isBlank()) {
            boolean isNumber = true;

            for (int i = 0; i < userInput.length(); i++) {
                char iChar = userInput.charAt(i);
                boolean isSymbol = iChar == '+' || iChar == '-' || iChar == '*' || iChar == '/' || iChar == '%';

                if (isSymbol && i == userInput.length() - 1) {
                    isNumber = false;
                } else if (!Character.isDigit(iChar) && !isSymbol) {
                    isNumber = false;
                } else if (i > 0) {
                    char lastChar = userInput.charAt(i - 1);
                    boolean isLastCharSymbol = lastChar == '+' || lastChar == '-' || lastChar == '*' || lastChar == '/'
                            || lastChar == '%';

                    if (isLastCharSymbol && isSymbol) {
                        isNumber = false;
                    }
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
                else if (number < numberArg) {
                    System.out.println("Massa petit");
                }
                else {
                    hasWin = true;
                    break;
                }
            }
            else {
                System.out.println("Només nombres");
            }

            System.out.println("Nombre?");
            userInput = Entrada.readLine();
        }

        String finalMsg = hasWin ? "Encertat!" : "Cancel·lat!";
        System.out.println(finalMsg);
    }
}
