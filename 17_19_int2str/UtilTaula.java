/*Per començar la nostra biblioteca, desenvoluparem una funció pura:

UtilTaula.substitueix(char[][] taula, char inici, char fi)

substitueix() espera una taula de N x M caràcters, i dos caràcters inici i fi, i retorna una altra taula, de les mateixes dimensions, en la que totes les ocurrències del caracter inici apareixeran reemplaçades per fi i la resta de caràcters romandrà igual.*/
public class UtilTaula {
    public static char[][] substitueix(char[][] taula, char inici, char fi) {
        char[][] resultat = new char[taula.length][taula[0].length];
        for (int i = 0; i < taula.length; i++) {
            for (int j = 0; j < taula[i].length; j++) {
                if (taula[i][j] == inici) {
                    resultat[i][j] = fi;
                } else {
                    resultat[i][j] = taula[i][j];
                }
            }
        }
        return resultat;
    }
    
    public static void inicialitzaTaula(int[][] taula, int valor) {
        for (int i = 0; i < taula.length; i++) {
            for (int j = 0; j < taula[i].length; j++) {
                taula[i][j] = valor;
            }
        }
    }
    
    public static String taulaToString(int[][] taula) {
        String taulell = "";
        for (int i = 0; i < taula.length; i++) {
            for (int j = 0; j < taula[i].length; j++) {
                taulell += String.format("%8d", taula[i][j]);
            }
            taulell += "\n";
        }
        return taulell;
    }
}
