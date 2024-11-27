public class TriangleParaules {
    public static void main(String[] args) {
        System.out.println("Text?");
        String userInput = Entrada.readLine();

        int inputLen = userInput.length();

        String tempText = "";
        int maxIndex = 0, currentIndex = 0;

        for (int i = 0; i < inputLen; i++) {
            char iChar = userInput.charAt(i);

            if (Character.isWhitespace(iChar) && currentIndex < maxIndex) {

                if (currentIndex < maxIndex) {
                    tempText = "";
                    maxIndex++;
                    currentIndex = 0;
                } else {
                    
                }
            }
            else {
                tempText += userInput.charAt(iChar);
            }
        }
    }
}
