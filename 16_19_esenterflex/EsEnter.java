/*Recuperem l'exercici que mostrava si una cadena contenia o no un valor enter i fem-ne la versió modular.

El programa EsEnter farà pràcticament el mateix que l'antic Enters, amb les següents diferències:*/
public class EsEnter {
    public static void main(String[] args) {
        System.out.println("Introdueix els texts a analitzar:");
        while (true) {
            String text = Entrada.readLine();

            if (text.isBlank()) {
                System.out.println("Adéu");
                break;
            }
            if (UtilString.esEnter(UtilString.normalitzaBlancs(text))) {
                System.out.println("\"" + text + "\"" + " és enter");
            } else {
                System.out.println("\"" + text + "\"" +  " no és enter");
            }
        }
    }
}
