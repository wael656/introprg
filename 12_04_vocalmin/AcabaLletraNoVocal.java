/*Desenvolupa un programa que llegeixi de l'entrada estàndard un text i indiqui si finalitza o no per lletra no vocal.*/

public class AcabaLletraNoVocal {
    public static void main(String[] args) {
        System.out.println("Text?");
        String entrada = Entrada.readLine();
        
        if (entrada.isBlank()) {
            System.out.println("text buit");
        } else {     
            if (minuscula.endsWith("a") || minuscula.endsWith("e") || minuscula.endsWith("i") || minuscula.endsWith("o") || minuscula.endsWith("u") || minuscula.endsWith("A") || minuscula.endsWith("E") || minuscula.endsWith("I") || minuscula.endsWith("O") || minuscula.endsWith("U")) {
                System.out.println("\"" + entrada + "\"" + " no finalitza amb lletra no vocal ");
            } else {
                System.out.println("\"" + entrada + "\"" + " finalitza amb lletra no vocal " + "'" + entrada.charAt(entrada.length() - 1) + "'");
            }
        }
    }
}
