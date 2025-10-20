/*Desenvolupa un programa que llegeixi de l'entrada estàndard un text i indiqui si finalitza o no per lletra no vocal.*/

public class AcabaLletraNoVocal {
    public static void main(String[] args) {
        System.out.println("Text?");
        String entrada = Entrada.readLine();
        String minuscules = entrada.toLowerCase();
        char ultimo = minuscules.charAt(minuscules.length() - 1);

        
        if (!minuscules.endsWith("a") && !minuscules.endsWith("e") && !minuscules.endsWith("i") && !minuscules.endsWith("o") && !minuscules.endsWith("u")) {
            System.out.println("\"" + entrada + "\"" + " finalitza amb la lletra no vocal " + "'" + entrada.charAt(entrada.length() - 1) + "'");
        } else if (entrada.isBlank()) {
            System.out.println("El text no té lletres");  
          } else if (!Character.isLetter(ultimo)) {
                System.out.println("\"" + entrada + "\"" + " no finalitza amb lletra no vocal");
            }    
    }
}
