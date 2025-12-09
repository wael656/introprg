/*Desenvolupa un programa anomenat ConteDarrer, que vagi demanant texts fins que un no contingui el darrer caràcter del text anterior. El primer text és acceptat sempre a menys que estigui buit.*/
public class ConteDarrer {
    public static void main(String[] args) {
        System.out.println("Introdueix texts (enter sol per finalitzar)");
        boolean primer = true;
        char ultim = ' ';
        
        while (true) {
            String text = Entrada.readLine();
            
            if (text.isBlank()) {
                break;
            }
            
            
                if (!primer) {
                    boolean trobada = false;
                    
                    for (int i = 0; i < text.length(); i++) {
                        char c = text.charAt(i);
                        
                        if (Character.toLowerCase(c) == Character.toLowerCase(ultim)) {
                            trobada = true;
                            break;
                        }
                    }
                    
                    if (trobada == false) {
                        break;
                    }
                }
                System.out.println("bé");
                ultim = text.charAt(text.length()-1);                
                primer = false;            
            }
        System.out.println("Adéu");
    }
}
