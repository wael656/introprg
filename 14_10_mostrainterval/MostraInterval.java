/*Desenvolupa el programa MostraInterval que demana dos valors enters per entrada estàndard i mostra tots els enters que hi ha entre el primer i el segon, en l'ordre marcat per l'entrada.*/
public class MostraInterval {
    public static void main(String[] args) {
        System.out.println("inici?");
        int inici = Integer.parseInt(Entrada.readLine());
        System.out.println("final?");
        int ffinal = Integer.parseInt(Entrada.readLine());
        
        if (inici < ffinal) {
        
            for (int i = inici; i <= ffinal; i++) {
                System.out.println(i);
            }
        } else {
        
            for (int i = inici; i >= ffinal; i--) {
                System.out.println(i);
            }
        }
    }
}
