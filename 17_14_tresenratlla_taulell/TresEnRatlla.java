/* Tornem a considerar l'exercici del tres en ratlla

En aquesta ocasió representarem tot el tauler, no amb variables separades fila0, fila1 i fila2, sinó amb una taula de caràcters. */
public class TresEnRatlla {
    public static void main(String[] args){
        // declaració del tauler
        char[][] tauler = new char[3][3];

        // inicialització de la fila 0
        tauler[0][0] = '·';
        tauler[0][1] = 'O';
        tauler[0][2] = 'O';

        // inicialització de la resta de files
        tauler[1][0] = '·';
        tauler[1][1] = 'X';
        tauler[1][2] = '·';
        
        
        tauler[2][0] = '·';
        tauler[2][1] = '·';
        tauler[2][2] = 'X';
        
        // mostra la posició inicial del tauler
        System.out.println("La posició inicial del taulell:");
        mostraFila(tauler[0]);     // mostra la línia 0
        mostraFila(tauler[1]);     // mostra la línia 1
        mostraFila(tauler[2]);     // mostra la línia 2

        // demana coordenades del moviment del jugador X
        System.out.println("Fila del següent moviment?");
        int fila = Integer.parseInt(Entrada.readLine());
        System.out.println("Columna del següent moviment?");
        int columna = Integer.parseInt(Entrada.readLine());

        // marquem el nou moviment
        /*
           TODO: cal comprovar que les coordenades siguin vàlides i
           que la casella estigui buida.
       
       

           Si tot és correcte, caldrà completar:

            tauler[ XXX ][ XXX ] = 'X';
        */
        if (fila >= 0 && fila <= 2) {
            if (columna >= 0 && columna <= 2) {
                if (tauler[fila][columna] == '·') {
                    tauler[fila][columna] = 'X';
                } else {
                    System.out.println("Posició ocupada");
                    return;
                }
            }
        }
        

        // tornem a mostrar el tauler
        System.out.println("La posició final del taulell:");
        for (int i = 0; i < tauler.length; i++) {
           mostraFila(tauler[i]);
        }
    }

    // mostra el contingut de la fila per sortida estàndard
    public static void mostraFila(char[] fila) {
        for (int col = 0; col < fila.length; col++) {
            System.out.print(fila[col]);
        }
        System.out.println();
    }
}
