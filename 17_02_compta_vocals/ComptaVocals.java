/*
 * Aquest programa compta i mostra les ocurrències de diverses vocals en un text donat.
 */
public class ComptaVocals {
    public static void main(String[] args) {
        System.out.println("Introdueix un text");
        String entrada = Entrada.readLine();
        mostraOcurrencies('a', quantesOcurrencies(entrada, 'a'));
        mostraOcurrencies('à', quantesOcurrencies(entrada, 'à'));
        mostraOcurrencies('e', quantesOcurrencies(entrada, 'e'));
        mostraOcurrencies('è', quantesOcurrencies(entrada, 'è'));
        mostraOcurrencies('é', quantesOcurrencies(entrada, 'é'));
        mostraOcurrencies('i', quantesOcurrencies(entrada, 'i'));
        mostraOcurrencies('í', quantesOcurrencies(entrada, 'í'));
        mostraOcurrencies('ï', quantesOcurrencies(entrada, 'ï'));
        mostraOcurrencies('o', quantesOcurrencies(entrada, 'o'));
        mostraOcurrencies('ó', quantesOcurrencies(entrada, 'ó'));
        mostraOcurrencies('ò', quantesOcurrencies(entrada, 'ò'));
        mostraOcurrencies('u', quantesOcurrencies(entrada, 'u'));
        mostraOcurrencies('ú', quantesOcurrencies(entrada, 'ú'));
        mostraOcurrencies('ü', quantesOcurrencies(entrada, 'ü'));
    }
    public static void mostraOcurrencies(char lletra, int quantes) {
        System.out.println("Nombre de '" + lletra + "'s: " + quantes);
    }
    public static int quantesOcurrencies(String text, char lletra) {
        int comptador = 0;
        for (int i=0; i < text.length(); i++) {
            if (text.charAt(i) == lletra) {
                comptador += 1;
            }
        }
        return comptador;
    }
}