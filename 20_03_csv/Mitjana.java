/*Els fitxers de text poden presentar diferents formats. Un de molt típic és el conegut com a csv que són les sigles de Comma Separated Values o en el nostre idioma Valors Separats per Comes.

Un fitxer csv, en la seva forma més bàsica, és una seqüència de línies de text on cada línia presenta un o més valors separats per un caràcter especial, habitualment la coma ,.

És un format molt típic perquè representa molt eficientment dades en forma tabular com les que s'emmagatzemen a una taula d'una base de dades relacional, o a un full de càlcul.

Sovint la primera línia es considera les capçaleres; és a dir, el nom de cada columna.*/
import java.io.*;

public class Mitjana {
    public static void main(String[] args) throws IOException {
        System.out.println("Càlcul de la mitjana de notes per 6 exàmens");
        String cami = "notes.csv";
        FileReader fr = new FileReader(cami);
        BufferedReader input = new BufferedReader(fr);
        int suma = 0;
        String linia = input.readLine();
        
        while ((linia = input.readLine()) != null) {
            String[] parts = linia.split(",");
            for (int i = 1; i < parts.length; i++) {
                if (parts[i].trim().equals("NP")) continue;
                suma+=Integer.parseInt(parts[i]);
            }
            System.out.printf("%s (%.2f)%n", parts[0], suma/6.0);
            suma = 0;
            
        }
        input.close();
    }
}
