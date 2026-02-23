public class prova {
    public static void main(String[] args) {
        String[] fruites = {"Poma", "Plàtan", "Kiwi"};
        int[][] vendes = {
                {5, 2, 3},
                {1, 4, 7},
                {4, 23, 23}};
        mostrar(vendes);
        totalVendes(vendes);
    }
    
    public static void mostrar(int[][] vendes) {
        for (int i = 0; i < vendes.length; i++) {
            System.out.print("Dia" + (i+1) + " ");
            for (int j = 0; j < vendes[i].length; j++) {
                System.out.print(vendes[i][j] + " ");
            
            }
            System.out.println();
        }
    }
    
    public static void totalVendes(int[][] vendes) {
        int[] total = new int[3];
        for (int i = 0; i < vendes.length; i++) {
            for (int j = 0; j < vendes[i].length; j++) {
                total[i] += vendes[i][j];
            }
            System.out.println(total[i]);
        }
    }
}
