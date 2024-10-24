public class Naturals {
	public static void main(String[] args) {
		int count = 0, value = Integer.parseInt(args[0]);
		if (value < 1) {
			System.out.format("Cap valor creixent entre 1 i %s", value);
		}
		else {
			while (count < value) {
				count++;
				System.out.println(count);
			}
		}
	}
}
