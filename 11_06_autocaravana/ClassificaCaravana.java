/*El mercat de les autocaravanes, aquests habitables amb rodes, està cada cop més actiu.

El nostre client, una ben posicionat concessionari d'autocaravanes, ha contractat al nostre equip el desenvolupament d'una aplicació per gestionar la seva activitat.

A tu t'han assignat el desenvolupament d'un programa que classifiqui les autocaravanes segons preu, en les categories: econòmica, general i de luxe.*/

public class ClassificaCaravana {
    public static void main(String[] args) {
        int preu = Integer.parseInt(args[0]);
        
        if (preu < 50000) {
            System.out.println("Econòmica");
        } else if (preu >= 50000 && preu < 175000) {
            System.out.println("General");
        } else {
            System.out.println("Luxe");
        }
    }
}
