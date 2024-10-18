public class TrobaMesProxim {
	public static void main(String[] args) {
		System.out.println("Introdueix l'àncora");
		int ref = Integer.parseInt(Entrada.readLine());
		if (ref < 0) {
			System.out.println("Àncora no vàlida");
		}
		else {
			int valor = 0;
			int prox = 0;
			while (valor >= 0) {
				System.out.println("Introdueix un valor");
				valor = Integer.parseInt(Entrada.readLine());

				
			}
			System.out.println("El valor introduït més pròxim a " + ref + " és " + prox);
		}
	}
}
