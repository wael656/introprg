/*Desenvolupa un programa anomenat Codifica, que demanarà un text i el mostrarà codificat segons les següents instruccions:

Només codificarem les lletres entre la a i la z minúscules de l'alfabet llatí. La resta d'elements que apareguin al text, es mantindran iguals.

Cada lletra serà reemplaçada per la següent en l'ordre alfabètic, excepte la z, que serà substituïda per la a.*/
public class Codifica {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        mostraCodificat(text);
    }
    
    public static void mostraCodificat(String text) {
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == 'z') {
                c = 'a';
                System.out.print(c);
            } else if (c == 'é') {
                c = 'é';
                System.out.print(c);
            } else if (c == 'ú') {
                c = 'ú';
                System.out.print(c);
            } else if (Character.isLetter(c) && Character.isLowerCase(c)) {
                c+=1;
                System.out.print(c); 
            } else {
                System.out.print(c);
            }
        }
        System.out.println();
    }
}
