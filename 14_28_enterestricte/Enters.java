/*Desenvolupa un programa, anomenat Enters que vagi demanant texts fins rebre la cadena buida.

Per cada text no buit que rebi, indicarà si correspon o no a un nombre enter escrit amb dígits.

Aquest exercici considerarà estrictament els nombres enters formats per dígits, amb la única excepció que el primer caràcter pot ser + o -.*/
public class Enters {
    public static void main(String[] args) {
        System.out.println("Introdueix els texts a analitzar:");
        String text = Entrada.readLine();
        boolean esDigit = true;
        
        while (!text.isBlank()) {
            for (int i = 0; i < text.length(); i++) {
                char n = text.charAt(i); 
                if (Character.isDigit(n) && text.charAt(0) != ' ') {
                    esDigit = true;
                } else if (Character.isDigit(n) && (text.charAt(0) == '-' || text.charAt(0) == '+')) {
                    esDigit = true;
                } else {
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
