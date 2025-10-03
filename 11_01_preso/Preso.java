/*Desenvolupa un programa que demani el nom i l'edat per entrada estàndard i, si és major d'edat li digui “Vos ja podeu anar a la presó!”. Finalment, sigui quina sigui l'edat de l'usuari el programa s'acomiadarà dient “Aneu amb compte «nom de l'usuari»!”.*/

public class Preso {
    public static void main(String[] args) {
        System.out.println("Com us dieu?");
        String entrada = Entrada.readLine();
        
        System.out.println("Quants anys teniu?");
        int edat = Integer.parseInt(Entrada.readLine());
        
        if (edat >= 18) {
            System.out.println("Vos ja podeu anar a la presó!");
        }
        System.out.println("Aneu amb compte " + entrada);
    }
}
