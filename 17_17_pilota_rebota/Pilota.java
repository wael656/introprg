/*En aquest programa desde la terminal farme que una pilota estigui en un camp de 9 files i 13 columnes i cada vegada que prenem ENTER avançi una fila i una columna, peró aquesta vegada cada vegada que arribi al limit de files o columnes faci un rebot perque seguiexi el recorregut.*/
public class Pilota {
    public static final int N_FILES = 9;
    public static final int N_COLS = 14;

    public static void netejaPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void mostraCamp(char[][] camp) {
        for (int i = 0; i < N_FILES; i++) {
            for (int j = 0; j < N_COLS; j++) {
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
    public static void netejaPosicio(char[][] camp, int[] posicio) {
        int f = posicio[0];
        int c = posicio[1];
        camp[f][c] = '·';    
    }
    
    public static void posicionaPilota(char[][] camp, int[] posicio) {
        int f = posicio[0];
        int c = posicio[1];
        camp[f][c] = 'O';
    }

    public static int obteFila(int[] posicio) {
        return posicio[0];
    }
    public static int obteCol(int[] posicio) {
        return posicio[1];
    }
    public static int obteIncrFila(int[] increment) {
        return increment[0];
    }   
    public static int obteIncrCol(int[] increment) {
        return increment[1];
    }

    public static void canviaPosicio(int[] posicio, int novaFila, int novaCol) {
        posicio[0] = novaFila;
        posicio[1] = novaCol;
    }
    public static void canviaIncrement(int[] increment, int nouIncFila, int nouIncCol) {
        increment[0] = nouIncFila;
        increment[1] = nouIncCol;
    }
    public static void seguentPosicio(int[] posicio, int[] increment) {
        int fila = obteFila(posicio);
        int col = obteCol(posicio);
        int incFila = obteIncrFila(increment);
        int incCol = obteIncrCol(increment);

        // actualitza la fila
        fila = fila + incFila;
        if (fila < 0) {                     // es passa per sobre
            fila = 1;                       // torna a la primera fila
            incFila = 1;                    // toca baixar
        } else if (fila > N_FILES -1) {     // es passa per sota
            fila = N_FILES -2;
            incFila = -1;
        }

        // actualitza la columna
        col = col + incCol;
        if (col < 0) {
            col = 1;
            incCol = 1;
        } else if (col > N_COLS -1) {
            col = N_COLS -2;
            incCol = -1;
        }

        // actualitza la posició i l'increment
        canviaPosicio(posicio, fila, col);
        canviaIncrement(increment, incFila, incCol);
    }
    public static void main(String[] args)  {
        char[][] camp = new char[N_FILES][N_COLS];
        netejaCamp(camp);

        int[] posicio = new int[2];         // fila, col
        canviaPosicio(posicio, 0, 0);       // posició inicial (0, 0)

        int[] increment = new int[2];       // incFila, incCol
        canviaIncrement(increment, 1, 1);   // desplaçament inicial: 1 fila 1 columna

        do {
            posicionaPilota(camp, posicio);
            netejaPantalla();
            mostraCamp(camp);
            netejaPosicio(camp, posicio);
            seguentPosicio(posicio, increment);
            System.out.printf("%nEnter per continuar");
        } while (Entrada.readLine().isEmpty());

    }
}
