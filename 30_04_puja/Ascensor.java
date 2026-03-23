/*En aquest programa fem un ascensor amb un procediment que si ho crides puja un pis, es a dir si esta al -1 puja al 0, si esta al pis 2 puja al 3.*/
public class Ascensor {
    int pis = -1;
    public static void puja(Ascensor ascensor) {
        ascensor.pis = ascensor.pis + 1;
    }
    public static void main(String[] args){
        Ascensor ascensor = new Ascensor();
        System.out.println("L'ascensor inicialment està a la planta " + ascensor.pis);
        puja(ascensor);
        System.out.println("L'ascensor finalment està a la planta " + ascensor.pis);
    }
}