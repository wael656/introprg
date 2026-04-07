/* Implementa una nova versió del gat Renat, que disposarà de funcionalitats com les implementades a exercicis previs com ara el del Renat ensinistrat.

En aquesta ocasió, però, faràs que GatRenat sigui una subclasse de Gat.
A l'hora de codificar les dues classes, tingues present que:
Gat només definirà els accessors de vides i posició.
GatRenat ja no definirà els accessors de vides ni de posició. Tampoc no definirà cap atribut. Per tant, aquells mètodes que requereixin accés a les propietats hauran de utilitzar els accessors heredats de Gat.*/
public class Gat {
    public int vides = 7;
    public String posicio = "estirat";

    public int getVides() { return vides; }
    public String getPosicio() { return posicio; }

    public void setVides(int novesVides) {
        if (novesVides >= 0) {
            vides = novesVides;
        }
    }
    
    public void setPosicio(String novaPosicio) {
        if (novaPosicio.equals("dret") || novaPosicio.equals("estirat") || novaPosicio.equals("assegut")) {
            posicio = novaPosicio;
        }
    }
    
}