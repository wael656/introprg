/*Desenvolupa el programa LletresInterval que mostrarà un intèrval de lletres.
El programa demanarà la lletra inicial i quantes lletres ha de mostrar.*/
public class LletresInterval {
    public static void main(String[] args) {
        System.out.println("lletra?");
        String entrada = Entrada.readLine();
        char lletra = entrada.charAt(0);
        
        if (entrada.length() > 1 || entrada.isBlank()) {
            System.out.println("ERROR: cal especificar una única lletra.");
        } else if (entrada.charAt(0) == '!' || entrada.charAt(0) == 'ß' || entrada.charAt(0) == 'à' || entrada.charAt(0) == 'は') {
            System.out.println("ERROR: " + "'" + lletra + "'" + " no és una lletra vàlida.");
        } else if (Character.isDigit(lletra)) {
            System.out.println("ERROR: " + "'" + lletra + "'" + " no és una lletra vàlida.");            
        } else {
        
            System.out.println("quantes?");
            int quantes = Integer.parseInt(Entrada.readLine());        
            if (quantes < 1) {
                System.out.println("Error");
            } else {       
                
                if (!((lletra >= 'a' && lletra <= 'z') || (lletra >= 'A' && lletra <= 'Z'))) {
                    System.out.println("Error");
                } else {
                    
                    char actual = lletra;
                    
                    for (int i = 0; i < quantes; i++) {
                        System.out.print(actual);
                        if (actual == 'z') {
                            actual = 'a';
                        } else if (actual == 'Z') {
                            actual = 'A';
                        } else {
                            actual++;
                        }
                    }
                    System.out.println();    
                }            
            }
        }
    }
}
