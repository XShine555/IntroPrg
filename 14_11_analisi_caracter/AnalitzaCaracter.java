public class AnalitzaCaracter {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();

        if (text.isBlank()) {
            System.out.println("Text buit");
        } else {
            System.out.println("Posició?");
            int position = Integer.parseInt(Entrada.readLine());

            int textLen = text.length();

            if (position < 0) {
                position = textLen + position;
            } else if (position > textLen) {
                position = position % textLen;
            }

            char selectedChar = text.charAt(position);

            String message = String.format("'%s' és ", selectedChar);

            if (Character.isLetter(selectedChar)) {
                String mayusOrMinus = Character.isUpperCase(selectedChar) ? "majúscula" : "minúscula";
                message += String.format("una lletra %s", mayusOrMinus);
            } else if (Character.isDigit(selectedChar)) {
                message += String.format("un dígit");
            }
            else {
                message += "una altra cosa";
            }

            System.out.println(message);
        }
    }
}