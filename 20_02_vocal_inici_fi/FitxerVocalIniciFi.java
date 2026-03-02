/**/
import java.io.*;

public class FitxerVocalIniciFi {
    public static void main(String[] args) throws IOException {
        String cami = "frases.txt";
        FileReader fr = new FileReader(cami);
        BufferedReader input = new BufferedReader(fr);
        String linia;
        while ((linia = input.readLine()) != null) {
            if (linia.length() > 0) {
                char inici = linia.charAt(0);
                char fin = linia.charAt(linia.length()-1);
            
                if (UtilString.esVocal(inici) || UtilString.esVocal(fin) || UtilString.esVocalMajus(inici) || UtilString.esVocalMajus(fin)) {
                    System.out.println(linia);
                }
         
            }
        }
        
        input.close();         
    }
}
