/*Desenvolupa una nova versió de l'exercici que mostrava una cadena contínua.

La nova versió tindrà la mateixa sortida que l'original però el codi del programa serà més modular. En concret, el mòdul main() se n'encarregarà d'obtenir les dades d'entrada, i cridarà un nou mòdul anomenat mostraCadenaContinua() que serà qui realitzi realment la feina de mostrar el resultat.*/
public class CadenaContinua {
    public static void main(String[] args) {
       System.out.println("Text?");
        String text = Entrada.readLine();
        if (text.isBlank()) {
            System.out.println("ERROR: el text no conté caràcters no blancs");
        } else {
            System.out.println("Nombre?");
            int num = Integer.parseInt(Entrada.readLine());
            
            if (num < 0) {
                System.out.println();
            } else {
                mostraCadenaContinua(text, num); 
            }
        } 
        
    }
    
    public static void mostraCadenaContinua(String text, int longitud) {
        for (int i = 0; i < longitud; i++) {
            int index = i % text.length();
            char c = text.charAt(index);
            System.out.print(c); 
         }
        System.out.println();
    }
}
