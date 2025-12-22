/*Desenvolupa una nova versió de l'exercici que mostrava un interval d'un String.

La nova versió tindrà el mateix nom i la mateixa sortida que l'original però el codi del programa serà més modular. En concret, el mòdul main() se n'encarregarà d'obtenir les dades d'entrada, i cridarà un nou mòdul anomenat mostraInterval() que serà qui realitzi realment la feina de mostrar l'interval.*/
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
        
        mostraInterval(text, inici, fin);
    
    }
    
    public static void mostraInterval(String text, int inici, int fi) {
        if (inici <= fi) {
            for (int i = inici; i <= fi; i++) {
                char c = text.charAt(i);
                System.out.println(c);
            }
            System.out.println();   
        }    
        
        if (inici > fi) {
            for (int i = inici; i >= fi; i--) {
                char c = text.charAt(i);
                System.out.println(c);
            }
            System.out.println();  
        
        }
    }
}
