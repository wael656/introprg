/*Desenvolupa una nova versió de l'exercici que codificava un text.

Aquesta nova versió també demanarà un text per entrada estàndard, però esperarà un índex per línia de comandes i, en cas que no correspongui a un enter o bé aquest sigui negatiu, generarà un error i finalitzarà.

Pot suposar que Codifica sempre rebrà l'índex.

La nova versió també requerirà reemplaçar l'antic procediment mostraCodificat() per una funció anomenada codifica() que rebrà el text a codificar i un índex, i retornarà el text codificat a partir de l'índex especificat.

La signatura serà: String codifica(String text, int index).*/
public class Codifica {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        System.out.println("Índex?");
        int num = Integer.parseInt(Entrada.readLine());
        System.out.println(codifica(text, num));
    }
    
    public static String codifica(String text, int index) {
        String resultat = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (index < 0) {
                index = 0;
            }
            
            if (c == 'z') {
                c = 'a';                
                c+=index;
                if (index >= 1) {
                    c+=-1;
                }
                resultat+=c;
            } else if (c == 'Z') {
                c = 'A';                
                c+=index;
                if (index >= 1) {
                    c+=-1;
                }
                resultat+=c;
            } else if (Character.isLetter(c) && Character.isLowerCase(c)) {
                c+=index;
                resultat+=c;
            } else if (Character.isLetter(c) && Character.isUpperCase(c)) {
                c+=index;
                resultat+=c;
            } else if (Character.isDigit(c)) {
                c+=index;
                resultat+=c;
            } else {
                resultat+=c;
            }
        }
        return resultat;        
    }
}
