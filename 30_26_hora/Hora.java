public class Hora {
    private int hores;
    private int minuts;
    private int segons;

    public Hora() {
        this(0, 0, 0);
    }

    public Hora(int hores, int minuts, int segons) {
        setHores(hores);
        setMinuts(minuts);
        setSegons(segons);
    }

    public int getHores() {
        return hores;
    }

    public int getMinuts() {
        return minuts;
    }

    public int getSegons() {
        return segons;
    }

    public void setHores(int hora) {
        this.hores = hora;
    }

    public void setMinuts(int minuts) {
        this.minuts = minuts;
    }

    public void setSegons(int segons) {
        this.segons = segons;
    }
    public void incrementa() {
        int total = (hores * 3600 + minuts * 60 + segons + 1) % (24 * 3600);
        hores = total / 3600;
        minuts = (total % 3600) / 60;
        segons = total % 60;
    }

    public void incrementa(int value) {
        int total = hores * 3600 + minuts * 60 + segons + value;
        total %= (24 * 3600);
        if (total < 0) {
            total += 24 * 3600;
        }
        hores = total / 3600;
        minuts = (total % 3600) / 60;
        segons = total % 60;
    }

    public void decrementa() {
        incrementa(-1);
    }

    public void decrementa(int value) {
        incrementa(-value);
    }

    public int compareTo(Hora hora) {
        int comparacio = comparaValors(hores, hora.hores);
        if (comparacio == 0) {
            comparacio = comparaValors(minuts, hora.minuts);
            if (comparacio == 0) {
                comparacio = comparaValors(segons, hora.segons);
            }
        }
        return comparacio;
    }

    private static int comparaValors(int p1, int p2)
    {
        if (p1 > p2)
            return 1;
        else if (p1 == p2)
            return 0;
        else
            return -1;
    }

    @Override
    public String toString() {
        return String.format("%d:%02d:%02d", hores, minuts, segons);
    }

    /**
     * Compara dues hores i retorna l'operador corresponent
     * Per exemple, si hora1 és menor que hora2, l'operador serà "<". Els
     * altres dos valors possibles són ">" i "=="
     * 
     * @param hora1: primera hora a comparar
     * @param hora2: segona hora a comparar
     * @return operador resultant
     */
    private static String composaOperadorComparacio(Hora hora1, Hora hora2) {
        int comparacio = hora1.compareTo(hora2);
        if (comparacio < 0) {
            return "<";
        } else if (comparacio > 0) {
            return ">";
        } else {
            return "==";
        }
    }

    public static void main(String[] args) {
        Hora hora1 = new Hora();
        Hora hora2 = new Hora(0, 0, 2);
        System.out.printf("Inicialment hora1: %s %s hora2: %s%n",
                hora1,
                composaOperadorComparacio(hora1, hora2),
                hora2);
        System.out.println("Incrementem 1 segon a la primera i decrementem 1 segon a la segona");
        hora1.incrementa();
        hora2.decrementa();
        System.out.printf("Finalment hora1: %s %s hora2: %s%n",
                hora1,
                composaOperadorComparacio(hora1, hora2),
                hora2);
    }
}