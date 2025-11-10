/*Desenvolupa el programa NaturalsEntre que demani tres nombres enters no negatius, i escrigui els valors entre el primer i el segon saltant d'un al següent amb el tercer.*/
public class NaturalsEntre {
    public static void main(String[] args) {
        System.out.println("Valor inicial?");
        int valorI = Integer.parseInt(Entrada.readLine());
        int valorF = 0;
        int salt = 0;
               
        if (valorI < 0) {
            System.out.println("Valor no vàlid");
        } else {
        
            System.out.println("Valor final?");
            valorF = Integer.parseInt(Entrada.readLine());
            if (valorF < 0) {
                System.out.println("Valor no vàlid");
            } else {
                System.out.println("Salt?");
                salt = Integer.parseInt(Entrada.readLine());
                
                if (valorI > valorF) {
                    System.out.println("Error");
                } else {
                
                    if (salt < 0) {
                        System.out.println("Valor no vàlid");
                    } else {
                
                        int i = valorI;        
                        while (i <= valorF) {
                            System.out.println(i);
                            i = i + salt;
                        }
                    }
                }
            }
        }
    }
}
