/*
 * Aquest programa demana el nom i el primer cognom als usuaris
 * i els mostra un missatge amistós.
 *
 * El programa no controla valors no adequats d'entrada
 */
import java.util.*;

public class NomCognom {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

        // obté el nom
        System.out.println("Nom?");
        String nom = scanner.nextLine();


        // obté el cognom
        System.out.println("Primer cognom?");
        String cognom = scanner.nextLine();

        // Mostra resultat
        System.out.println("Ei " + nom + ", tinc una amiga que també és " +  cognom);
    }
}
