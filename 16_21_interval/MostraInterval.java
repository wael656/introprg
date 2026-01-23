/**/
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
        if (inici < 0) {
            inici = 0;
        }
        
        if (inici > text.length()-1) {
            inici = text.length() -1;
        } 
        System.out.println("final?");
        String Sfin = Entrada.readLine();
        if (UtilString.esEnter(Sfin)) {
            fin = Integer.parseInt(Sfin);
        } else {
            System.out.println("ERROR: " + "\"" +  Sfin + "\"" +  " no és un enter vàlid");
        }
        if (fin > text.length()-1) {
            fin = text.length() -1;
        } 
        if (fin < 0) {
            fin = 0;
        }
        System.out.println(UtilString.intervalString(text,inici,fin));
    }
}
