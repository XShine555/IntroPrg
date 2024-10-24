public class Naturals {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		if (num < 1) {
			System.out.format("Cap valor creixent entre 1 i %s", num);
		}
		else {
			for (int i = 1; i <= num; i++) {
				System.out.println(i);
			}
		}
	}
}
