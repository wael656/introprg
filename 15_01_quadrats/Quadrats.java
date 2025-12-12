/*Desenvolupa un programa anomenat Quadrats que demani un número per entrada estàndard, i dibuixi tants quadrats com indiqui el número. Si el número és 0 o negatiu, no dibuixarà res.

Els quadrats els anirà dibuixant separant-los per una línia en blanc.*/
public class Quadrats {
    public static void main(String[] args) {
        System.out.println("Quants?");
        int quants = Integer.parseInt(Entrada.readLine());
        
        for (int k = 0; k < quants; k++) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print("X ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
