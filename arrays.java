/*
 * Aquest programa és com el 3 en ratlla però
 * amb N
 * L'objectiu és solidificar els arrays i, ja de
 * pas, treballar mòduls.
 *
 * És un talulell de NxN (ex. 3x3) que conté
 * informació de tres valors possibles:
 * X: representa posició del jugador/a X
 * O: representa posició del jugador/a O
 * .: representa una posició no marcada
 * Inicialment tot hauria de començar amb .
 *
 */
public class arrays {
    public static final int N = 5; // dimensió taula
    public static void main(String[] args) {
 
        mostraTaula(new char[][] {
            {'a', 'e', 'i'},
            {'o', 'u'},
            {'b'},
        }, "taula rara");
 
        //  declara el taula
        char[][] taula;
        taula = new char[N][N];
        mostraTaula(taula, "Inicialització per defecte");
 
        inicialitzaTaula(taula, '.');
        mostraTaula(taula, "Un cop buidat el taula");
 
        inicialitzaTaula(taula, 'X');
        mostraTaula(taula, "Inicialitzat amb X");
 
        inicialitzaTaula(taula, 'O');
        mostraTaula(taula, "Inicialitzat amb O");
 
        // TODO: inicialitza la taula amb O i X intercalades per files
        // O O O 
        // X X X
        // O O O 
        for (int fil=0; fil<taula.length; fil++) {
            for (int col=0; col<taula[fil].length; col++) {
                // if (fil & 1 == 0) {    // super eficient amb bit a bit (bitwise)
                // if (fil / 2.0 - fil / 2 == 0) {    // versió Franz
                if (fil % 2 == 0) {    // parell
                    taula[fil][col] = 'O';
                } else {                // senar
                    taula[fil][col] = 'X';
                }
            }
        }
        mostraTaula(taula, "Zebra OOO/XXX versió amb mòdul");
 
        char jugador = 'O';
        for (int fil=0; fil<taula.length; fil++) {
            for (int col=0; col<taula[fil].length; col++) {
                taula[fil][col] = jugador;
            }
            jugador = jugador == 'O' ? 'X' : 'O';
        }
 
 
        boolean tornO = true;
        for (int fil=0; fil<taula.length; fil++) {
            for (int col=0; col<taula[fil].length; col++) {
                if (tornO) {
                    taula[fil][col] = 'O';
                } else { 
                    taula[fil][col] = 'X';
                }
            }
            tornO = ! tornO;
        }
        mostraTaula(taula, "Zebra OOO/XXX versió sense mòdul");
 
 
        for (int fil=0; fil<taula.length; fil=fil+2) {
            for (int col=0; col<taula[fil].length; col++) {
                taula[fil][col] = 'O';
            }
        }
        for (int fil=1; fil<taula.length; fil=fil+2) {
            for (int col=0; col<taula[fil].length; col++) {
                taula[fil][col] = 'X';
            }
        }
        mostraTaula(taula, "Zebra OOO/XXX versió sense mòdul");
 
 
        // TODO (A CASA) inicialització per columnes
        // O X O X 
        // O X O X 
        // O X O X 
        // O X O X 
        for (int i = 0; i < taula.length; i++) {
            for (int j = 0; j < taula[i].length; j++) {
                if (j % 2 == 0) {
                    taula[i][j] = 'O';
                } else {
                    taula[i][j] = 'X';
                }
            }
        }
 
        // TODO: inicialitza primera diagonal a O
        // O . . .
        // . O . .
        // . . O .
        // . . . O 
        for (int fil=0; fil<taula.length; fil++) {
            for (int col=0; col<taula[fil].length; col++) {
                if (fil == col) {
                    taula[fil][col] = 'O';
                } else {
                    taula[fil][col] = '.';
                }
            }
        }
        mostraTaula(taula, "diagonal netejant");
 
        inicialitzaTaula(taula, '.');
        for (int fil=0; fil<taula.length; fil++) {
            taula[fil][fil] = 'O';
        }
        mostraTaula(taula, "diagonal");
 
        // TODO: segona diagonal
        // . . O
        // . O .
        // O . .
        
 
    }
 
    public static void mostraTaula(char[][] taula, String missatge) {
        //  mostra els valors del taula
        System.out.println(missatge);
        for (int fil=0; fil<taula.length; fil++) {
            for (int col=0; col<taula[fil].length; col++) {
                System.out.printf("%c ", taula[fil][col]);
            }
            System.out.println();
        }
    }
 
    // TODO: treu la N
    public static void inicialitzaTaula(char[][] taula, char valor) {
        for (int fil=0; fil<N; fil++) {
            for (int col=0; col<N; col++) {
                taula[fil][col] = valor;
            }
        }
    }
 
    //public static void inicialitzaTaulaABlanc(char[][] taula) {
    //    inicialitzaTaula(taula, '.');
    //}
 
    //public static void inicialitzaTaulaAX(char[][] taula) {
    //    inicialitzaTaula(taula, 'X');
    //}
 
    //public static void inicialitzaTaulaAO(char[][] taula) {
    //    inicialitzaTaula(taula, 'O');
    //}
 
}
