public class Ewhile {
    public static void main(String[] args) {
        System.out.println("Paraula?");
        String entrada = Entrada.readLine();
        int cont = 0;
        int contConsonants = 0;
        int contVocals = 0;
        
        while (!entrada.isEmpty()) {
            if (entrada.length() == 1) {
                System.out.println("Error, torna a intentar:");
                entrada = Entrada.readLine();
            } else {
                if (entrada.charAt(entrada.length() - 2) == 'a') {
                    cont++;
                } else if (entrada.charAt(entrada.length() - 2) == 'a' || entrada.charAt(entrada.length() - 2) == 'e' || entrada.charAt(entrada.length() - 2) == 'i' || entrada.charAt(entrada.length() - 2) == 'o' || entrada.charAt(entrada.length() - 2) == 'u') {
                    contVocals++;
                } else {
                    contConsonants++;
                }              
                System.out.println("Paraula?");
                entrada = Entrada.readLine();               
              }                
        }
        System.out.println("Hi han " + cont + " paraules amb la lletra A de penúltima");
        System.out.println("Hi han " + contVocals + " vocals");
        System.out.println("Hi han " + contConsonants + " consonants");
    }
}
