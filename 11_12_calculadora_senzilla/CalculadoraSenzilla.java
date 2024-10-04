public class CalculadoraSenzilla {
	public static void main(String[] args) {
		System.out.println("Operand 1?");
		float num1 = Float.parseFloat(Entrada.readLine());
		System.out.println("Operador");
		String op = Entrada.readLine();
		System.out.println("Operand2?");
		float num2 = Float.parseFloat(Entrada.readLine());

		float result = 0f;

		switch (op) {
			case "+":
				result = num1+num2;
				break;
			case "-":
				result = num1-num2;
				break;
			case "*":
				result = num1*num2;
				break;
			case "/":
				if (num1 == 0 || num2 == 0) {
					System.out.println("No es pot dividir entre 0");
					return;
				}
			default:
				System.out.println(String.format("L'operador %s no està disponible", op));
				return;
		}
		System.out.println(String.format("%s %s %s = %s", num1, op, num2, result));
	}
}
