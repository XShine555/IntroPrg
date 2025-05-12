import java.util.HashMap;
import java.util.Map;

public class ComptaParaules {
    private static Map<String, Integer> paraules = new HashMap<>();

    public static void main(String[] args) {
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

            for (String string : paraules.keySet()) {
                System.out.printf("%s -> %d%n", string, paraules.get(string));
            }

            text = Entrada.readLine();
        }
    }
}
