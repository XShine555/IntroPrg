import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ZooUtils {
    public static void mostraCategories(Collection<Categoria> categories) {
        if (categories.isEmpty()) {
            System.out.println("Cap categoria");
            return;
        }
        List<Categoria> categoriesList = List.copyOf(categories);
        Collections.sort(categoriesList, (c1, c2) -> c1.getId() - c2.getId());
        
        System.out.format("Nombre de categories: %s%n", categoriesList.size());
        for (Categoria categoria : categoriesList) {
            System.out.println("\t" + categoria);
        }
    }
}
