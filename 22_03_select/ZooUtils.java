import java.util.Collection;

public class ZooUtils {
    public static void mostraCategories(Collection<Categoria> categories) {
        System.out.println("Categories disponibles:");
        for (Categoria categoria : categories) {
            System.out.println("\t" + categoria);
        }
    }

    public static void mostraCategories(Categoria categoria) {
        System.out.println("Categoria disponible:");
        System.out.println("\t" + categoria);
    }
}
