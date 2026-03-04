/*Els fitxers de text poden presentar diferents formats. Un de molt típic és el conegut com a csv que són les sigles de Comma Separated Values o en el nostre idioma Valors Separats per Comes.

Un fitxer csv, en la seva forma més bàsica, és una seqüència de línies de text on cada línia presenta un o més valors separats per un caràcter especial, habitualment la coma ,.

És un format molt típic perquè representa molt eficientment dades en forma tabular com les que s'emmagatzemen a una taula d'una base de dades relacional, o a un full de càlcul.

Sovint la primera línia es considera les capçaleres; és a dir, el nom de cada columna.*/
import java.io.*;

public class Mitjana {
    public static void main(String[] args) throws IOException {
        int numExamens = 6;
        if (args.length > 0) {
            String arg = args[0].trim();
            boolean esNumArg = true;
            if (arg.isEmpty()) esNumArg = false;
            for (int j = 0; j < arg.length(); j++) {
                if (!Character.isDigit(arg.charAt(j))) {
                    esNumArg = false;
                    break;
                }
            }
            if (esNumArg) {
                numExamens = Integer.parseInt(arg);
            }
        }

        if (numExamens < 2) {
            System.out.println("Com a mínim 2 exàmens.");
            return;
        }

        System.out.printf("Càlcul de la mitjana de notes per %d exàmens%n", numExamens);

        String cami = "notes.csv";
        File fitxer = new File(cami);
        if (!fitxer.exists()) return;

        BufferedReader input = new BufferedReader(new FileReader(fitxer));
        input.readLine(); 

        String linia;
        boolean hiHaNotes = false; 

        while ((linia = input.readLine()) != null) {
            String[] parts = linia.split(",");
            
            if (parts.length == 0) continue;
            String nom = parts[0].trim();
            if (nom.isEmpty()) continue;

            hiHaNotes = true; 
            double suma = 0;

            for (int i = 1; i <= numExamens; i++) {
                if (i < parts.length) {
                    String valor = parts[i].trim();
                    
                    boolean esNumero = true;
                    if (valor.isEmpty()) {
                        esNumero = false;
                    } else {
                        for (int j = 0; j < valor.length(); j++) {
                            if (!Character.isDigit(valor.charAt(j))) {
                                esNumero = false;
                                break;
                            }
                        }
                    }

                    if (esNumero) {
                        suma += Integer.parseInt(valor);
                    }
                }
            }

            System.out.printf("%s (%.2f)%n", nom, suma / numExamens);
        }

        if (!hiHaNotes) {
            System.out.println("El fitxer notes.csv no conté cap nota.");
        }

        input.close();
    }
}
