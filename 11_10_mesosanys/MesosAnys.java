public class MesosAnys {
	public static void main(String[] args) {
		System.out.println("Mes?");
		int month = Integer.parseInt(Entrada.readLine());
		System.out.println("Any?");
		int year = Integer.parseInt(Entrada.readLine());

		int nextMonth = month + 1;
		int nextYear = year;
		if (nextMonth > 12) {
			nextMonth = 1;
			nextYear++;
		}

		int lastMonth = month - 1;
		int lastYear = year;
		if (lastMonth < 1) {
			lastMonth = 12;
			lastYear--;
		}

		System.out.println(String.format("Mes anterior %s/%s i mes següent %s/%s", lastMonth, lastYear, nextMonth, nextYear) );
	}
}
