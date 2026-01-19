/*Desenvolupa una nova versió de l'exercici que codificava un text.

Aquesta nova versió també demanarà un text per entrada estàndard, però esperarà un índex per línia de comandes i, en cas que no correspongui a un enter o bé aquest sigui negatiu, generarà un error i finalitzarà.

Pot suposar que Codifica sempre rebrà l'índex.

La nova versió també requerirà reemplaçar l'antic procediment mostraCodificat() per una funció anomenada codifica() que rebrà el text a codificar i un índex, i retornarà el text codificat a partir de l'índex especificat.

La signatura serà: String codifica(String text, int index).*/
public class Codifica {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        int num = Integer.parseInt(args[0]);
        System.out.println(codifica(text, num));
    }
    
    public static String codifica(String text, int index) {
        String resultat = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == 'é') {
                c = 'é';
                resultat+=c;
            }
            if (index < 0) {
                index = 0;
            } else if (Character.isLetter(c) && Character.isLowerCase(c) || c != 'é') {
                for (int j = 0; j < index; j++) {
                    c++;
                    if (c > 'z') {
                        c = 'a';
                    }
                }
            } else if (Character.isLetter(c) && Character.isUpperCase(c)) {
                for (int j = 0; j < index; j++) {
                    c++;
                    if (c > 'Z') {
                        c = 'A';
                    }
                }
                
            } else if (Character.isDigit(c)) {
                for (int j = 0; j < index; j++) {
                    c++;
                    if (c > '9') {
                        c = '0';
                    }
                }
            } 
            resultat+=c;
        }
        return resultat;        
    }
}
