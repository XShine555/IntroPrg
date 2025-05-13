import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class RecopilaAdreces {

    public static String llegeixFitxer(String nomFitxer) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(nomFitxer));
            StringBuilder sb = new StringBuilder();
            String linia;
            while ((linia = br.readLine()) != null) {
                sb.append(linia).append('\n');
            }
            br.close();
            return sb.toString();
        } catch (FileNotFoundException e) {
            System.out.println("No s'ha trobat el fitxer " + nomFitxer);
        } catch (IOException e) {
            System.out.println("No s'ha pogut llegir el fitxer " + nomFitxer);
        }
        return null;
    }

    public static void mostraResultat(Recopilador recop) {
        boolean trobat = false;
        for (Adressa a : recop.getAdreces()) {
            trobat = true;
            System.out.println(a);
            for (String nomFitxer : recop.getNoms(a)) {
                System.out.println("- " + nomFitxer);
            }
        }

        if (!trobat) {
            System.out.println("No s'ha trobat cap adreça.");
        }
    }

    public static void main(String[] args) {
        Recopilador recop = new Recopilador();
        for (String nomFitxer : args) {
            String contingut = llegeixFitxer(nomFitxer);
            if (contingut != null) {
                recop.processa(nomFitxer, contingut);
            }
        }
        mostraResultat(recop);
    }
}
