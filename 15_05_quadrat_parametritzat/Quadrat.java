/*Desenvolupa un programa anomenat Quadrat que esperi un valor enter positiu en args[0] i mostri un quadrat de " X" amb el costat indicat pel valor rebut.*/
public class Quadrat {
    public static void main(String[] args) {
        int valor = Integer.parseInt(args[0]);
        dibuixaQuadrat(valor); 
    }
    
    public static void dibuixaQuadrat(valor) {
        for (int i = 0; i < valor; i++) {
            for (int j = 0; j < valor; j++) {
                System.out.print(" X");
            }
            System.out.println();
        }
    }
}
