/*Desenvolupa un programa anomenat Distribuidor, que implementi un lloro amb finalització una cadena buida.

El lloro anirà distribuint els diferents caracters que vagi rebent en quatre cadenes: una de consonants, una altra per les vocals, una de números i una d'altres símbols. Els guardarà en l'ordre en que els rep però sense repetits.*/
public class Distribuidor {
    public static void main(String[] args) {
        System.out.println("Introduïu texts (INTRO per finalitzar)");
        String entrada = Entrada.readLine();
        String vocals = "";
        String cons = "";
        String num = "";
        String simbols = "";
        String consonants = "QWRTYPSDFGHJKLZXCVBNMß";
        
        
        while (!entrada.isBlank()) {
            for (int i = 0; i < entrada.length(); i++) {
                char c = entrada.charAt(i);
                c = Character.toUpperCase(c);
                
                if (c !=  ' ') {
                    boolean repetit = false;
                
                
                    if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'À' || c == 'É' || c == 'Ï' || c == 'Ò' || c == 'Ó' || c == 'Ú' || c == 'È' || c == 'Ü') {
                        for (int k = 0; k < vocals.length(); k++) {
                            if (vocals.charAt(k) == c) {
                                repetit = true;        
                            }
                        }
                        
                        if (!repetit) {
                            vocals+=c;
                        }
                        
                            
                    } else if (Character.isDigit(c)) {
                        for (int k = 0; k < num.length(); k++) {
                            if (num.charAt(k) == c) {
                                repetit = true;
                            }
                        }
                        
                        if (!repetit) {
                            num+=c;
                        }               
                        
                      }  
                      if (!Character.isDigit(c) && !Character.isLetter(c)) {
                        for (int k = 0; k < simbols.length(); k++) {
                            if (simbols.charAt(k) == c)  {
                                repetit = true;
                            }
                        }
                        
                        if (!repetit) {
                            simbols+=c;
                        }
                      }    
                    
                    for (int j = 0; j < consonants.length(); j++) {
                        if (c == consonants.charAt(j)) {
                            for (int k = 0; k < cons.length(); k++) {
                                if (cons.charAt(k) == c) {
                                    repetit = true;
                                }
                            }
                            
                            if (!repetit) {
                                cons+=c;
                            }
                        }
                    }
                }
            }
            
             entrada = Entrada.readLine();
        }
        if (!vocals.isBlank()) {
            System.out.println("Vocals: " + vocals);
        }
        if (!cons.isBlank()) {
            System.out.println("Consonants: " + cons);
        }
        if (!num.isBlank()) {
            System.out.println("Nombres: " + num);
        }
        if (!simbols.isBlank()) {
            System.out.println("Símbols: " + simbols);
        }
    }
}
