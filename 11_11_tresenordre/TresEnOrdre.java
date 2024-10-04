import java.util.Arrays;

public class TresEnOrdre {
	public static void main(String[] args) {
		System.out.println("Primer?");
		int arg1 = Integer.parseInt(Entrada.readLine());
		System.out.println("Segon?");
		int arg2 = Integer.parseInt(Entrada.readLine());
		System.out.println("Tercer?");
		int arg3 = Integer.parseInt(Entrada.readLine());

		int[] intArray = {arg1, arg2, arg3};
		Arrays.sort(intArray);

		System.out.println(String.format("%s, %s i %s", intArray[0], intArray[1], intArray[2]));
	}
}
