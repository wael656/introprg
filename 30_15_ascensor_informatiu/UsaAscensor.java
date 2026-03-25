/*Considera la següent simulació de la sortida de UsaAscensor un cop completat:

 Pis inicial: -1
 Moviment inicial: aturat
 Introdueix nou pis:
 5
 Introdueix nou moviment:
 pujant
 Pis final: 5
 Moviment final: pujant
 Estat de l'ascensor: pujant al pis 5*/
public class UsaAscensor {
    public static boolean esEnter(String text) {
        if (text == null || text.isEmpty()) {
            return false;
        }

        int i = 0;
        
        if (text.charAt(0) == '+' || text.charAt(0) == '-') {
            i = 1;
            if (text.length() == 1) {
                return false;
            }
        }
        
        while (i < text.length() && text.charAt(i) == '0') {
            i++;
        }
        
        int digitsSignificatius = 0;
        for (int k = i; k < text.length(); k++) {
            char c = text.charAt(k);
            
            if (!Character.isDigit(c)) {
                return false;
            }
            digitsSignificatius++;
        }
        return digitsSignificatius <= 9;
    }    
    
    public static void main(String[] args) {
        Ascensor ascensor = new Ascensor();
        System.out.println("Pis inicial: " + ascensor.getPis());
        System.out.println("Moviment inicial: " + ascensor.getMoviment());
        System.out.println("Introdueix nou pis:");
        String nouPis = Entrada.readLine();
        if (esEnter(nouPis)) {
            ascensor.setPis(Integer.parseInt(Entrada.readLine()));
        }

        System.out.println("Introdueix nou moviment:");
        ascensor.setMoviment(Entrada.readLine());

        System.out.println("Pis final: " + ascensor.getPis());
        System.out.println("Moviment final: " + ascensor.getMoviment());
        System.out.println("Estat de l'ascensor: " + ascensor.comEsta());
    }
}