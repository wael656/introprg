/*En aquesta ocasió desenvoluparem un programa que permeti construir taules de multiplicar personalitzades.

El programa demanarà un total de quatre valors numèrics:

valor inicial primers operands

valor final primers operands

valor inicial segons operands

valors finals segons operands

En cas que un valor inicial sigui més gran que un valor final, simplement començarà pel més petit i acabarà pel més gran.

A partir d'aquests valors, mostrarà les taules de multiplicar corresponents*/
public class TaulaMultiplicar {
    public static void main(String[] args) {
        System.out.println("El primer argument és " + args[0]);
        System.out.println("El segon argument és  " + args[1]);
        System.out.println("El tercer argument és " + args[2]);
        System.out.println("El quart argument és  " + args[3]);
        
        int primer = Integer.parseInt(args[0]);
        int segon = Integer.parseInt(args[1]);
        int tercer = Integer.parseInt(args[2]);
        int quart = Integer.parseInt(args[3]);        
    
        for (int i = primer; i <= segon; i++) {
        
            for (int j = tercer; j <= quart; j++) {
                System.out.println(i + " x " + j + " = " + i*j);
                
            }
        }
    }
}
