/*Desenvolupa una nova versió de l'exercici que analitzava un caràcter.

La nova versió tindrà el mateix comportament que l'original però el codi serà diferent:

El mòdul main() se n'encarregarà d'obtenir les dades d'entrada, comprovarà que siguin vàlides, mostrarà els errors corresponents, i n'extraurà el caràcter que finalment s'haurà d'analitzar.

Aquest caràcter a analitzar se li passarà al mòdul analitzaCaracter() que serà qui se n'encarregui de realitzar l'anàlisi.*/
public class AnalitzaCaracter {
    public static void main(String[] args) {
        System.out.println("Text?");
        String entrada = Entrada.readLine();
        if (entrada.isBlank()) {
            System.out.println("Text buit");
        } else {
            System.out.println("Posició?");
            int posicio = Integer.parseInt(Entrada.readLine());
            
                
              if (posicio >= entrada.length() || posicio < 0) {
                    posicio = ((posicio % entrada.length()) + entrada.length()) % entrada.length();
              } else if (posicio >= entrada.length() - 1) {
                    posicio = posicio % entrada.length();
                }
                
                char c = entrada.charAt(posicio);
                analitzaCaracter(c);            
        }
    }
    
    public static void analitzaCaracter(char caracter) {
        if (Character.isLetter(caracter) && Character.isLowerCase(caracter)) {
            System.out.println("'" + caracter + "'" + " és una lletra minúscula");
        } else if (Character.isLetter(caracter) && Character.isUpperCase(caracter)) {
            System.out.println("'" + caracter + "'" + " és una lletra majúscula");  
        } else if (Character.isDigit(caracter)) {
            System.out.println("'" + caracter + "'" + " és un dígit");
        } else {
            System.out.println("'" + caracter + "'" + " és una altra cosa");
        } 
    }
}
