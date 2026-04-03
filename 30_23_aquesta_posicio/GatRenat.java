/*Crea una nova versió de l'exercici anterior, de manera que el constructor i el setter de posició defineixin el mateix nom pel paràmetre que especifica la posició 
que per la propietat.*/
public class GatRenat {
    private int vides = 7;
    private String posicio = "estirat";

    public GatRenat(int vides, String posicio) {
        this.setVides(vides);
        this.setPosicio(posicio);
    }

    public int getVides() { return this.vides; }
    public String getPosicio() { return this.posicio; }
    public void setVides(int vides) {
        if (vides >= 0)  {
            this.vides = vides;
        }
    }

    public void setPosicio(String posicio) {
        if (posicio.equals("estirat") || posicio.equals("assegut") || posicio.equals("dret")) {
            this.posicio = posicio;
        }
    }
    @Override
    public String toString() { return String.format("Vides: %d. Posició: %s", vides, posicio); }

   public static void main(String[] args) {
        System.out.println(new GatRenat(7, "dret"));
    }
}