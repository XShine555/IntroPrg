/*
 * Iker Rivera Garcia
 * 05/04/2025
 * EsserViu.java, interfície que defineix els mètodes esViu, mor i reviu.
 * Aquesta interfície és implementada per la classe Gat, que representa un gat
 * amb un nombre de vides i un nom. Els mètodes permeten gestionar l'estat de
 * vida del gat, incloent la seva condició de viu, la mort i la resurrecció.
 */

public interface EsserViu {
    public boolean esViu();

    public String mor();

    public String reviu();
}
