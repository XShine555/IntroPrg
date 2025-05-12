/* 
 * Exemple d'ús de la classe EnvoltaString.
 * Demostra com comparar dues cadenes de text
 * i dues instàncies de la classe EnvoltaString.
*/
public class UsaEnvoltaString {
    public static void main(String[] args) {
        String nom1 = "Renat";
        String nom2 = args.length > 0 ? args[0] : "nom per defecte";
        System.out.printf("\"%s\" == \"%s\" -> %b%n", nom1, nom2, nom1 == nom2);
        System.out.printf("\"%s\".equals(\"%s\") -> %b%n", nom1, nom2, nom1.equals(nom2));

        EnvoltaString envoltaNom1 = new EnvoltaString(nom1);
        EnvoltaString envoltaNom2 = new EnvoltaString(nom2);
        System.out.printf("%s == %s -> %b%n", envoltaNom1, envoltaNom2, envoltaNom1 == envoltaNom2);
        System.out.printf("%s.equals(%s) -> %b%n", envoltaNom1, envoltaNom2, envoltaNom1.equals(envoltaNom2));
    }
}