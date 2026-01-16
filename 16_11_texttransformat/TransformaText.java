/*Desenvolupa un programa anomenat TransformaText, que demani un text i mostri una versió transformada segons les següents regles:

Les vocals (les catalanes) apareixeran en minúscules

Les lletres no vocals apareixeran en majúscules

Els nombres (atenció, no els dígits!) apareixeran entre parèntesis ()

La resta de caràcters, excepte els blancs, desapareixen a la versió transformada*/
public class TransformaText {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        System.out.println(transformaText(text));
    }
    
    public static String transformaText(String text) {
        String resultat = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                resultat+=c;
            }
            
            if (text == "   ") {
                resultat+=text;
            } 
            
            if (UtilString.esVocal(c)) {
                resultat+=Character.toLowerCase(c);
            } 
                       
            if (UtilString.esConsonant(c)) {
                resultat+=Character.toUpperCase(c);     
            }  
                     
            if (Character.isDigit(c)) {
                boolean primer = (i == 0 || !Character.isDigit(text.charAt(i-1)));
                if (primer) {
                    resultat += "(";
                }
                resultat+=c;
                
                boolean esFinal = (i == text.length()-1) || !Character.isDigit(text.charAt(i+1));
                if (esFinal) {
                    resultat+= ")";
                }
            }        
        }
        return resultat;
    }
}
