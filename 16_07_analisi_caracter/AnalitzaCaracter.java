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

            if (position < 0 || position > textLen - 1) {
                position = (position % textLen + textLen) % textLen;
            }

            char selectedChar = text.charAt(position);

            analitzaCaracter(selectedChar);
        }
    }

    public static void analitzaCaracter(char caracter) {
        String message = String.format("'%s' és ", caracter);

        if (Character.isLetter(caracter)) {
            String mayusOrMinus = Character.isUpperCase(caracter) ? "majúscula" : "minúscula";
            message += String.format("una lletra %s", mayusOrMinus);
        } else if (Character.isDigit(caracter)) {
            message += String.format("un dígit");
        }
        else {
            message += "una altra cosa";
        }

        System.out.println(message);
    }
}
