/*
 * Exercici 11_02. Dos en ordre
 * 04/10/2024
 * Iker Rivera Garcia 
 * Programa que ordena dos nombres
 */
public class DosEnOrdre {
    public static void main(String[] args) {
        System.out.println("Primer?");
        int primer = Integer.parseInt(Entrada.readLine());

        System.out.println("Segon?");
	int segon = Integer.parseInt(Entrada.readLine());

	if (segon < primer) {
		System.out.println(String.format("%s i %s", segon, primer));
	}
	else {
		System.out.println(String.format("%s i %s", primer, segon) );
	}
        /* █████ compara el primer i el segon, i amb una instrucció
                 condicional amb if i else mostra el missatge
                 corresponent.
                 Pista: un dels missatges podria ser escrit amb:
                 System.out.println(primer + " i " + segon);
        */
    }
}
