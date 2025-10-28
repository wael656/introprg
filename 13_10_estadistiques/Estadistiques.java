/*Desenvolupa un programa anomenat Estadistiques, que vagi demanant enters positius i que, en el moment que rebi un de negatiu. Un cop finalitzada la càrrega de dades, el programa mostrarà els següents estadístics respecte el que ha rebut:*/
public class Estadistiques {
    public static void main(String[] args) {
        float suma = 0;
        float mitjana = 0;
        int maxim = 0;
        int minim = 1000;
        int comptador = 0;
        
        System.out.println("Introduiex un valor");
        int valor = Integer.parseInt(Entrada.readLine());
        
        while (valor > -1) {
            suma += valor;
            comptador++; 
            
            if (maxim < valor) {
                maxim = valor;
            }
            if (minim >= valor) {
                minim = valor;
            }
            
            System.out.println("Introduiex un valor");
            valor = Integer.parseInt(Entrada.readLine());              
        }
        mitjana = suma / comptador;
        System.out.println("El mínim és: " + minim);
        System.out.println("La mitjana és: " + mitjana);
        System.out.println("El màxim és: " + maxim);
    }
}
