import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Recopilador {
    private static final String SEPARADORS = "[\\s\\[{(<>})\\],;:'\"=|/\\!?]";
    private Map<Adressa, Set<String>> adreces = new TreeMap<>();

    public int processa(String nom, String text) {
        if (text == null)
            return 0;
        int count = 0;
        Set<Adressa> trobades = new HashSet<>();

        for (String paraula : text.split(SEPARADORS)) {
            if (Adressa.esValida(paraula)) {
                try {
                    Adressa a = Adressa.fromString(paraula);
                    if (!trobades.contains(a)) {
                        adreces.computeIfAbsent(a, k -> new TreeSet<>()).add(nom);
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
        List<String> llista = new ArrayList<>(adreces.getOrDefault(a, Set.of()));
        Collections.sort(llista);
        return llista;
    }
}
