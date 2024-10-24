public class NaturalsDecreixents {
	public static void main(String[] args) {
		int value = Integer.parseInt(args[0]);
		if (value < 1) {
			System.out.format("Cap valor decreixent entre %s i 1", value);
		}
		else {
			for (int i = value; i > 0; i++) {
				System.out.println(i);
			}
		}
	}
}
