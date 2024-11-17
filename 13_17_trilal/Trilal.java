public class Trilal {
	public static void main(String[] args) {
		int length = 40, height = 20;

		int midLength = length / 2;
		int midHeight = height / 2;

		for (int upperCol = 0; upperCol < midHeight; upperCol++) {
			int rowDots = (midLength - 1) - upperCol;

			for (int leftRow = 0; leftRow < midLength; leftRow++) {
				String charToPut = leftRow < rowDots ? "." : Integer.toString(leftRow % 10);
				System.out.print(charToPut);
			}
			for (int rightRow = midLength - 2; rightRow > 0; rightRow--) {
				String charToPut = rightRow < rowDots ? "." : Integer.toString(rightRow % 10);
				System.out.print(charToPut);
			}
			System.out.println();
		}

		for (int bottomCol = midHeight; bottomCol < height; bottomCol++) {
			int rowDots = (midLength - 1) - bottomCol;

			for (int repeatI = 0; repeatI < 2; repeatI++) {
				for (int leftRow = 0; leftRow < midLength / 2; leftRow++) {
					String charToPut = leftRow < rowDots ? "." : Integer.toString(leftRow % 10);
					System.out.print(charToPut);
				}
				for (int rightRow = (midLength / 2) - 2; rightRow >= 0; rightRow--) {
					String charToPut = rightRow < rowDots ? "." : Integer.toString(rightRow % 10);
					System.out.print(charToPut);
				}
			}
			System.out.println();
		}
	}
}
