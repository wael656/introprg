/*En aquest programa tenim dos moduls on un d'ells crea el missatge del só d'un picarol 
i l'altre compta quants cops sona el picarol.*/
public class Picarol {
    private int cops;

    public void sona() {
        System.out.println("clink-clink");
        cops++;
    }

    public int vegades() {
       return cops;
    }
}