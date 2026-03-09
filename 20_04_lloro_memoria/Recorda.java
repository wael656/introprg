/*Al llarg d'aquest curs hem fet servir el patró del lloro en multitud d'ocasions. Aquest patró ens va bé quan hem de recorrer una seqüència de valors de la que no coneixem la longitud però sí una marca de finalització.

Inicialment aplicàvem el lloro a l'entrada estàndard però recentment l'hem vist també aplicat a les línies d'un fitxer de text.

En aquesta ocasió hauràs d'implementar una versió del lloro amb memòria. És a dir, el lloro serà capaç de guardar totes les frases que rebi per entrada estàndard en un fitxer anomenat records.txt.*/
import java.io.*;

public class Recorda {
        public static void main(String[] args) throws IOException {
        String cami = "records.txt";
        processaEntrada(cami);
        System.out.println("D'acord");
        mostraRecords(cami);
    }
    
    public static void processaEntrada(String cami) throws IOException {
        BufferedWriter sortida = new BufferedWriter(new FileWriter(cami));
        while(true) {
            System.out.println("El lloro pregunta paraula:");
            String entrada = Entrada.readLine();
            entrada = entrada.trim();
            if (entrada.isEmpty()) {
                break;
            }
            System.out.println("El lloro registra: " + entrada);
            sortida.write(entrada);
            sortida.newLine();
        }
        sortida.close();
    }
    
    public static void mostraRecords(String cami) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader(cami));
        String linia;
        while((linia = input.readLine()) != null) {
            System.out.println("El lloro recorda: " + linia);
        }
        
        input.close();
        System.out.println("Adéu");
    }
}
