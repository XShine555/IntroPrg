/*
 * Exercici 13_18. El teu repte amb formes
 * Iker Rivera Garcia
 * 07/11/2024
 * Dibuja un Donut :).
*/

public class ElTeuRepteAmbFormes {
	public static void main(String[] args) {
		System.out.println("Radius: ");
		int targetRadius = Integer.parseInt(Entrada.readLine() );

		/* (xAxis - centerA)^2 + (yAxis - centerB)^2 */
		int whiteSpace = 1, centerA = 1, centerB = 1;
		int targetInsideMult = targetRadius / 3;

		int xMin = centerA - targetRadius - whiteSpace;
		int xMax = centerA + targetRadius + whiteSpace;

		int yMin = centerB - targetRadius - whiteSpace;
		int yMax = centerB + targetRadius + whiteSpace;

		for (int yAxis = yMax; yAxis > yMin; yAxis--) {

			for (int xAxis = yMin; xAxis < xMax ; xAxis++) {

				double circleEquation = Math.pow(xAxis - centerA, 2) + Math.pow(yAxis - centerB, 2);

				if ( (int)Math.sqrt(circleEquation) == targetRadius || (int)Math.sqrt(circleEquation) == targetInsideMult) {

					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}

			System.out.println();
		}
	}
}
