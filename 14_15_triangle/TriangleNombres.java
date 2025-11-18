/*Desenvolupa un programa anomenat TriangleNombres, que demani un enter entre el 1 i el 9. El programa escriurà una línia per nombre entre el 1 i el nombre introduït (es a dir, creixentment). A cada línia escriurà tots els nombres des del nombre corresponent a la línia fins al 1.*/
public class TriangleNombres {
    public static void main(String[] args) {
        System.out.println("Nombre?");
        int n = Integer.parseInt(Entrada.readLine());
        
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
