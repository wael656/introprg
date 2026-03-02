/*Recordes l'exercici en el que el lloro anava demanant texts i només repetia els que començaven o acabaven en vocal?

Desenvoluparem un programa anomenat FitxerVocalIniciFi que farà servir una estructura molt similar, per mostrar totes les línies d'un fitxer de text anomenat frases.txt que comencin o acabin en vocal catalana.

Per descomptat, caldrà que facis servir la funció esVocal() que vas utilitzar per la versió de referència.*/
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
            
                if (UtilString.esVocal(inici) || UtilString.esVocal(fin)) {
                    System.out.println(linia);
                }
         
            }
        }
        
        input.close();         
    }
}
