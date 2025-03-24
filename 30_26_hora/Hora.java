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
        if (hora < 0 || hora >= 24)
            this.hores = 0;
        else
            this.hores = hora;
    }

    public void setMinuts(int minuts) {
        if (minuts < 0)
            minuts = 0;
        else if (minuts >= 60)
        {
            minuts = 0;
            setHores(this.hores + 1);
        }
        else
            this.minuts = minuts;
    }

    public void setSegons(int segons) {
        if (segons < 0)
            segons = 0;
        else if (segons >= 60)
        {
            segons = 0;
            setMinuts(this.minuts + 1);
        }
        else
            this.segons = segons;
    }

    public void incrementa() {
        segons++;

        if (segons >= 60)
        {
            segons = 0;
            minuts++;

            if (minuts >= 60)
            {
                minuts = 0;
                hores++;

                if (hores >= 24)
                {
                    hores = 0;
                }
            }
        }
    }

    public void incrementa(int value) {
        if (value < 0)
        {
            decrementa(Math.abs(value));
            return;
        }

        segons += value;

        while (segons >= 60)
        {
            segons -= 60;
            minuts++;

            if (minuts >= 60)
            {
                minuts -= 60;
                hores++;

                if (hores >= 24)
                {
                    hores -= 24;
                }
            }
        }
    }

    public void decrementa() {
        segons--;

        if (segons < 0)
        {
            segons = 59;
            minuts--;

            if (minuts < 0)
            {
                minuts = 59;
                hores--;

                if (hores < 0)
                {
                    hores = 23;
                }
            }
        }
    }

    public void decrementa(int value) {
        if (value < 0)
        {
            incrementa(Math.abs(value));
            return;
        }

        segons -= value;

        while (segons < 0)
        {            
            segons += 60;
            minuts--;

            if (minuts < 0)
            {
                minuts += 60;
                hores--;

                if (hores < 0)
                {
                    hores += 24;
                }
            }
        }
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

        //hora1.decrementa(1);
        //System.out.println(hora1.toString());
    }
}