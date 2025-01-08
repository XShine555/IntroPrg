/*
 * Exercici 17_07. Només lletres (amb mòduls)
 * Iker Rivera Garcia
 * Programa que junta las palabras con ","
 */
public class NomesLletres{
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        String nomesLletres = UtilString.nomesLletres(text);
        String separades = UtilString.lletresSeparades(nomesLletres);
        System.out.println(separades);
    }
}