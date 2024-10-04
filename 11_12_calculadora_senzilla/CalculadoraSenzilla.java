public class CalculadoraSenzilla {
	public static void main(String[] args) {
		System.out.println("Operand1?");
		double num1 = Double.parseDouble(Entrada.readLine());
		System.out.println("Operador?");
		char op = Entrada.readLine().charAt(0);
		System.out.println("Operand2?");
		double num2 = Double.parseDouble(Entrada.readLine());

		double result = 0f;
		switch (op) {
			case '+':
				result = num1+num2;
				break;
			case '-':
				result = num1-num2;
				break;
			case '*':
				result = num1*num2;
				break;
			case '/':
				if (num2 == 0.0) {
					System.out.println("No es pot dividir entre 0");
					return;
				}
				result = num1/num2;
				break;
			default:
				System.out.format("L'operador %s no està disponible", op);
				return;
		}
		System.out.format("%f %s %f = %f", num1, op, num2, result);
	}
}
