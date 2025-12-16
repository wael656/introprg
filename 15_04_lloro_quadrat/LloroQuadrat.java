/*Desenvolupa el programa LloroQuadrat que implementi una versió del lloro que, com és tradicional, vagi demanant texts i els repeteixi fins que arribi un text en blanc o buit.

En aquesta versió, no obstant, si el text que rep és "dibuixa quadrat" o "dibuixa rectangle", en comptes de repetir el text, dibuixarà el quadrat o el rectangle corresponent.

En finalitzar, s'acomiadarà amb el tradicional "Adéu"*/
public class LloroQuadrat {
    public static void main(String[] args) {
        while (true) {
            System.out.println("El lloro espera paraula:");
            String entrada = Entrada.readLine();
            if (entrada.isBlank()) break;        
            if (entrada.equals("dibuixa quadrat")) {
                dibuixaQuadrat();
            }
            
            else if (entrada.equals("dibuixa rectangle")) {
                dibuixaRectangle();
            } else {
                System.out.println("El lloro repeteix: " + entrada);
            }
            
        }
        System.out.println("Adéu");    
    }
    
    public static void dibuixaQuadrat() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" X");
            }
            System.out.println();
        }
    }
    
    public static void dibuixaRectangle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" X");
            }
            System.out.println();
        }
    }
    
    
}
