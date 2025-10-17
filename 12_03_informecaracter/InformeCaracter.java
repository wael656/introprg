/*Desenvolupa un programa anomenat InformeCaracter que demani un text i un número per entrada estàndard. A partir del caracter de la posició indicada pel segon valor, el programa composarà un petit informe amb el resultat de les funcions anteriors.*/
public class InformeCaracter {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        
        if (text.isBlank()) {
            System.out.println("Error");
        } else {
        
        System.out.println("Posició?");
        int posicio = Integer.parseInt(Entrada.readLine());
        
        if (posicio > text.length() - 1 || posicio < 0) {
            System.out.println("Fora de rang"); 
        } else {

        
        System.out.println("Character.getName(" + "\'" + text.charAt(posicio) + "\'" + "): " + Character.getName(text.charAt(posicio))); 
        System.out.println("Character.isDigit(" + "\'" + text.charAt(posicio) + "\'" + "): " + Character.isDigit(text.charAt(posicio)));
        System.out.println("Character.isJavaIdentifierStart(" + "\'" + text.charAt(posicio) + "\'" + "): " + Character.isJavaIdentifierStart(text.charAt(posicio)));
        System.out.println("Character.isJavaIdentifierPart(" + "\'" + text.charAt(posicio) + "\'" + "): " + Character.isJavaIdentifierPart(text.charAt(posicio)));
        System.out.println("Character.isLetter(" + "\'" + text.charAt(posicio) + "\'" + "): " + Character.isLetter(text.charAt(posicio)));
        System.out.println("Character.isLowerCase(" + "\'" + text.charAt(posicio) + "\'" + "): " + Character.isLowerCase(text.charAt(posicio)));
        System.out.println("Character.isUpperCase(" + "\'" + text.charAt(posicio) + "\'" + "): " + Character.isUpperCase(text.charAt(posicio)));
        System.out.println("Character.isWhitespace(" + "\'" + text.charAt(posicio) + "\'" + "): " + Character.isWhitespace(text.charAt(posicio)));
        System.out.println("Character.toLowerCase(" + "\'" + text.charAt(posicio) + "\'" + "): " + Character.toLowerCase(text.charAt(posicio)));
        System.out.println("Character.toUpperCase(" + "\'" + text.charAt(posicio) + "\'" + "): " + Character.toUpperCase(text.charAt(posicio)));
            }
        }
    }
}
