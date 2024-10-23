public class TrobaMesProxim {
	public static void main(String[] args) {
		System.out.println("Introdueix l'àncora");
		int ref = Integer.parseInt(Entrada.readLine());
		if (ref < 0) {
			System.out.println("Àncora no vàlida");
		}
		else {
			int valor = 0;
			int prox = Integer.MAX_VALUE;
			do {
				System.out.println("Introdueix un valor");
				valor = Integer.parseInt(Entrada.readLine());

				if (valor >= 0 && Math.abs(ref - valor) < prox) {
					prox = valor;
				}
			}
			while (valor >= 0);

			String message = "El valor introduït més pròxim a " + ref + " és " + prox;
			if (valor < 0 && prox == Integer.MAX_VALUE) {
				message = "No s'ha introduït cap valor positiu";
			}
			System.out.println(message);
		}
	}
}
