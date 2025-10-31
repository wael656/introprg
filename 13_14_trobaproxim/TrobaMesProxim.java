/*Aquest repte consisteix en desenvolupar un programa anomenat TrobaMesProxim, que començarà demanant un valor (l'àncora) i després un seguit de nombres. Finalment el programa indicarà quin dels nombres introduïts és més pròxim a l'àncora.*/
public class TrobaMesProxim {
    public static void main(String[] args) {
        System.out.println("Introdueix l'àncora:");
        int ancora = Integer.parseInt(Entrada.readLine());
        if (ancora < 0) {
            System.out.println("Àncora no vàlida");
        } else {
        
        int num = 999;
        int mesCercano = 0;
        int diferenciaMin = Integer.MAX_VALUE; 
        
        System.out.println("Introdueix un valor");

        while (num > 0) {
            num = Integer.parseInt(Entrada.readLine());

            int diferencia = Math.abs(num - ancora);

            if (diferencia < diferenciaMin) {
                diferenciaMin = diferencia;
                mesCercano = num;
            }
        }

        if (diferenciaMin == Integer.MAX_VALUE) {
            System.out.println("No s'han introduït números vàlids.");
        } else {
            System.out.println("El valor introduït més pròxim a " + ancora + " és: " + mesCercano);
        }
        
        }    
    }
}
