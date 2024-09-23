 /*
     * Aquest programa mostra capacitats d'endevinació
     *
     * Per executar-ho, fes
     * $ java EndevinaNombre 42
     */

    public class EndevinaNombre {

        public static void main(String[] args) {

            int numeroPensat = Integer.parseInt(args[0]);   // guardarà el número pensat
            int numero = numeroPensat * 3;

            // pensa un número
            System.out.println(String.format("El número pensat és %s", numeroPensat));

            // Multiplica'l per 3
            System.out.print(String.format("Quan el multipliques per 3 obtens %s", numero));

            // Suma-li 6
            numero += 6;
            System.out.println(String.format("Quan li sumes 6 arriba a %s", numero));

            // divideix-ho tot per 3
            numero /= 3;
            System.out.println(String.format("Un cop dividit per 3 queda %s", numero));

            // resta-li el número pensat
            numero -= numeroPensat;
            System.out.println(String.format("Finalment, en restar-li el valor inicial, queda %s", numero));

            // compara el resultat
            System.out.println("A que el resultat és 2?");
        }
    }
