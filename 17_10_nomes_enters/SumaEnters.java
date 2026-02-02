/*aquest programa anomenat sumaEnters te 3 moduls que agafa per la linia de comandes els enters, per fer l'operació de sumar o restar depenent de lo que li posis.*/
public class SumaEnters {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("0");
        }
        int[] filtra = filtraEnters(args);
        int total = sumaEnters(filtra);
        System.out.println(total);
    }
    
    public static int quantsEnters(String[] valors) {
        int quants = 0;
        for (int i = 0; i < valors.length; i++) {
            if (UtilString.esEnter(valors[i])) {
                quants++;
            }
        }
        return quants;
    }
    
    public static int[] filtraEnters(String[] valors) {
        int[] nums = new int[quantsEnters(valors)];
         int quants = 0;
         for (int i = 0; i < valors.length; i++) {
            if (UtilString.esEnter(valors[i])) {
                nums[quants] = Integer.parseInt(valors[i]);
                quants++;
            }
         }
         sumaEnters(nums);
         return nums;
    }
    
    public static int sumaEnters(int[] valors) {
        int suma = 0;
        for (int i = 0; i < valors.length; i++) {
            suma+=valors[i];
        }
        return suma;
    }
}
