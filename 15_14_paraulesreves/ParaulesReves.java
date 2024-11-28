public class ParaulesReves {
    public static void main(String[] args) {
        System.out.println("Text?");
        String userInput = Entrada.readLine();

        String result = "";
        String tempString = "";

        for (int i = userInput.length() - 1; i > -1; i--) {
            char iChar = userInput.charAt(i);
            tempString += iChar;

            if (Character.isWhitespace(iChar) || i == 0) {
                String thisResult = "";
                for (int j = 0; j < tempString.length(); j++) {
                    thisResult += tempString.charAt(j);
                }
                tempString = "";
                result = thisResult + " " + result;

            }
        }

        System.err.println(result);
    }    
}
