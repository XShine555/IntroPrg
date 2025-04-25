public class Entorn {
    static class Result {
        private int value;
        private boolean wasBlank;
        private boolean success;

        public Result(int value, boolean wasBlank, boolean success) {
            this.value = value;
            this.wasBlank = wasBlank;
            this.success = success;
        }

        public int getValue() {
            return value;
        }

        public boolean wasBlank() {
            return wasBlank;
        }

        public boolean isSuccess() {
            return success;
        }
    }

    private static Botiga botiga = new Botiga();

    public static void main(String[] args) {
        System.out.println("Celler La Bona Estrella. Escriviu ajuda per veure opcions.");
        String comanda = "";

        while (!comanda.equals("surt")) {
            System.out.print("botiga> ");
            comanda = Entrada.readLine();

            switch (comanda) {
                case "ajuda" -> ajuda();
                case "cerca" -> cerca();
                case "afegeix" -> afegeix();
                case "modifica" -> modifica();
                case "elimina" -> elimina();
                case "surt" -> System.out.println("adéu");
                default -> System.out.println("ERROR: comanda no reconeguda. Escriviu help per ajuda");
            }
        }
    }

    private static void elimina() {
        System.out.print("nom (enter cancel·la)> ");
        String nom = Entrada.readLine();
        if (nom.isBlank())
            return;

        Vi result = botiga.cerca(nom);

        if (result == null) {
            System.out.println("ERROR: no s'ha pogut eliminar");
            return;
        }

        System.out.print("A eliminar:");
        System.out.print(result.toString());

        System.out.print("Segur?> ");
        String resposta = Entrada.readLine();

        if (resposta.equalsIgnoreCase("Si") || resposta.equalsIgnoreCase("Sí")) {
            Vi eliminat = botiga.elimina(nom);
            System.out.println(eliminat != null ? "Eliminat" : "ERROR: no s'ha pogut eliminar");
        } else {
            System.out.println("No s'ha eliminat");
        }
    }

    private static void afegeix() {
        System.out.print("nom (enter cancel·la)> ");
        String nom = Entrada.readLine();

        if (nom.isBlank())
            return;

        System.out.print("preu (en cèntims)> ");
        Result preu = converteixValor(Entrada.readLine());
        if (preu.getValue() < 0) {
            System.out.println("ERROR: cal un enter positiu");
            return;
        }

        System.out.print("estoc (enter sense estoc)> ");
        Result estoc = converteixValor(Entrada.readLine());
        if (estoc.getValue() < 0) {
            System.out.println("ERROR: cal un enter positiu");
            return;
        }

        Vi vi = new Vi(nom, preu.getValue(), estoc.getValue());
        Vi result = botiga.afegeix(vi);

        System.out.println(
                result != null ? String.format("Introduït:%s", result.toString()) : "ERROR: no s'ha pogut afegir");
    }

    private static void modifica() {
        System.out.print("nom (enter cancel·la)> ");
        String nom = Entrada.readLine();
        if (nom.isBlank())
            return;

        Vi result = botiga.cerca(nom);

        if (result == null) {
            System.out.println("No trobat");
            return;
        }

        System.out.format("preu (enter %s)> ", result.getPreu());
        Result preu = converteixValor(Entrada.readLine());
        if (preu.getValue() < 0) {
            System.out.println("ERROR: cal un enter positiu");
            return;
        }

        System.out.format("estoc (enter %s)> ", result.getEstoc());
        Result estoc = converteixValor(Entrada.readLine());
        if (estoc.getValue() < 0) {
            System.out.println("ERROR: cal un enter positiu");
            return;
        }

        if (!preu.wasBlank())
            result.setPreu(preu.getValue());

        if (!estoc.wasBlank())
            result.setEstoc(estoc.getValue());

        System.out.print("Modificat:");
        System.out.print(result.toString());
    }

    private static Result converteixValor(String valor) {
        if (valor.isBlank())
            return new Result(0, true, true);

        try {
            int value = Integer.parseInt(valor);
            return new Result(value, false, true);
        } catch (NumberFormatException e) {
            return new Result(0, false, false);
        }
    }

    private static void cerca() {
        System.out.print("nom (enter cancel·la)> ");
        String nom = Entrada.readLine();

        if (nom.isBlank()) {
            return;
        }

        Vi result = botiga.cerca(nom);
        System.out.println(result != null ? String.format("Trobat:%s", result.toString()) : "No trobat");
    }

    private static void ajuda() {
        System.out.print("""
                Comandes disponibles:
                ajuda
                cerca
                afegeix
                modifica
                elimina
                surt
                """);
    }
}
