/*
 * Iker Rivera Garcia
 * 19/05/2025
 * Clase UsaPunt, que conté el mètode main per executar la classe Punt.
 */

public class UsaPunt {
    public static void main(String[] args){
         Punt punt = new Punt();
         int x = parseInt(args[0] == null ? null : args[0]); // args[0] si hi és i és enter, o 0 altrament
         int y = parseInt(args[1] == null ? null : args[1]); //  args[1] si hi és i és enter, o 0 altrament
         punt.setX(x);
         punt.setY(y);
         System.out.printf("punt.getX() -> %d%n", punt.getX());
         System.out.printf("punt.getY() -> %d%n", punt.getY());
    }

    private static int parseInt(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}