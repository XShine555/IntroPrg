import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ComptaParaules {
    private static Map<String, Integer> paraules = new LinkedHashMap<>();
    private static List<KeyValuePair> order = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Ves introduint frases. Enter per finalitzar.");
        String text = Entrada.readLine();
        while (!text.isBlank()) {
            text = text.replaceAll("/  +/g", "");
            String[] split = text.split(" ");
            for (String string : split) {
                String lowerCase = string.toLowerCase();

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

            text = Entrada.readLine();
        }

        System.out.println("adéu");
    }
}
