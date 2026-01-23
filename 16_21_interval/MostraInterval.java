/**/
public class MostraInterval {
    public static void main(String[] args) {
        System.out.println("text?");
        String text = Entrada.readLine();
        if (text.isBlank()) {
            System.out.println("ERROR, cadena buida");
            return;
        }
        System.out.println("inici?");
        int inici = Integer.parseInt(Entrada.readLine());
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
