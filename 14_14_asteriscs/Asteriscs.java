/*Desenvolupa un programa que dibuixi un triangle d'asteriscs com el de la següent simulació:

java Asteriscs 5
*
**
***
****
***** */
public class Asteriscs {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }   
    }
}
