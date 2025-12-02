/*En aquella ocasió el programa demanava els valors límit entre dos enters. Amb unes petites modificacions podríem crear un nou programa que ens permetés veure una secció d'un String

Doncs això és el que ens demana aquest exercici. En concret, l'enunciat és el següent: desenvolupa un programa anomenat MostraInterval que demani un text i dos valors enters, i que mostri tots els caràcters que hi ha entre el primer i el segon, en l'ordre marcat per l'entrada.

En cas que els valors enters quedin fora de les posicions del text introduït, el programa els normalitzarà al límit corresponent, i mostrarà tot el que pugui sense mostrar error.*/
public class MostraInterval {
    public static void main(String[] args) {
        System.out.println("text?");
        String text = Entrada.readLine();
        System.out.println("inici?");
        int inici = Integer.parseInt(Entrada.readLine());
        if (inici < 0) {
            inici = 0;
        }
        
        if (inici > text.length()-1) {
            inici = text.length() -1;
        } 
        System.out.println("final?");
        int fin = Integer.parseInt(Entrada.readLine());
        if (fin > text.length()-1) {
            fin = text.length() -1;
        } 
        if (fin < 0) {
            fin = 0;
        }
        
        
        if (inici <= fin) {
            for (int i = inici; i <= fin; i++) {
                char c = text.charAt(i);
                System.out.println(c);
            }
            System.out.println();   
        }    
        
        if (inici > fin) {
            for (int i = inici; i >= fin; i--) {
                char c = text.charAt(i);
                System.out.println(c);
            }
            System.out.println();  
        
        }
    }
}
