/*En aquest exercici desenvoluparem un programa que rebrà tres arguments per línia de comandes.

El primer correspondrà al nom d'un fitxer de text que suposarem que existeix, i que contindrà un text arbitrari.

Ens referirem a aquest fitxer com origen.

El segon argument correspondrà al nom d'un altre fitxer de text que també suposarem que existeix, i que anomenarem traducció

El contingut d'aquest fitxer serà un csv format per parelles de texts separades amb una coma (','). Les línies que continguin un nombre de comes diferent de 1 seran ignorades.

Al primer element de la parella li direm clau i al segon valor.

El tercer argument correspondrà al nom d'un fitxer de text que pot no existir.

Ens referirem a aquest fitxer com la destinació.*/
import java.io.*;

public class Traduccio {
    public static void main(String[] args) throws IOException {
        String origen = args[0];
        String traduccio = args[1];
        String destinacio = args[2];
        
        tradueix(origen, traduccio, destinacio);
        
    }
    
    public static void tradueix(String fitxerOrigen, String fitxerTraduccio, String fitxerDestinacio) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader(fitxerOrigen));
        BufferedWriter output = new BufferedWriter(new FileWriter(fitxerDestinacio));
        
        String linia;
        
        while ((linia = input.readLine()) != null) {
            String liniaTraduida = tradueixLinia(linia, fitxerTraduccio);
            
            output.write(liniaTraduida);
            output.newLine();
        }
    }
    
    public static String tradueixLinia(String linia, String fitxerTraduccio) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader(fitxerTraduccio));
        String liniaCSV;
        
        while ((liniaCSV = input.readLine()) != null) {
            String[] parts = liniaCSV.split(",");
            String clau = parts[0];
            String valor = parts[1];
            linia = linia.replace(clau, valor);
        }
        return linia;
    }
}
