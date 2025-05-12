import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ComptaParaules {
    private static Map<String, Integer> paraules = new LinkedHashMap<>();

    public static void main(String[] args) {
        System.out.println("Ves introduint frases. Enter per finalitzar.");
        String text = Entrada.readLine();
        while (!text.isBlank()) {
            String[] split = text.split(" ");
            for (String string : split) {
                String lowerCase = string.toLowerCase();

                if (paraules.containsKey(lowerCase)) {
                    paraules.put(lowerCase, paraules.get(lowerCase) + 1);
                } else {
                    paraules.put(lowerCase, 1);
                }
            }

            for (Map.Entry<String, Integer> entry : paraules.entrySet()) {
                System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
            }

            text = Entrada.readLine();
        }
        System.out.println("adéu");
    }
}
