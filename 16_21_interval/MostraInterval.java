/*Recuperem l'exercici que mostrava la secció d'un String i fem-ne la versió modular

El programa MostraInterval farà pràcticament el mateix que la versió original. Considera els canvis a partir d'aquesta nova interacció:

Text?
Java rocks
inici?
5
final?
7
roc*/
public class MostraInterval {
    public static void main(String[] args) {
        int inici = 0;
        int fin = 0;
        System.out.println("text?");
        String text = Entrada.readLine();
        if (text.isBlank()) {
            System.out.println("ERROR: cadena buida");
            return;
        }
        System.out.println("inici?");
        String Sinici = Entrada.readLine();
        if (UtilString.esEnter(Sinici)) {
            inici = Integer.parseInt(Sinici);
        } else {
            System.out.println("ERROR: " + "\"" + Sinici + "\"" + " no és un enter vàlid");
            return;
        }
         
        System.out.println("final?");
        String Sfin = Entrada.readLine();
        if (UtilString.esEnter(Sfin)) {
            fin = Integer.parseInt(Sfin);
        } else {
            System.out.println("ERROR: " + "\"" +  Sfin + "\"" +  " no és un enter vàlid");
            return;
        }
        
        System.out.println(UtilString.intervalString(text,inici,fin));
    }
}
