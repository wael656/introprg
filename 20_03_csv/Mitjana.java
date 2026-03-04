/*Els fitxers de text poden presentar diferents formats. Un de molt típic és el conegut com a csv que són les sigles de Comma Separated Values o en el nostre idioma Valors Separats per Comes.

Un fitxer csv, en la seva forma més bàsica, és una seqüència de línies de text on cada línia presenta un o més valors separats per un caràcter especial, habitualment la coma ,.

És un format molt típic perquè representa molt eficientment dades en forma tabular com les que s'emmagatzemen a una taula d'una base de dades relacional, o a un full de càlcul.

Sovint la primera línia es considera les capçaleres; és a dir, el nom de cada columna.*/
import java.io.*;

public class Mitjana {
    public static void main(String[] args) throws IOException {
        int n = 6;
        if (args.length > 0 && esNumeric(args[0])) {
            n = Integer.parseInt(args[0]);
        }
        
        System.out.println("Càlcul de la mitjana de notes per 6 exàmens");
        String cami = "notes.csv";
        FileReader fr = new FileReader(cami);
        BufferedReader input = new BufferedReader(fr);
        String linia = input.readLine();
        
        int contAlumnes = 0;
        
        while ((linia = input.readLine()) != null) {
            String[] parts = linia.split(",");
            String nom = parts[0].trim();
            if (nom.length() == 0) continue;
            contAlumnes++;
            
            double sumaAlumne = 0;
            for (int i = 1; i <= n; i++) {
                if (i < parts.length) {
                    String notaText = parts[i].trim();
                    if (esNumeric(notaText)) {
                        sumaAlumne+=Integer.parseInt(notaText);
                    }
                }
            }
            System.out.printf("%s (%.2f)%n", nom, sumaAlumne/n);
            if (contAlumnes == 0) {
                System.out.println("El fitxer notes.csv no conté cap nota.");
            }           
        }
        input.close();
    }
    
    public static boolean esNumeric(String text) {
        if (text == null || text.length() == 0) return false;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) return false;
        }
        return true;
    }
}
