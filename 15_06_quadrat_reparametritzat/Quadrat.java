/*Farem ara una nova versió del quadrat parametritzat. En aquesta ocasió, el programa serà capaç de mostrar un caràcter diferent de X a partir del que main() rebi a args[1]

Per simplificar, pressuposarem també que sempre ens donen aquest segon argument i que ens quedarem amb el primer caràcter.*/
public class Quadrat {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        char c = args[1].charAt(0);
        dibuixaQuadrat(num, c);
    }
    
    public static void dibuixaQuadrat(int num, char c) {
        for (int i = 0; i < num; i++) {
            dibuixaLinia(num, c);    
        }
    }
    
    public static void dibuixaLinia(int num, char c) {
        for (int j = 0; j < num; j++) {
            System.out.print(" " + c);
        }
        System.out.println();
    }
}
