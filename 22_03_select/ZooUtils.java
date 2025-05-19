import java.util.Collection;

public class ZooUtils {
    public static void mostraCategories(Collection<Categoria> categories) {
        if (categories.isEmpty()) {
            System.out.println("Cap categoria");
            return;
        }
        Categoria[] array = categories.toArray(new Categoria[0]);

        System.out.format("Nombre de categories: %s%n", array.length);
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println("  " + array[i]);
        }
    }
}
