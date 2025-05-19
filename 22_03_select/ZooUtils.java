import java.util.Collection;

public class ZooUtils {
    public static void mostraCategories(Collection<Categoria> categories) {
        if (categories.isEmpty()) {
            System.out.println("Cap categoria");
            return;
        }

        System.out.format("Nombre de categories: %s%n", categories.size());
        for (Categoria categoria : categories) {
            System.out.println("\t" + categoria);
        }
    }
}
