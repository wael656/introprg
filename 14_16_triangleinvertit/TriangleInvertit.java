/*Desenvolupa un programa anomenat TriangleInvertit, que demani un nombre positiu més gran que 0. El programa escriurà una línia per nombre entre el nombre introduït i el 1 (és a dir, decreixentment). A cada línia escriurà tots els nombres des de l’1 fins el nombre corresponent a la línia.*/
public class TriangleInvertit {
    public static void main(String[] args) {
        System.out.println("Nombre?");
        int n = Integer.parseInt(Entrada.readLine());
        
        if (n < 1 || n > 9) {
            System.out.println("Valor inadequat");
        } else {
        
            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    if (j < i) {
                        System.out.print(j + ", ");
                    } else {
                        System.out.print(j);
                      }
                }
                System.out.println();
            }
        }
    }
}
