/*En diferents exercicis ens hem trobat la necessitat de distingir si un caràcter és o no una vocal. Ara que ja coneixem les funcions, podem definir la nostra funció esVocal() que rebi un caràcter i retorni un booleà indicant si el caràcter correspon o no amb una vocal catalana en minúscules.

Considerarem com a vocals totes les variants d'accents i dièresis de les vocals catalanes. Recorda que aquests variants són, a banda de les cinc habituals, à, è, é, í, ï, ò, ó, ú i ü.*/
public class LloroVocalIniciFi {
    public static void main(String[] args) {
        int cont = 1;
        while (true) {

            System.out.println("Text?");
            String entrada = Entrada.readLine();
            
            if (entrada.isBlank()) {
                System.out.println("Sortir?");
                String resposta = Entrada.readLine();
                if (UtilitatsConfirmacio.respostaABoolean(resposta)) {
                    System.out.println("Adéu");
                    return;
                } else {
                    continue;
                    } 
                }
                
                char primer = entrada.charAt(0);
                char ultim = entrada.charAt(entrada.length() - 1);
                if (UtilString.esVocal(primer) || UtilString.esVocal(ultim)) {
                    
                    if (cont < 10) {
                        System.out.println("  " + cont + ": " + "\"" + entrada + "\"");
                    } else {
                        System.out.println(" " + cont + ": " + "\"" + entrada + "\"");                        
                    }
                    cont++;
            }
        }
    }
}
