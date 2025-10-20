/*Desenvolupa un programa que llegeixi de l'entrada estàndard un text i indiqui si finalitza o no per lletra no vocal.*/

public class AcabaLletraNoVocal {
    public static void main(String[] args) {
        System.out.println("Text?");
        String entrada = Entrada.readLine();
        
        if (entrada.isBlank()) {
            System.out.println("text buit");
        } else {
            String minuscula = entrada.toLowerCase();
            char ultimo = minuscula.charAt(minuscula.length() - 1);
            
            if (!minuscula.endsWith("a") && !minuscula.endsWith("e") && !minuscula.endsWith("i") && !minuscula.endsWith("o") && !minuscula.endsWith("u")) {
                System.out.println("\"" + entrada + "\"" + " finalitza amb la lletra no vocal " + "'" + ultimo + "'");
            } else {
                System.out.println("\"" + entrada + "\"" + " no finalitza amb lletra no vocal");
            }
        }
    }
}
