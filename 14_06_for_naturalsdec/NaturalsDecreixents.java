/*Crea una nova versió de l'exercici anterior. Aquest cop, el programa es dirà NaturalsDecreixents i, en comptes de mostrar els nombres de manera creixent, o farà decreixentment.*/
public class NaturalsDecreixents {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        if (num < 1) {
            System.out.println("Cap valor decreixent entre " + num + " i 1");
        }
        
        for (int i = num; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
