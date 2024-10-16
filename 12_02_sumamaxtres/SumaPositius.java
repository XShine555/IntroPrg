/*
 * Exercici 12_02. Suma com a molt tres positius
 * Iker Rivera Garcia
 * 16/09/2024
 * Programa que te pedirá tres números positivos, acaso que pongas un número negativo, en este caso ya no te pedirá el resto.
*/


public class SumaPositius {
    public static void main(String[] args) {

        // creem la variable on guardarem el resultat de sumar
        int suma = 0;   // inicialment no hem sumat res i per tant és 0

        // demanem valors

        // declarem la variable que contindrà els valors llegits
        int valor;

        // processem el primer valor
        System.out.println("Introdueix el primer valor");
        valor = Integer.parseInt(Entrada.readLine());
        if (valor >= 0) {
            suma = suma + valor;
                // processem el segon valor
        	System.out.println("Introdueix el segon valor");
        	valor = Integer.parseInt(Entrada.readLine());
        	if (valor >= 0) {
            		suma = suma + valor;
                	/* aquí el teu codi */
			System.out.println("Introdueix el tercer valor");
			valor = Integer.parseInt(Entrada.readLine());
			if (valor >= 0) {
				suma += valor;
			}
		}
	}

        // mostrem el resultat
        System.out.println("La suma és " + suma);
    }
}
