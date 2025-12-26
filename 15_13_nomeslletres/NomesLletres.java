/*Desenvolupa una nova versió de l'exercici que filtrava les lletres d'un text.

La nova versió tindrà la mateixa sortida que l'original però el codi del programa serà més modular. En concret, el mòdul main() se n'encarregarà d'obtenir les dades d'entrada, i cridarà un nou mòdul que serà qui realitzi realment la feina.*/
public class NomesLletres {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        filtraLletres(text);
    }
    
    public static void filtraLletres(String text) {
        boolean primer = true;
        
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            
            
            if (Character.isLetter(c)) {
                if (!primer) {
                    System.out.print(", ");                   
                }
                System.out.print(c);
                primer = false;
            }
        }
        System.out.println();
    }

}
