/*En aquest programa desde la terminal farme que una pilota estigui en un camp de 9 files i 13 columnes i cada vegada que prenem ENTER avançi una fila i una columna.*/
 public class Pilota {
     public static final int N_FILES = 9;
     public static final int N_COLS = 13;

     public static void netejaPantalla() {
         // NOTA: La neteja de pantalla podria no funcionar fora del terminal.
         System.out.print("\033[H\033[2J");
         System.out.flush();
     }
     public static void mostraCamp(char[][] camp) {
         for (int i=0; i<N_FILES; i++) {
             for (int j=0; j<N_COLS; j++) {
                 System.out.print(camp[i][j]);
             }
             System.out.println();
         }
     }
     public static void netejaCamp(char[][] camp) {
        for (int i = 0; i < camp.length; i++) {
            for (int j = 0; j < camp[i].length; j++) {
                camp[i][j] = '·';
            }
        }
     }
     public static void netejaPosicio(char[][] camp, int fila, int col) {
        camp[fila][col] = '·';
     }
     public static void posicionaPilota(char[][] camp, int fila, int col) {
         camp[fila][col] = 'O';
     }
     public static int seguentFila(int actual) {
         if (actual+1 ==  N_FILES) {
            return 0;
         } else {
            return actual+1;
         }
     }
     public static int seguentCol(int actual) {
         if (actual+1 == N_COLS) {
            return 0;
         } else {
            return actual+1;
         }
     }
     public static void main(String[] args)  {
         char[][] camp = new char[N_FILES][N_COLS];
         netejaCamp(camp);
         int fila = 0;
         int col = 0;
         do {
             posicionaPilota(camp, fila, col);
             netejaPantalla();
             mostraCamp(camp);
             netejaPosicio(camp, fila, col);
             fila = seguentFila(fila);
             col = seguentCol(col);
             System.out.printf("%nEnter per continuar");
         } while (Entrada.readLine().isEmpty());
     }
 }
