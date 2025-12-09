/*En aquesta ocasió farem una nova versió que faci ús dels nous mecanismes de control de bucles.

El programa realitzarà la mateixa funcionalitat que l'exercici original, més:

Permetrà cancel·lar la partida en introduir una entrada buida (tal i com demanava Exercici 13_13. Endevina amb cancel·lació

Comprovarà que l'entrada siguin realment valors enters.

Serà una comprovació més senzilla que la que demanava l'exercici Exercici 14_28. Enters estrictes en el sentit que no cal ignorar espais, ni considerar separadors. Només cal tenir en compte dígits i, opcionalment, que comencin amb un + o un -. Ah! i només cal comprovar els valors de l'entrada estàndard. El de línia de comandes es pot suposar sempre enter.*/
public class EndevinaNombre {
    public static void main(String[] args) {
        int endevina = Integer.parseInt(args[0]);
        String text = "";
            
        while (true) {
            System.out.println("Nombre?");
            text = Entrada.readLine();
            if (text.isBlank()) {
                System.out.println("Cancel·lat!");
                break;
            }
            
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                char primer = text.charAt(0);
                if (!Character.isDigit(c) && primer != '+' && primer != '-') {
                    System.out.println("Només nombres");
                    System.out.println("Nombre?");
                    text = Entrada.readLine();
                    break;
                }            
            } 
            int valor = Integer.parseInt(text);
        
            if (valor < endevina && valor < 101 && valor > 0) {
                System.out.println("Massa petit");   
                } else if (valor > 100) {
                    System.out.println("Fora de rang");
                } else if (valor < 1) {
                    System.out.println("Fora de rang");
                } else if (valor > endevina) {
                    System.out.println("Massa gran");
                } else if (valor == endevina) {
                    System.out.println("Encertat!");
                    return;
                }                   
        }
    }
}
