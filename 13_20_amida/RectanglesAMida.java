public class RectanglesAMida {
	public static void main(String[] args) {
		int firstNumber = 1;
		int secondNumber = -1;

		int countRect = 0;
		int punts = 0;

		String inputString;

		do {
			System.out.println(firstNumber + " x ?");
			inputString = Entrada.readLine();
			if (!inputString.isBlank()) {
				secondNumber = Integer.parseInt(inputString);
				if (secondNumber > 0) {
					countRect++;

					for (int y = -1; y < firstNumber; y++) {
						for (int x = -1; x < secondNumber; x++) {
							if (y == -1) {
								if (x == -1) { System.out.print("  "); }
								else { System.out.print(x % 10); }
							}
							else {
								if (x == -1) { System.out.print(y % 10 + " "); }
								else
								{
									System.out.print("*");
									punts++;
								}
							}
						}
						System.out.println();
					}
					firstNumber = secondNumber;
				}
			}
		}
		while (secondNumber > 0 && !inputString.isBlank());

		if (countRect > 0) {
			System.out.println("Rectangles: " + countRect);
			System.out.println("Punts: " + punts);
		}
		else {
			System.out.println("Cap rectangle dibuixat");
		}
	}
}
