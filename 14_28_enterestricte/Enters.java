/*Desenvolupa un programa, anomenat Enters que vagi demanant texts fins rebre la cadena buida.

Per cada text no buit que rebi, indicarà si correspon o no a un nombre enter escrit amb dígits.

Aquest exercici considerarà estrictament els nombres enters formats per dígits, amb la única excepció que el primer caràcter pot ser + o -.*/
public class Enters {
    public static void main(String[] args) {
        System.out.println("Introdueix els texts a analitzar:");
        String text = Entrada.readLine();

        
        while (!text.isBlank()) {
            boolean esDigit = true;
            for (int i = 0; i < text.length(); i++) {
                char n = text.charAt(i); 
                
                if (!Character.isDigit(n) || n == ' ') {
                    esDigit = false;
                } 
                
                if (text.charAt(0) == '-' || text.charAt(0) == '+') {
                    esDigit = true;                    
                } 
                
                if ((text.charAt(0) == '-' || text.charAt(0) == '+') && (text.charAt(1) == '-' || text.charAt(1) == '+')) {
                    esDigit = false;
                }
            }
            if (esDigit) {
                System.out.println("\"" + text + "\"" + " és enter");
            } else {
                System.out.println("\"" + text + "\"" + " no és enter");
            }
            text = Entrada.readLine();
        }
        System.out.println("Adéu");
    }
}
