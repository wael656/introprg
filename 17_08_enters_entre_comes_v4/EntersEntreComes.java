/*En aquesta ocasió, el programa tindrà les següents modificacions:

El programa permetrà decidir quin és el caràcter de separació a mostrar entre els valors.

Per fer-ho, demanarà aquest caràcter i agafarà el primer caràcter que li introdueixin ignorant la resta. En cas que la cadena introduïda sigui buida, considerarà la coma.

La separació dels valors numèrics, la realitzarà un mòdul amb la següent signatura:

public static String entreComes(int[], char)*/
public class EntersEntreComes {
    public static void main(String[] args) {
        System.out.println("Quants?");
        String text = Entrada.readLine();

        while (!UtilString.esEnter(text)) {
            System.out.println("Per favor, un valor enter");
            text = Entrada.readLine();         
        }
        
            int quants = Integer.parseInt(text);
            System.out.println("Separador?");
            String separador = Entrada.readLine();
            char separador2;
            
            if (separador.isEmpty()) {
                separador2 = ',';
            } else {
                separador2 = separador.charAt(0);
            }
            
            int num[] = new int[quants];
            
            for (int i = 0; i < num.length; i++) {
                System.out.println("Valor " + (i+1) + "?");
                text = Entrada.readLine();
                while (!UtilString.esEnter(text)) {
                    System.out.println("Per favor, un valor enter");
                    text = Entrada.readLine();
                }
                num[i] = Integer.parseInt(text);
            }
            System.out.println(UtilString.entreComes(num, separador2));
    }
}
