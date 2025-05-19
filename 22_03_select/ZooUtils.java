import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ZooUtils {
    public static void mostraCategories(Collection<Categoria> categories) {
        if (categories.isEmpty()) {
            System.out.println("Cap categoria");
            return;
        }
        List<Categoria> categoriesList = new ArrayList<>(categories);
        categoriesList.sort((c1, c2) -> {
            boolean c1Indef = c1.idIndefinit();
            boolean c2Indef = c2.idIndefinit();

            if (c1Indef && c2Indef) 
                return 0;
            if (c1Indef) 
                return 1;
            if (c2Indef) 
                return -1;

            return Integer.compare(c1.getId(), c2.getId());
        });

        
        System.out.format("Nombre de categories: %s%n", categoriesList.size());
        for (Categoria categoria : categoriesList) {
            System.out.println("\t" + categoria);
        }
    }
}
