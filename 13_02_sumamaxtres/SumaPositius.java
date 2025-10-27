/*Amplia la versió del programa SumaPositius de manera que, en comptes de demanar tres valors sempre, ara només demani fins el primer cop que s'introdueixi un valor negatiu. Encara cal sumar només els positius, és clar.*/
public class SumaPositius {
    public static void main(String[] args) {
        int suma = 0;
        int valor;
        
        System.out.println("Introdueix el primer valor");
        valor = Integer.parseInt(Entrada.readLine());
        if (valor >= 0) {
            suma += valor;
            
            System.out.println("Introdueix el segon valor");
            valor = Integer.parseInt(Entrada.readLine());
            if (valor >= 0) {
                suma += valor;
                
                System.out.println("Introdueix el tercer valor");
                valor = Integer.parseInt(Entrada.readLine());
                if (valor >= 0) {
                    suma += valor;
                }
            }
        }
        System.out.println("La suma és " + suma);
    }
}
