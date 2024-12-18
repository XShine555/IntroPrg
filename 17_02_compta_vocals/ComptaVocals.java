/*
 * Aquest programa compta i mostra les ocurrències de diverses vocals en un text donat.
 */
public class ComptaVocals {
    public static void main(String[] args) {
        System.out.println("Introdueix un text");
        String entrada = Entrada.readLine();
        mostraOcurrencies('a', quantesOcurrencies(entrada, 'a'));
        mostraOcurrencies('e', quantesOcurrencies(entrada, 'e'));
        mostraOcurrencies('i', quantesOcurrencies(entrada, 'i'));
        mostraOcurrencies('o', quantesOcurrencies(entrada, 'o'));
        mostraOcurrencies('u', quantesOcurrencies(entrada, 'u'));
        mostraOcurrencies('à', quantesOcurrencies(entrada, 'à'));
        mostraOcurrencies('è', quantesOcurrencies(entrada, 'è'));
        mostraOcurrencies('é', quantesOcurrencies(entrada, 'é'));
        mostraOcurrencies('í', quantesOcurrencies(entrada, 'í'));
        mostraOcurrencies('ï', quantesOcurrencies(entrada, 'ï'));
        mostraOcurrencies('ó', quantesOcurrencies(entrada, 'ó'));
        mostraOcurrencies('ò', quantesOcurrencies(entrada, 'ò'));
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