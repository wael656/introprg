/*Desenvolupa una nova versió del programa anterior. Aquest cop, des de main es cridarà un mòdul anomenat dibuixaQuadrats() que farà la feina de demanar el número de quadrats a dibuixar i els dibuixarà.

La sortida serà la mateixa que per la versió anterior*/
public class Quadrats {
    public static void main(String[] args) {
        dibuixaQuadrats();
    }
    
    public static void dibuixaQuadrats() {
        System.out.println("Quants?");
        int quants = Integer.parseInt(Entrada.readLine());
        for (int k = 0; k < quants; k++) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(" X");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
