/*Crea una nova versió d'aquest exercici. Aquest cop, el programa es dirà NaturalsParells, i també mostrarà els números de manera creixent. Ara, però, no els mostrarà tots sinó només els parells.*/
public class NaturalsParells {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int i = 0;
        while (i < num) {
            i++;
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
