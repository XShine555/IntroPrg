/*
 * Exercici 11_12. Una calculadora senzilla
 * 04/10/2024
 * Iker Rivera Garcia
 * Calculadora sencilla con los 4 operadores aritméticos básicos.
 */

public class CalculadoraSenzilla {
	public static void main(String[] args) {
		System.out.println("Operand1?");
		double num1 = Double.parseDouble(Entrada.readLine());
		System.out.println("Operador?");
		char op = Entrada.readLine().charAt(0);
		System.out.println("Operand2?");
		double num2 = Double.parseDouble(Entrada.readLine());

		switch (op) {
			case '+':
				System.out.format("%.2f %s %.2f = %.2f", num1, op, num2, num1+num2);
				break;
			case '-':
				System.out.format("%.2f %s %.2f = %.2f", num1, op, num2, num1-num2);
				break;
			case '*':
				System.out.format("%.2f %s %.2f = %.2f", num1, op, num2, num1-num2);
			case '/':
				if (num2 == 0) {
					System.out.println("No es pot dividir entre 0");
				}
				else {
					System.out.format("%.2f %s %.2f = %.2f", num1, op, num2, num1/num2);
				}
				break;
			default:
				System.out.format("L'operador %s no està disponible", op);
				break;
		}
	}
}
