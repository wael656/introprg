/*Posem en pràctica la possibilitat d'afegir més d'un constructor al nostre amic Renat. En concret, ens interessarà permetre crear instàncies de les següents maneres*/
public class GatRenat {
    private int vides = 7;
    private String posicio = "estirat";

    public GatRenat() {
        setVides(vides);
        setPosicio(posicio);
    }

    public GatRenat(int vides) {
        setVides(8);
        setPosicio(posicio);
    }

    public GatRenat(String posicio) {
        setVides(vides);
        setPosicio("dret");
    }

    public GatRenat(int vides, String posicio) {
        setVides(vides);
        setPosicio(posicio);
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
    GatRenat[] renats = {
        new GatRenat(),         // tot per defecte
        new GatRenat(8),        // 8 vides i posició per defecte
        new GatRenat("dret"),   // posició dret i vides per defecte
        new GatRenat(8, "dret") // 8 vides i posició dret

    };
    for (GatRenat renat: renats) {
        System.out.println(renat);
    }
}
}