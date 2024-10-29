public class Triangle {
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
						int num = row - dotsLeft;
						if (num >= 9) {
							num = length - num - 1;
						}
						System.out.print(num);
					}
				}
				System.out.println();
			}
		}
	}
}
