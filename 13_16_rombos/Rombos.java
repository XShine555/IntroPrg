public class Rombos {
	public static void main(String[] args) {
		int length = 19, height = 10;

		int mid = (length / 2);

		System.out.println("quants?");
		int value = Integer.parseInt(Entrada.readLine());

		for (int triangle = 0; triangle < value; triangle++) {

			for (int col = 0; col < height; col++) {

				int dotsLeft = mid - col;
				int dotsRight =  mid + col;

				for (int row = 0; row < length; row++) {

					if (row < dotsLeft || row > dotsRight) {
						System.out.print(".");
					}
					else {
						int num = row;
						if (row >= 10) {
							num = length - row - 1;
						}
						System.out.print(num);
					}
				}
				System.out.println();
			}

			for (int col = height; col > 0; col--) {
				
				int dotsLeft = mid - col;
				int dotsRight =  mid + col;

				for (int row = length; row > 0; row--) {

					if (row < dotsLeft || row > dotsRight) {
						System.out.print(".");
					}
					else {
						int num = row;
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
