import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ComptaParaules {
    private static Map<String, Integer> paraules = new LinkedHashMap<>();
    private static List<KeyValuePair> order = new ArrayList<>();

    private static String normalizaString(String input) {
        String result = "";
        for (char character : input.toCharArray()) {
            if (character == ','
                || character == '.'
                || character == ';'
                || character == ':'
                || character == '!'
                || character == '?'
            )
                continue;

            char newChar = switch (character){
                case 'à', 'á', 'â', 'ä' -> 'a';
                case 'è', 'é', 'ê', 'ë' -> 'e';
                case 'ì', 'í', 'î', 'ï' -> 'i';
                case 'ò', 'ó', 'ô', 'ö' -> 'o';
                case 'ù', 'ú', 'û', 'ü' -> 'u';
                case 'ç' -> 'c';
                default -> character;
            };
            newChar = Character.toLowerCase(newChar);
            result += newChar;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Ves introduint frases. Enter per finalitzar.");
        String text = Entrada.readLine();
        while (!text.isBlank()) {
            text = text.replaceAll("/  +/g", "");
            text = normalizaString(text);
            String[] split = text.split(" ");
            for (String string : split) {
                String lowerCase = string.toLowerCase().strip();
                if (lowerCase.isBlank()) {
                    continue;
                }

                if (paraules.containsKey(lowerCase)) {
                    paraules.put(lowerCase, paraules.get(lowerCase) + 1);
                } else {
                    paraules.put(lowerCase, 1);
                }

                order.add(new KeyValuePair(lowerCase, paraules.get(lowerCase)));
            }

            for (KeyValuePair kvp : order) {
                System.out.printf("%s -> %d%n", kvp.key, kvp.value);
            }
            System.out.println();
            order.clear();

            text = Entrada.readLine();
        }

        System.out.println("adéu");
    }
}
