/*Desenvolupa un programa que llegeixi de l'entrada estàndard un text i indiqui si finalitza o no per lletra no vocal.*/

public class AcabaLletraNoVocal {
    public static void main(String[] args) {
        System.out.println("Text?");
        String entrada = Entrada.readLine();
        
        if (entrada.isBlank()) {
            System.out.println("text buit");
        } else {     
            if (entrada.endsWith("a") || entrada.endsWith("e") || entrada.endsWith("i") || entrada.endsWith("o") || entrada.endsWith("u") || entrada.endsWith("A") || entrada.endsWith("E") || entrada.endsWith("I") || entrada.endsWith("O") || entrada.endsWith("U")) {
                System.out.println("\"" + entrada + "\"" + " no finalitza amb la lletra no vocal ");
            } else {
                System.out.println("\"" + entrada + "\"" + " finalitza amb la lletra no vocal " + "'" + entrada.charAt(entrada.length() - 1) + "'");
            }
        }
    }
}
