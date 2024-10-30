public class TaulaMultiplicar {
    public static void main(String[] args) {
        System.out.println("El primer argument és " + args[0]);
        System.out.println("El segon argument és  " + args[1]);
        System.out.println("El tercer argument és " + args[2]);
        System.out.println("El quart argument és  " + args[3]);

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
