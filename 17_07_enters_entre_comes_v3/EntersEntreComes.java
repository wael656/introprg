/*En aquesta ocasió, el programa tindrà les següents modificacions:

Inicialment demanarà als usuaris quants valors vol introduir.

A continuació, llegirà els valors indicats.

Finalment, mostrarà els valors llegits separats per comes.

Podem seguir suposant que els valors d'entrada seran enters. A més, podem suposar que ens donaran tants enters com ens indiquin.*/
public class EntersEntreComes {
    public static void main(String[] args) {
        System.out.println("Quants valors?");
        int quants = Integer.parseInt(Entrada.readLine());
        int[] num = new int[quants];
        
        for (int i = 0; i < num.length; i++) {
            System.out.println("Valor " + (i+1) + "?");
            num[i] = Integer.parseInt(Entrada.readLine());
        }
        
        for (int i = 0; i < num.length; i++) {
            if (i < num.length-1) {
                System.out.print(num[i] + ", ");
            } else {
                System.out.println(num[i]);    
            }
        }
    }
}
