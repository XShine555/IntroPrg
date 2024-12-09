public class CodificaBasic {
    public static void main(String[] args) {
        System.out.println("Text?");
        String userInput = Entrada.readLine();

        System.out.println("Quants?");
        int amount = Integer.parseInt(Entrada.readLine());

        if (amount < 0) {
            System.out.println("No s'accepten números negatius");
            return;
        }

        codifica(userInput, amount);
    } 
    
    public static void codifica(String text, int quants) {
        int textLen = text.length();

        String newText = "";
        for (int i = 0; i < textLen; i++) {
            char iChar = text.charAt(i);
            char iLowerChar = Character.toLowerCase(iChar); 

            if (iLowerChar >= 65 && iLowerChar <= 122 && !Character.isUpperCase(iChar)) {
                int iNumericValue = (int)iLowerChar;
                
                int nextNumericValue = iNumericValue + quants;
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
