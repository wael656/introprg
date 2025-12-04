/*Desenvolupa una nova versió del programa Exercici 14_28. Enters estrictes. En aquesta ocasió implementaràs una interpretació més flexible dels enters.

En concret, a banda dels enters estrictes:

Cal ignorar els espais en qualsevol lloc que hi puguin aparèixer.

Cal ignorar els separadors (punts . i guions baixos _) sempre i quant es trobin entre dos dígits doncs poden fer la funció de separació.

Per exemple, 192.168.0.1 es considera un enter.*/
public class Enters {
    public static void main(String[] args) {
        System.out.println("Introdueix els texts a analitzar:");
        String entrada = Entrada.readLine();
        
        while (!entrada.isBlank()) {
            boolean esEnter = true;
            
            for (int i = 0; i < entrada.length(); i++) {
                char n = entrada.charAt(i);
                if (!Character.isDigit(n)) {
                    esEnter = false;
                }
                
                if (n == ' ') {
                    esEnter = true;
                }
                
                if (n == '.' || n == '_') {
                    esEnter = true;
                }
                
                if (entrada.charAt(0) == '-' || entrada.charAt(0) == '+') {
                    esEnter = true;
                }
                
                if (n == ' ' && (entrada.charAt(0) == '-' || entrada.charAt(0) == '+')) {
                    esEnter = true;
                }
                
                if ((entrada.charAt(0) == '-' || entrada.charAt(0) == '+') && (entrada.charAt(1) == '-' || entrada.charAt(1) == '+')) {
                    esEnter = false;
                }            
            }
            if (esEnter) {
                System.out.println("\"" + entrada + "\"" + " és enter");
            } else {
                System.out.println("\"" + entrada + "\"" + " no és enter");
            }
            entrada = Entrada.readLine();
        }
        System.out.println("Adéu");    
    }
}
