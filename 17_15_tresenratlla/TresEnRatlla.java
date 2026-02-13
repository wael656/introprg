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
        // Declara i inicialitza el tauler
        char[][] tauler = new char[3][3];
        
        // Inicialització neta (borra los bloques repetidos que tenías)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tauler[i][j] = '·';
            }
        }

        System.out.println("Comença el joc");
        char torn = 'X';

        while (true) {
            mostraTaulell(tauler);

            System.out.println(torn + "?");
            String entrada = Entrada.readLine();

            // 1. Abandonament
            if (entrada.equalsIgnoreCase("a")) {
                System.out.println(torn + " abandona");
                return;
            }

            // 2. Validació de format (dos dígits)
            if (entrada.length() == 2 && 
                Character.isDigit(entrada.charAt(0)) && 
                Character.isDigit(entrada.charAt(1))) {
                
                int fila = entrada.charAt(0) - '0';
                int col = entrada.charAt(1) - '0';
                
                // 3. Validació de rang (0-2)
                if (fila < 0 || fila > 2 || col < 0 || col > 2) {
                    System.out.println("Coordenades no vàlides");
                } 
                // 4. Validació d'ocupació
                else if (casellaOcupada(tauler, fila, col)) {
                    System.out.println("Casella ocupada");
                } 
                else {
                    tauler[fila][col] = torn;

                    
                    if (jugadorGuanya(tauler, torn)) {
                        mostraTaulell(tauler);
                        System.out.println(torn + " guanya");
                        return;
                    }

                    if (hiHaEmpat(tauler)) {
                        mostraTaulell(tauler);
                        System.out.println("Empat");
                        return;
                    }

                    // Canvi de torn (només si hem mogut fitxa)
                    if (torn == 'X') {
                        torn = 'O';
                    } else {
                        torn = 'X';
                    }
                } 

            } else {
                System.out.println("Coordenades no vàlides");
            }
        }
    }
}
