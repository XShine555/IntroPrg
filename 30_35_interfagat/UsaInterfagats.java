public class UsaInterfagats {
    public static void main(String[] args) {
        GatRenat renat = new GatRenat();
        Garfield garfield = new Garfield();
        GatSalvatge gatSalvatge = new GatSalvatge();
        Gat gargamel = new Gat("Gargamel");
        Gat[] gats = { renat, garfield, gatSalvatge, gargamel };
        AnimalDeCompanyia[] animalsDeCompanyia = { renat, garfield };
        Ensinistrable[] ensinistrables = { renat };
        EsserViu[] essersVius = {renat, garfield, gatSalvatge, gargamel };

        System.out.println("Comprovem els mètodes de ensinistrable");
        System.out.println("======================================");
        // XXX per cada element de l'array ensinistrable crida els
        // serveis següents en l'ordre indicat i mostra el seu resultat:
        for (Ensinistrable ensinistrable: ensinistrables) {
            // 1. demana que s'aixequi
            // 2. demana si està dret
            // 3. demana que segui
            // 4. demana si està assegut
            // 5. demana que s'estiri
            // 6. demana si està estirat
        }


        System.out.println();
        System.out.println("Comprovem els mètodes d'AnimalDeCompanyia");
        System.out.println("=========================================");
        // XXX per cada element de l'array animalsDeCompanyia crida els
        // serveis següents en l'ordre indicat i mostra el seu resultat:
        // 1. demana que es deuxi estimar

        System.out.println();
        System.out.println("Comprovem els mètodes d'Esser viu");
        System.out.println("=================================");
        // XXX per cada element de l'array essersVius crida els
        // serveis següents en l'ordre indicat i mostra el seu resultat:
        // 1. demana si està viu
        // 2. demana que mori
        // 3. demana que revisqui

        System.out.println();
        System.out.println("Comprovem els mètodes de Gat");
        System.out.println("============================");
        // XXX per cada element de l'array gats crida els
        // serveis següents en l'ordre indicat i mostra el seu resultat:
        // 1. demana el nom
        // 2. assigna-li una única vida
        // 3. demana que revisqui
        // 4. demana que mori
        // 5. demana que mori un altre cop
        // 6. demana si està viu
        // 7. demana que revisqui
        // 8. demana quantes vides li queden

    }
}