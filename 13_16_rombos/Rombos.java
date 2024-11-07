/*
 * Exercici 13_16. Rombos
 * Iker Rivera Garcia
 * 07/11/2024
 * Programa que dibuja un rombo las veces que diga el usuario.
*/

public class Rombos {
	public static void main(String[] args) {
		int length = 19, height = 20;
		int realHeight = height - 1;

		int mid = (length / 2);
		int midHeight = height / 2;

		System.out.println("quants?");
		int value = Integer.parseInt(Entrada.readLine());

		for (int triangle = 0; triangle < value; triangle++) {

			for (int col = 0; col < height; col++) {

				int iCol = col >= midHeight ? realHeight % col : col % midHeight;
				int dotsLeft = mid - iCol;
				int dotsRight =  mid + iCol;

				if (col != midHeight) {
					for (int row = 0; row < length; row++) {

					if (row < dotsLeft || row > dotsRight) {
						System.out.print(".");
					}
					else {
						int num = row % mid;
						if (row % 2 != 0 && num == 0) {
							num = 9;
						}
						if (row >= 10) {
							num = length - row - 1;
						}
						System.out.print(num);
						}
					}
					System.out.println();
				}
			}
		}
	}
}
