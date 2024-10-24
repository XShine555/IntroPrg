public class SumaInterval {
	public static void main(String[] args) {
		System.out.println("primer?");
		int primer = Integer.parseInt(Entrada.readLine());
		System.out.println("segon?");
		int segon = Integer.parseInt(Entrada.readLine());

		int lastValue = 0;
		for (int i = segon; i <= primer; i++) {
			int sum = lastValue + i;
			System.out.println(String.format("%s + %s = %s", lastValue, i, sum));
			lastValue = sum;
		}
	}
}
