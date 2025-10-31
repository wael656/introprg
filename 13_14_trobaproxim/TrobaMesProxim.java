/*Aquest repte consisteix en desenvolupar un programa anomenat TrobaMesProxim, que començarà demanant un valor (l'àncora) i després un seguit de nombres. Finalment el programa indicarà quin dels nombres introduïts és més pròxim a l'àncora.*/
public class TrobaMesProxim {
    public static void main(String[] args) {
    
        System.out.println("Introduiex l'ancora");
        int ancora = Integer.parseInt(Entrada.readLine());
        if (ancora < 0) {
                    System.out.println("Àncora no vàlida");
        }
        System.out.println("Introdueix un valor");
        int valor = Integer.parseInt(Entrada.readLine());
        if (valor < 0) {
             System.out.println("No s'ha introduït cap valor positiu");
        } 
        
        int diferencia = ancora - valor;
        int diferenciaAmplia = diferencia;
        int valorProxim = valor;
        boolean bucle = true;
        
        while (valor >= 0) {
            int diferenciaAnterior = diferencia;
            System.out.println("Introduiex un valor");
            valor = Integer.parseInt(Entrada.readLine());
            if (valor > 0) {
                diferencia = ancora - valor;
             
            if (diferencia < diferenciaAnterior) {
                diferenciaAnterior = diferencia;
                valorProxim = valor;
            }                
            else if (diferencia == diferenciaAnterior) {
                    int nombrePetit = Math.min(valor, valorProxim);
                    valorProxim = nombrePetit;
            }                           
        } 
        
        else {
                    System.out.println("El valor introduït més pròxim a " + ancora + " és " + valor);
                    }
            }
      }
}
