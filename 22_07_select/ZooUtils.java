/*
 * Iker Rivera Garcia
 * 19/05/2025
 * Classe Categoria, que representa una categoria d'animal en un zoològic.
 */

import java.util.Collection;
import java.util.List;

public class ZooUtils {
    public static void mostraCategories(Collection<Categoria> categories) {
        if (categories.isEmpty()) {
            System.out.println("Cap categoria");
            return;
        }
        Categoria[] array = categories.toArray(new Categoria[0]);

        System.out.format("Nombre de categories: %s%n", array.length);
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println("\t" + array[i]);
        }
    }

    public static void mostraAnimals(List<Animal> animals) {
        if (animals.isEmpty()) {
            System.out.println("Cap animal");
            return;
        }
        Animal[] array = animals.toArray(new Animal[0]);

        System.out.format("Nombre d'animals: %s%n", array.length);
        for (Animal animal : array) {
            System.out.println("\t" + animal);
        }
    }
}
