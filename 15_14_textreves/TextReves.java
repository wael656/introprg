/*Desenvolupa un programa anomenat TextReves, que demani un text i el torni a mostrar però invertint l'ordre dels caràcters que el composen. Els caracters resultants apareixeran separats per comes.*/
public class TextReves {
    public static void main(String[] args) {
        System.out.println("Text?");
        String entrada = Entrada.readLine();
        String text = "";
        
        for (int i = entrada.length()-1; i >= 0; i--) {
            text += entrada.charAt(i);
        }
        mostraReves(text);
    }
    
    public static void mostraReves(String text) {
        boolean primer = true;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!primer) {
                System.out.print(", ");
            }
            System.out.print(c);
            primer = false;
        }
        System.out.println();
    }

}
