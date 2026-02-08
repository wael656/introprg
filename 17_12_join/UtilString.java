/*Implementa una versió simplificada de la utilitat String.join()

La versió que implementarem oferirà dues versions que permetran indicar o no el darrer separador.

Les signatures a implementar són:

// retorna un String format per les cadenes de text separades pel separador amb darrer separador
public static String junta(String[] cadenes, String separador, String darrerSeparador)
// equivalent a junta(cadenes, separador, separador)
public static String junta(String[] cadenes, String separador)*/
public class UtilString {
    public static String junta(String[] cadenes, String separador, String darrerSeparador) {
        String resultat = "";
        for (int i = 0; i < cadenes.length; i++) {
            if (i == cadenes.length-1) {
                resultat += (" " + darrerSeparador + " " + cadenes[cadenes.length-1]); 
            } else if (i == cadenes.length-2) {
                resultat += (cadenes[i]);
            } else {
                resultat+=cadenes[i] + ", ";
            }
        }
        return resultat;
    }
    
    public static String junta(String[] cadenes, String separador) {
        return junta(cadenes, separador);
    }

}
