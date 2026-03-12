/*Quan executem programes complexos, sol ser interessant poder registrar les situacions significatives que es van produint. Això ens permet a posteriori entre altres coses, auditar com s'ha executat, descobrir i reproduir errors.

Aquests registres es solen guardar en un fitxer de text amb una o més línies que descriuen què ha passat i sovint quan va passar. A aquest fitxer se'l sol conèixer com a fitxer de log.

Els fitxers de log es poden veure com una mena de diari que descriu aspectes de l'execució d'un o més programes.*/
import java.io.*;

public class Log {
    private static int contador = 1;
    
    public static void reset() {
        contador = 1;
    }
    
    public static String printError(String text) throws IOException {
        String linia = "[" + contador + "]" + " ERROR: " + text;
        BufferedWriter sortida = new BufferedWriter(new FileWriter("log.txt", true));
        
        sortida.write(linia);
        sortida.newLine();
        sortida.close();
        
        contador++;
        return linia;    
    }
    
    public static String printWarning(String text) throws IOException{    
        String linia = "[" + contador + "] WARNING: " + text;
        BufferedWriter sortida = new BufferedWriter(new FileWriter("log.txt", true));
        
        sortida.write(linia);
        sortida.newLine();
        sortida.close();
        
        contador++;
        return linia; 
    }
    
    public static String printInfo(String text) throws IOException {
        String linia = "[" + contador + "] INFO: " + text;
        BufferedWriter sortida = new BufferedWriter(new FileWriter("log.txt", true));
        
        sortida.write(linia);
        sortida.newLine();
        sortida.close();
        
        contador++;
        return linia;
    }
    
    public static String printDebug(String text) throws IOException {
        String linia = "[" + contador + "] DEBUG: " + text;
        BufferedWriter sortida = new BufferedWriter(new FileWriter("log.txt", true));
        
        sortida.write(linia);
        sortida.newLine();
        sortida.close();
        
        contador++;
        return linia;
    }    
}
