public class CodificaBasic {
    public static void main(String[] args) {
        System.out.println("Text?");
        String userInput = Entrada.readLine();
        int textLen = userInput.length();

        String newText = "";
        for (int i = 0; i < textLen; i++) {
            char iChar = userInput.charAt(i);
            char iLowerChar = Character.toLowerCase(iChar); 

            if (iLowerChar >= 65 && iLowerChar <= 122 && !Character.isUpperCase(iChar)) {
                //char iLowerChar = Character.toLowerCase(iChar);
                int iNumericValue = (int)iLowerChar;
                
                int nextNumericValue = iNumericValue + 1;
                char nextChar = (char)(nextNumericValue);

                if (nextNumericValue > 122) {
                    nextChar = 'a';
                }

                newText += nextChar;
            }
            else {
                newText += iChar;
            }
        }
        System.out.println(newText);
    }    
}
