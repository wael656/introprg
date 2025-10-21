/*Desenvolupa un programa anomenat AnalitzaCaracter que demani un text i una posició.

Si el text és buit, indicarà "Text buit" i finalitzarà sense demanar res més.*/

public class AnalitzaCaracter {
    public static void main(String[] args) {
        System.out.println("Text?");
        String entrada = Entrada.readLine();
        if (entrada.isBlank()) {
            System.out.println("Text buit");
        } else {
            System.out.println("Posició?");
            int posicio = Integer.parseInt(Entrada.readLine());
            
            if (posicio <= entrada.length() - 1) {
                if (Character.isLetter(entrada.charAt(posicio)) && Character.isLowerCase(entrada.charAt(posicio))) {
                    System.out.println("'" + entrada.charAt(posicio) + "'" + " és una lletra minúscula");
                } else if (Character.isLetter(entrada.charAt(posicio)) && Character.isUpperCase(entrada.charAt(posicio))) {
                    System.out.println("'" + entrada.charAt(posicio) + "'" + " és una lletra majúscula");  
                } else if (Character.isDigit(entrada.charAt(posicio))) {
                    System.out.println("'" + entrada.charAt(posicio) + "'" + " és un dígit");
                } else {
                    System.out.println("'" + entrada.charAt(posicio) + "'" + " és una altra cosa");
                }
            }
        }
    }
}
