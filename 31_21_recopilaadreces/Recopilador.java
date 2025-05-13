import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map;

public class Recopilador {
    private Map<Adressa, List<String>> adreces = new TreeMap<>();

    private static final String SEPARADORS = "[\\s\\[{(<>})\\],;:'\"=|/\\!?]";

    public int processa(String nom, String text) {
        if (text == null)
            return 0;
        int count = 0;
        List<Adressa> trobades = new ArrayList<>();

        for (String paraula : text.split(SEPARADORS)) {
            if (Adressa.esValida(paraula)) {
                try {
                    Adressa a = Adressa.fromString(paraula);
                    if (!trobades.contains(a)) {
                        adreces.putIfAbsent(a, new ArrayList<>());
                        if (!adreces.get(a).contains(nom)) {
                            adreces.get(a).add(nom);
                        }
                        trobades.add(a);
                        count++;
                    }
                } catch (IllegalArgumentException ignored) {
                }
            }
        }

        return count;
    }

    public List<Adressa> getAdreces() {
        return new ArrayList<>(adreces.keySet());
    }

    public List<String> getNoms(Adressa a) {
        List<String> llista = new ArrayList<>(adreces.getOrDefault(a, List.of()));
        Collections.sort(llista);
        return llista;
    }
}
