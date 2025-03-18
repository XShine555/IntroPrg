/*
 * Iker Rivera Garcia
 * 15/03/2025
 * Classe UsaAscensor, classe que interactua amb l'usuari per a provar la classe Ascensor.
 */

 public class UsaAscensor {
    public static int llegeixEnter() {
        String resposta = Entrada.readLine();
        if (! UtilString.esEnter(resposta)) {
            return -2;
        }
        return Integer.parseInt(resposta);
    }
    public static void main(String[] args) {
        Ascensor ascensor = new Ascensor();

        System.out.println("Pis inicial");
        ascensor.setPis(llegeixEnter());
        System.out.printf("Inicialment l'ascensor està aturat al pis %s%n", ascensor.getPis());

        // aturat a pujant
        boolean resposta = ascensor.arrencaAmunt();
        System.out.printf("En arrencar amunt l'ascensor respon %b i està pujant al pis %s%n",
                resposta, ascensor.getPis());

        // demanem que baixi sense aturar
        resposta = ascensor.arrencaAmunt();
        System.out.printf("En arrencar a baix l'ascensor respon %b i està pujant al pis %s%n",
                resposta, ascensor.getPis());

        // passem del pis indicat al la planta baixa
        System.out.println("Anant a la planta baixa quan està " + ascensor.comEsta());
        while (! ascensor.esAdalt()) {
            ascensor.seguentPis();       // passa al següent pis
            System.out.println("\t ara està pujant al pis "+ ascensor.getPis());
        }
        
        ascensor.arrencaAbaix();
        while (! ascensor.esAbaix()) {
            ascensor.seguentPis();       // passa al següent pis
            System.out.println("\t ara està baixant al pis "+ ascensor.getPis());
        }

        ascensor.aturat();
        System.out.printf("Està %s. Final de trajecte!%n", ascensor.comEsta());
    }
}