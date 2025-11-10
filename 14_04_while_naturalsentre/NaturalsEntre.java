/*Desenvolupa el programa NaturalsEntre que demani tres nombres enters no negatius, i escrigui els valors entre el primer i el segon saltant d'un al següent amb el tercer.*/
public class NaturalsEntre {
    public static void main(String[] args) {
        System.out.println("Valor inicial?");
        int valorI = Integer.parseInt(Entrada.readLine());
        System.out.println("Valor final?");
        int valorF = Integer.parseInt(Entrada.readLine());
        System.out.println("Salt?");
        int salt = Integer.parseInt(Entrada.readLine());
        
        int i = valorI;        
        while (i <= valorF) {
            System.out.println(i);
            i = i + salt;
        }
    }
}
