/*
 * Programa que demostra diferents manipulacions amb Strings
 */
public class ManipulaString {
    public static void main(String[] args){
        System.out.println("Paraula?");
        String paraula = Entrada.readLine();

	int length = paraula.length();

        // Mostra la longitud de la paraula (quantes lletres conté)
        System.out.println("La longitud és " + paraula.length());

	if (length > 1) {
		// Mostra la segona lletra de la paraula
		System.out.format("La segona lletra és '%s'%n", paraula.charAt(1));

		// Mostra la darrera lletra de la paraula
        	System.out.format("La darrera lletra és '%s'%n", paraula.charAt(length - 1));

		// Mostra la penúltima lletra de la paraula
	        System.out.format("La penúltima lletra és '%s'%n", paraula.charAt(length - 2));
	}

	// Mostra la paraula amb totes les lletres en majúscules
        System.out.format("La paraula en majúscules és \"%s\"%n", paraula.toUpperCase());

	if (length > 3) {
			// Una composició formada per la primera lletra de la paraula en
       			// majúscules, seguida de les següents tres lletres en minúscules. Per
		 	// exemple, si la paraula és «nEkAnE», resultatà en «Neka».
			String firstFour = paraula.substring(0, 1).toUpperCase() + paraula.substring(1, 4).toLowerCase();
	        	System.out.format("La composició de quatre primeres és \"%s\"%n", firstFour);

	        	// Mostra una composició formada per la darrera lletra de la paraula,
        		// seguida de les tres primeres. (ex. si la paraula és «Nekane»
        		// mostrarà «eNek»
			String firstThreeAndLast = paraula.substring(length - 1) + firstFour.substring(0, 3);
        		System.out.format("La composició de quatre és \"%s\"%n", firstThreeAndLast);

			// Com en el cas anterior però ara corregint les majúscules i
        		// minúscules de manera que la primera sigui majúscules i la resta en
        		// minúscules.  (ex. si la paraula és «Nekane» mostrarà «Enek»)
			String firstThreeAndLastMayus = firstThreeAndLast.substring(0, 1).toUpperCase() + firstThreeAndLast.substring(1).toLowerCase();
        		System.out.format("La composició de quatre corregint majúscules és \"%s\"%n", firstThreeAndLastMayus);
		}
	}
}
