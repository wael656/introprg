/*Desenvolupa un programa anomenat Quadrat que esperi un valor enter positiu en args[0] i mostri un quadrat de " X" amb el costat indicat pel valor rebut.*/
public class Quadrat {
    public static void main(String[] args) {
        int valor = Integer.parseInt(args[0]);
        dibuixaQuadrat(valor); 
    }
    
    public static void dibuixaQuadrat(int valor) {
        for (int i = 0; i < valor; i++) {
            dibuixaLinia(valor);
        }
    }
    
    public static void dibuixaLinia(int valor) {
        for (int i = 0; i < valor; i++) {
            System.out.print(" X");
        }
        System.out.println();
    }
}
