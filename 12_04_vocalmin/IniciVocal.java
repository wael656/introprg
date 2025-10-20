/*Desenvolupa un programa que llegeixi de l'entrada estàndard un text i indiqui si comença o no per vocal, sigui majúscules o minúscules.*/

public class IniciVocal {
    public static void main(String[] args) {
        System.out.println("Text?");
        String entrada = Entrada.readLine();
        
        String minuscules = entrada.toLowerCase();
        if (minuscules.startsWith("a") || minuscules.startsWith("e") || minuscules.startsWith("i") || minuscules.startsWith("o") || minuscules.startsWith("u")) {
            System.out.println("\"" + entrada + "\"" + " inicia amb vocal " + "'" + entrada.charAt(0) + "'");
        } else {
            System.out.println("\"" + entrada + "\"" + " no inicia amb vocal.");
        }
    }
}
