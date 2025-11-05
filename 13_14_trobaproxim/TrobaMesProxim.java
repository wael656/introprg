/*Aquest repte consisteix en desenvolupar un programa anomenat TrobaMesProxim, que començarà demanant un valor (l'àncora) i després un seguit de nombres. Finalment el programa indicarà quin dels nombres introduïts és més pròxim a l'àncora.*/
public class TrobaMesProxim {
    public static void main(String[] args) {
        System.out.println("Introdueix l'àncora");
        int ancora = Integer.parseInt(Entrada.readLine());
        System.out.println("Introdueix un valor");
        int valor = Integer.parseInt(Entrada.readLine());
        int menor = valor;
        int diferencia = ancora - valor;
        
        
        while (valor >= 0) {
            if (diferencia < menor) {
                menor = diferencia;
            }
            
            System.out.println("Introdueix un valor");
            valor = Integer.parseInt(Entrada.readLine());
      
        }
        System.out.println("El valor introduït més pròxim a " + ancora + " és " + menor);
    }
}
