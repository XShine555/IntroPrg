public class TextReves {
    public static void main(String[] args) {
        System.out.println("Text?");
        String userInput = Entrada.readLine();

        String finalText = "";
        int oppositeIndex = userInput.length() - 1;
    
        for (int i = 0; i < userInput.length(); i++) {
            char currentChar = userInput.charAt(i);

            if (!Character.isLetter(currentChar))
                finalText += currentChar;
            else {
                while (!Character.isLetter(userInput.charAt(oppositeIndex))) {
                    oppositeIndex--;
                }
                finalText += userInput.charAt(oppositeIndex);
                oppositeIndex--;
            }
        }

        System.out.println(finalText);
    }    
}
