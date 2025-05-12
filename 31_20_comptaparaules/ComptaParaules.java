import java.util.HashMap;
import java.util.Map;

public class ComptaParaules {
    private static Map<String, Integer> paraules = new HashMap<>();    

    public static void main(String[] args) {
        String[] text = Entrada.readLine().split(" ");

        for (String string : text) {
            String lowerCase = string.toLowerCase();
            
            if (paraules.containsKey(lowerCase)) {
                paraules.put(lowerCase, paraules.get(lowerCase) + 1);
            } else {
                paraules.put(lowerCase, 1);
            }
        }
    }
}
