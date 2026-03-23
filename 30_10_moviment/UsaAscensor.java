/*Com veus, l'ascensor disposarà de moviment. Inicialment l'ascensor estarà aturat. Altres moviments seran pujant i baixant.

El programa, en ser executat, mostrarà la següent sortida:

Pis inicial: -1
Moviment inicial: aturat
Moviment final: pujant
Nota: assegura't que indiques les propietats com a públiques.*/
public class UsaAscensor {
    public static void main(String[] args) {
        Ascensor ascensor = new Ascensor();
        System.out.println("Pis inicial: " + ascensor.pis);
        System.out.println("Moviment inicial: " + ascensor.moviment);
        ascensor.moviment = "pujant";
        System.out.println("Moviment inicial: " + ascensor.moviment);
    }
}