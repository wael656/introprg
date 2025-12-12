/*Desenvolupa una nova versió del programa anterior. Aquest cop, des de dibuixaQuadrats() es cridarà un mòdul anomenat dibuixaQuadrat() que farà la feina de dibuixar les difents línies del quadrat fent servir dibuixaLinia()*/
public class Quadrats {
    public static void main(String[] args) {
        dibuixaQuadrats();
    }
    
    public static void dibuixaQuadrats() {
        System.out.println("Quants?");
        int quants = Integer.parseInt(Entrada.readLine());
        for (int k = 0; k < quants; k++) {
            dibuixaQuadrat();
            System.out.println();
        }

    }
    
    public static void dibuixaQuadrat() {        
        for (int i = 0; i < 5; i++) {
            dibuixaLinia();
        }
    }
    
    public static void dibuixaLinia() {
        for (int j = 0; j < 5; j++) {
            System.out.print(" X");
            
        }
        System.out.println();
    }
}
