/* En aquest exercici implementarem el joc del tres en ratlla de manera que es pugui jugar.

El joc començarà amb el tauler en blanc i anirà demanant moviments alternativament a cada jugador.

Els jugadors són ㄨ i 〇. Sempre començarà el jugador ㄨ.*/
public class TresEnRatlla {

    // mòduls de suport
    public static void mostraTaulell(char[][] tauler) {
        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler[i].length; j++) {
                System.out.print(tauler[i][j]);
            }
            System.out.println();
        }
    }
    
    public static boolean casellaOcupada(char[][] tauler, int fila, int col) {
        boolean ocupat = true;
        if (fila >= 0 && fila <= 2 && col >= 0 && col <= 2) {
            if (tauler[fila][col] == '·') {
                ocupat = false;
            } 
        }
        return ocupat;
    }
    
    public static boolean jugadorGuanya(char[][] tauler, char jugador) {
        for (int i = 0; i <= 2; i++) {
            if (tauler[0][i] == jugador && tauler[1][i] == jugador && tauler[2][i] == jugador) {
                return true;
            } 
        }
        
        for (int i = 0; i <= 2; i++) {
            if (tauler[i][0] == jugador && tauler[i][1] == jugador && tauler[i][2] == jugador) {
                return true;
            }
        }
        
        if (tauler[0][0] == jugador && tauler[1][1] == jugador && tauler[2][2] == jugador) {
            return true;
        } else if (tauler[0][2] == jugador && tauler[1][1] == jugador && tauler[2][0] == jugador) {
            return true;
        }        
        return false;
    }
    
    public static boolean hiHaEmpat(char[][] tauler) {
        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler[i].length; j++) {
                if (tauler[i][j] == '·') {
                    return false;
                }
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        // declara i inicialitza el tauler
        char[][] tauler = new char[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tauler[i][j] = '·';
            }
        }
        tauler[0][0] = '·';
        tauler[0][1] = '·';
        tauler[0][2] = '·';

        tauler[1][0] = '·';
        tauler[1][1] = '·';
        tauler[1][2] = '·';
        
        
        tauler[2][0] = '·';
        tauler[2][1] = '·';
        tauler[2][2] = '·';

        System.out.println("Comença el joc");

        // indica quin és el jugador que té el torn
        int fila = 0;
        int col = 0;
        char torn = 'X';

        while (true) {
            mostraTaulell(tauler);

            // obté el moviment del jugador actual
            System.out.println(torn + "?");
            String entrada = Entrada.readLine();

            // comprova abandonament
            if (entrada.equals("a") || entrada.equals("A")) {
                System.out.println(torn + " abandona");
                return;
            }

            // obté coordenades del moviment            
            if (entrada.length() == 2 && Character.isDigit(entrada.charAt(0)) && Character.isDigit(entrada.charAt(1))) {
                fila = entrada.charAt(0) - '0';
                col = entrada.charAt(1) - '0';
                
                

            // comprova si la casella està ocupada
                if (!casellaOcupada(tauler, fila, col)) {
                    tauler[fila][col] = torn;
                    

            // comprova jugador guanya
            if (jugadorGuanya(tauler, torn)) {
                System.out.println(torn + "OO");
                return;
            }

            // comprova empat
            if (hiHaEmpat(tauler)) {
                System.out.println("Empat");
                return;
            } 

            // passa torn a l'altre jugador
                if (torn == 'X') {
                    torn = 'O';
                } else {
                    torn = 'X';
                }
            } else {
                System.out.println("Casella ocupada");
            }
        }
    }
}
}
