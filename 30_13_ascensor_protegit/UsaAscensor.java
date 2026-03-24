/*Inicialment, l'ascensor començarà a la planta -1 i aturat.

Completa la següent plantilla de UsaAscensor de manera que obtingui el pis i moviment final en aquest ordre, dels arguments de la línia de comandes:*/
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

        if (args.length >= 2) {
            if (esEnter(args[0])) {
                ascensor.setPis(Integer.parseInt(args[0]));
                ascensor.setMoviment(args[1]);    
            }            
        }
        System.out.println("Pis final: " + ascensor.getPis());
        System.out.println("Moviment final: " + ascensor.getMoviment());
    }
}