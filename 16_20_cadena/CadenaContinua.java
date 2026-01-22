/*Desenvolupa una nova versió de l'exercici que mostrava una cadena contínua.

La nova versió tindrà la mateixa sortida que l'original però el codi del programa serà més modular. En concret, el mòdul main() se n'encarregarà d'obtenir les dades d'entrada, i cridarà un nou mòdul anomenat mostraCadenaContinua() que serà qui realitzi realment la feina de mostrar el resultat.*/
public class CadenaContinua {
    public static void main(String[] args) {
       System.out.println("Text?");
        String text = Entrada.readLine();
        if (text.isBlank()) {
            System.out.println("error");
        } else {
            System.out.println("Nombre?");
            String numero = Entrada.readLine();
            for (int i = 0; i < numero.length(); i++) {
                if (!Character.isDigit(numero.charAt(i))) {
                    System.out.println("error");  
                    break;  
                } else {
                    int num = Integer.parseInt(numero);
                
                    if (num < 0) {
                        System.out.println();
                    } else {
                        System.out.println(UtilString.cadenaContinua(text, num)); 
                    }
                }
            } 
        }
    }
}
