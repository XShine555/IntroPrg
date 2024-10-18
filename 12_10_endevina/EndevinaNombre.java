public class EndevinaNombre {
	public static void main(String[] args) {
		int valorInput = 0;
		int valorPensado = Integer.parseInt(args[0]);
		while (valorPensado != valorInput) {
			System.out.println("Ves introduint enters entre 1 i 100 fins que encertis el que jo he pensat");
			valorInput = Integer.parseInt(Entrada.readLine());

			String message;
			if (valorInput > valorPensado) {
				message = "És més gran que " + valorInput;
			}
			else if (valorInput < valorPensado) {
				message = "És més petit que " + valorInput;
			}
			else if (valorInput > 100) {
				message = "Com a màxim 100";
			}
			else if (valorInput < 1) {
				message = "Com a mínim 1";
			}
			else {
				message = "Has encertat!";
			}
			System.out.println(message);
		}
	}
}
