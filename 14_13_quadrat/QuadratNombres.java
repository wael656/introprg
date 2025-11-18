/*Escriu un programa anomenat QuadratNombres, que demani un enter entre 1 i 9, i "dibuixi" un quadrat amb els nombres del 1 fins el valor de l'entrada.

En cas que l'entrada sigui un valor no vàlid, el programa mostrarà el missatge Valor inadequat.*/
public class QuadratNombres {
    public static void main(String[] args) {
        System.out.println("Valor final?");
        int n = Integer.parseInt(Entrada.readLine());
        
        if (n < 1) {
            System.out.println("Valor inadequat");
        } else {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(" " + j);
                }
                System.out.println();
            }
        }
    }
}
