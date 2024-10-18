public class EndevinaNombre {
	public static void main(String[] args) {
		int valorInput = 0;
		boolean isCancelado = false;
		int valorPensado = Integer.parseInt(args[0]);
		System.out.println("Ves introduint enters entre 1 i 100 fins que encertis el que jo he pensat");
		while (valorPensado != valorInput || !isCancelado) {
			System.out.println("Introdueix un valor");
			String valorString = Entrada.readLine();

			if (valorString.isBlank()){
				isCancelado = true;
			}
			else {
				valorInput = Integer.parseInt(Entrada.readLine());

				String message;
				if (valorInput > 100) {
					message = "Com a màxim 100";
				}
				else if (valorInput < 1) {
					message = "Com a mínim 1";
				}
				else if (valorInput < valorPensado) {
					message = "És més gran que " + valorInput;
				}
				else if (valorInput > valorPensado) {
					message = "És més petit que " + valorInput;
				}
				else {
					message = "Has encertat!";
				}
				System.out.println(message);
			}
		}
	}
}
