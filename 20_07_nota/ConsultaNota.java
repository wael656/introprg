/**/
//import java.io.*
public class ConsultaNota {
    public static void main(String[] args) {
        
    }    
    
    public static String[] carregaAlumnes(String nomFitxer) {
        BufferedReader entrada = new BufferedReader(new FileReader(nomFitxer));
        int numAlumnes = 0;
        entrada.readLine();

        while (entrada.readLine() != null) {
            numAlumnes++;
        }
        entrada.close();

        String[] resultat = new String[numAlumnes];
        BufferedReader input =  new BufferedReader(new FileReader(nomFitxer));
        input.readLine();
        
        String linia;
        int index = 0;

        while ((linia = input.readLine()) != null) {
            String[] separa = linia.split(",");
            resultat[index] = separa[0].trim();
            index++;
        }
        input.close();
        return resultat;
    }
   
    public static String[] carregaProves(String nomFitxer) throws IOException {
    
    }

   /*public static int filaAlumne(String nomAlumne, String[] alumnes) {

    }*/
    
   /* public static int columnaProva (String nomProva, String[] proves) {

    }*/
}