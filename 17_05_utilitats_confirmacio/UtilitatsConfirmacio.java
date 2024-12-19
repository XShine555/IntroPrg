public class UtilitatsConfirmacio {
	public static boolean respostaABoolean(String text) {
		String[] upperCase = text.toUpperCase().split(" ");
        for (String string : upperCase) {
            if (string.equals("SI"))
                return true;
        }
        return false;
	}
}