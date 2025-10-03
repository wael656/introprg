/*En aquest exercici, farem un nou programa basant-nos en aquell, per calcular l'àrea d'un rectangle en comptes del cercle.

Recorda que un rectangle es defineix amb una base i una altura, i que la seva àrea es calcula amb base x altura. Considerarem que la base i l'altura s'expresen com a números enters. */

public class CalculaArea {
    public static void main(String[] args) {
        System.out.println("Càlcul de l'àrea d'un rectangle");
        System.out.println("Introduïu la base:");
        int base = Integer.parseInt(Entrada.readLine());
        
        System.out.println("Introduïu l'altura:");
        int altura = Integer.parseInt(Entrada.readLine());
        
        System.out.println("Introduïu les unitats (ex. cm):");
        String unitats = Entrada.readLine();
        
        int area = base * altura;
        System.out.println("L'àrea d'un rectangle de base " + base + unitats + " i altura " + altura + unitats + " és " + area + unitats + "^2");
        
        
    }
}
