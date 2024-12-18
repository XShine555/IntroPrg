/* programa que mostra quantes 'a's i 'e's té el text llegit per stdin */
public class ComptaAiEs {
    public static void main(String[] args) {
        System.out.println("Introdueix un text");
        String entrada = Entrada.readLine();
        comptaLletra(entrada, 'a');
        comptaLletra(entrada, 'e');
        comparaAiEs(entrada);
    }
    public static void comptaLletra(String text, char lletra) {
        int comptador = 0;
        for (int i=0; i < text.length(); i++) {
            if (text.charAt(i) == lletra) {
                comptador += 1;
            }
        }
        System.out.println("Nombre de '" + lletra + "'s: " + comptador);
    }

    public static void comparaAiEs(String text) {
        comparaOcurrencies(text, 'a', 'e');
    }

    public static void comparaOcurrencies(String text, char letter1, char letter2) {
        int comptadorLetter1 = 0;
        int comptadorLetter2 = 0;
        for (int i=0; i < text.length(); i++) {
            if (text.charAt(i) == letter1) {
                comptadorLetter1++;
            } else if (text.charAt(i) == letter2) {
                comptadorLetter2++;;
            }
        }
        if (comptadorLetter1 > comptadorLetter2) {
            System.out.println("Hi ha més 'a's que 'e's");
        } else if (comptadorLetter1 < comptadorLetter2) {
            System.out.println("Hi ha menys 'a's que 'e's");
        } else {
            System.out.println("Hi ha tantes 'a's com 'e's");
        }
    }
}