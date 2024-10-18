public class TrobaMesProxim {
	public static void main(String[] args) {
		System.out.println("Introdueix l'àncora");
		int ref = Integer.parseInt(Entrada.readLine());
		if (ref < 0) {
			System.out.println("Àncora no vàlida");
		}
		else {
			int valor = 0;
			int prox = -1;
			while (valor >= 0) {
				System.out.println("Introdueix un valor");
				valor = Integer.parseInt(Entrada.readLine());

				if (valor < 0 && prox == -1) {
					System.out.println("No s'ha introduït cap valor positiu");
				}
				if (prox == -1) {
					prox = valor;
				}
				else if ( (Math.abs(ref-valor) < prox) && valor >= 0 ) {
					prox = valor;
				}
			}
			System.out.println("El valor introduït més pròxim a " + ref + " és " + prox);
		}
	}
}
