/*En aquest programa utilitzem el main per a cridar el pis des de fora en un fitxer java anomenat Ascensor.java*/
public class UsaAscensor{
    public static void main(String[] args) {
        Ascensor ascensor = new Ascensor();
        System.out.println("L'ascensor creat des de fora està al pis " + ascensor.pis);
    }
}