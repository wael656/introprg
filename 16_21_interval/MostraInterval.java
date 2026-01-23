/**/
public class MostraInterval {
    public static void main(String[] args) {
        int inici = 0;
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
        }
        if (inici < 0) {
            inici = 0;
        }
        
        if (inici > text.length()-1) {
            inici = text.length() -1;
        } 
        System.out.println("final?");
        int fin = Integer.parseInt(Entrada.readLine());
        if (fin > text.length()-1) {
            fin = text.length() -1;
        } 
        if (fin < 0) {
            fin = 0;
        }
        System.out.println(UtilString.intervalString(text,inici,fin));
    }
}
