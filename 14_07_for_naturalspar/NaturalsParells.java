/*Crea una nova versió d'aquest exercici. Aquest cop, el programa es dirà NaturalsParells, i també mostrarà els números de manera creixent. Ara, però, no els mostrarà tots sinó només els parells.*/
public class NaturalsParells {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        if (num <= 0) {
            System.out.println("Cap valor parell creixent entre 1 i " + num);
        }
        
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
