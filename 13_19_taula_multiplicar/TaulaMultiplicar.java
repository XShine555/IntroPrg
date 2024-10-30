public class TaulaMultiplicar {
    public static void main(String[] args) {
	int start = Integer.parseInt(args[0]);
	int end = Integer.parseInt(args[1]);
	int arg1 = Integer.parseInt(args[2]);
	int arg2 = Integer.parseInt(args[3]);

	for (int firstNumber = start; firstNumber <= end; firstNumber++) {
		System.out.println(String.format("%s x %s = %s", firstNumber, arg1, firstNumber * arg1) );
		System.out.println(String.format("%s x %s = %s", firstNumber, arg2, firstNumber * arg2) );
	}
    }
}
