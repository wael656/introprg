/*En aquesta ocasió, desenvolupa un programa que demani les notes que han obtingut els alumnes de la teva classe
El programa anirà demanant notes mentre les que rebi siguin valors entre el 0 i el 100 (ambdós inclosos). Un cop rebi un valor fora del rang, deixarà de demanar més i mostrarà el valor resultant.*/
public class SumaNotes {
    public static void main(String[] args) {
        
        int suma = 0;        
        System.out.println("Introdueix una nota");
        int valor = Integer.parseInt(Entrada.readLine());
        
        while (valor >= 0 && valor <= 100) {
            suma += valor;
            System.out.println("Introdueix una nota");
            valor = Integer.parseInt(Entrada.readLine());            
        }
        
        System.out.println("La suma de les notes vàlides és " + suma);
    }
}
