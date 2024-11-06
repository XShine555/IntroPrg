public class RectanglesAMida {
	public static void main(String[] args) {
		int firstNumber = 1;

		int countRect = 0;
		int punts = 0;

		System.out.println(firstNumber + " x ?");
		int secondNumber = Integer.parseInt(Entrada.readLine());

		while (secondNumber > 0) {
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

			System.out.println(firstNumber + " x ?");
			secondNumber = Integer.parseInt(Entrada.readLine());
		}
		String countRectMsg = countRect > 0 ? "Rectangles: " + countRect : "Cap rectangle dibuixat";

		System.out.println(countRectMsg);
		System.out.println("Punts: " + punts);
	}
}
