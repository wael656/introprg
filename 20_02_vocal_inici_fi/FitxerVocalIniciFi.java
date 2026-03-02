import java.io.*;

public class FitxerVocalIniciFi {
    public static void main(String[] args) throws IOException {
        String cami = "frases.txt";
        FileReader fr = new FileReader(cami);
        BufferedReader input = new BufferedReader(fr);
        while (true) {
            String linia = input.readLine();
            char inici = linia.charAt(0);
            char fin = linia.charAt(linia.length()-1);
            
            if (esVocal(inici) || esVocal(fin)) {
                System.out.println(linia);
            }
         
            if (null == linia) break;
        }
        
        input.close();         
    }


    public static boolean esVocal(char c) {
        String vocals = "aeiouàèéíïòóúü";
        for (int i = 0; i < vocals.length(); i++) {
            char v = vocals.charAt(i);
            if (c == v) {
                return true;
            }
        }
        return false;
    }
}
