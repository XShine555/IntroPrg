public class ClassificaCaravana {
	public static void main(String[] args) {
		int precio = Integer.parseInt(args[0]);
		if (precio < 50000) {
			System.out.println("Econòmica");
		}
		else if (precio > 175000) {
			System.out.println("Luxe");
		}
		else {
			System.out.println("General");
		}
	}
}
