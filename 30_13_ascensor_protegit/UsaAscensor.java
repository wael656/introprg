/*Inicialment, l'ascensor començarà a la planta -1 i aturat.

Completa la següent plantilla de UsaAscensor de manera que obtingui el pis i moviment final en aquest ordre, dels arguments de la línia de comandes:*/
public class UsaAscensor {
    public static void main(String[] args) {
        Ascensor ascensor = new Ascensor();
        System.out.println("Pis inicial: " + ascensor.getPis());
        System.out.println("Moviment inicial: " + ascensor.getMoviment());
        ascensor.setPis(Integer.parseInt(args[0]));
        ascensor.setMoviment(args[1]);
        System.out.println("Pis final: " + ascensor.getPis());
        System.out.println("Moviment final: " + ascensor.getMoviment());
    }
}