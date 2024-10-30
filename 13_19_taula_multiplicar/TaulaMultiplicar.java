public class TaulaMultiplicar {
    public static void main(String[] args) {
	int start = Integer.parseInt(args[0]);
	int end = Integer.parseInt(args[1]);
	int arg1 = Integer.parseInt(args[2]);
	int arg2 = Integer.parseInt(args[3]);

	boolean sameNumber = arg1 == arg2;

	for (int firstNumber = start; firstNumber <= end; firstNumber++) {
		for (int secondNumber = arg1; secondNumber <= arg2; secondNumber++) {
			System.out.println(String.format("%s x %s = %s", firstNumber, secondNumber, firstNumber * secondNumber) );
		}
	}
    }
}
