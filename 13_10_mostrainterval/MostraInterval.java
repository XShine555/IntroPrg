public class MostraInterval {
	public static void main(String[] args) {
		System.out.println("inici?");
		int firstNum = Integer.parseInt(Entrada.readLine());

		System.out.println("final?");
		int secondNum = Integer.parseInt(Entrada.readLine());

		boolean inReverse = firstNum > secondNum;

		if (inReverse) {
			for (int i = firstNum; i >= secondNum; i--) {
				System.out.println(i);
			}
		}
		else {
			for (int i = firstNum; i <= secondNum; i++) {
				System.out.println(i);
			}
		}
	}
}
