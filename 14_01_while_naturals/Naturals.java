/*Desenvolupa un programa anomenat Naturals que rebi per línia de comandes un número i mostri tots els valors enters positius entre el 1 iaquest número.*/
public class Naturals {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        if (num < 1) {
            System.out.println("Cap valor creixent entre 1 i " + num);
        } 
        
        int i = 0;
        while (i < num) {
            i++;
            System.out.println(i);
        }
    }
}
