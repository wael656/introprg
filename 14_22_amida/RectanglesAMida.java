/*En aquesta ocasió desenvoluparàs un programa anomenat RectanglesAMida que anirà demanant nombres enters fins rebre'n un de negatiu o bé una cadena buida o només formada per espais en blanc.

Per cada nombre que rebi, dibuixarà un rectangle d'asteriscs ('*') amb el nombre de columnes indicat pel número introduït, i el nombre de files indicat pel número anterior. En el cas del primer número, el nombre de files serà 1.

El rectangle estarà encapçalat pel número de columna, començant per la 0. En cas que tingui més de 10 files, després de la 9 passarà un altre cop a la 1. D'igual manera, per cada fila també indicarà el número corresponent.

Finalment mostrarà un resum amb el nombre de rectangles i punts dibuixats, o bé el missatge "Cap rectangle dibuixat".*/
public class RectanglesAMida {
    public static void main(String[] args) {
        int primer = 1;
        System.out.println("1 x ?");
        int num = Integer.parseInt(Entrada.readLine());
        int rectangles = 0;
        int punts = 0;
        
        while (num > -1) {
            
            for (int i = 0; i < num; i++) {
                System.out.print(i % 10);
            }
            System.out.println();
        
            for (int i = 0; i < primer; i++) {
                System.out.print(i + " ");
                for (int j = 1; j <= num; j++) {
                    System.out.print("*");
                    punts++;
                }
                System.out.println();
            }
            primer = num;
            
            System.out.println(num + " x " + "?");
            num = Integer.parseInt(Entrada.readLine());
            rectangles++;
        }
        System.out.println("Rectangles: " + rectangles);   
        System.out.println("Punts: " + punts);        
    }
}
