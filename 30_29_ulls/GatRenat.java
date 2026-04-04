/*Posem en pràctica la possibilitat d'afegir més d'un constructor al nostre amic Renat. En concret, ens interessarà permetre crear instàncies de les següents maneres*/
public class GatRenat {
    private int vides = 7;
    private String posicio = "estirat";
    private UllDeGat ullDret = new UllDeGat();
    private UllDeGat ullEsquerre = new UllDeGat();

    public GatRenat() {
        setVides(vides);
        setPosicio(posicio);
    }

    public GatRenat(int vides) {
        setVides(vides);
        setPosicio(posicio);
    }

    public GatRenat(String posicio) {
        setVides(vides);
        setPosicio(posicio);
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

        if (this.posicio.equals("dret")) {
            ullDret.obert();
            ullEsquerre.obert();
        } else if (this.posicio.equals("estirat")) {
            ullDret.tancat();
            ullEsquerre.tancat();
        } else if (this.posicio.equals("assegut")) {
            ullDret.obert();
            ullEsquerre.tancat();
        }
    }
    @Override
    public String toString() { return String.format("Vides: %d. Posició: %s", vides, posicio); }

    public UllDeGat getUllDret() {
        return new UllDeGat(this.ullDret.esObert());
    }

    public UllDeGat getUllEsquerre() {
        return new UllDeGat(this.ullEsquerre.esObert());
    }

    public String aixecat() {
        setPosicio("dret");
        return "dret";
    }

    public String seu() {
        setPosicio("assegut");
        return "assegut";
    }

    public String estirat() {
        setPosicio("estirat");
        return "estirat";
    }

    public static void main(String[] args) {
        GatRenat renat = new GatRenat();
        UllDeGat ullDret = renat.getUllDret();
        UllDeGat ullEsquerre = renat.getUllEsquerre();
        System.out.printf("Quan està %s: %b + %b%n",
                renat.getPosicio(),
                renat.getUllDret().esObert(),
                renat.getUllEsquerre().esObert());
        renat.seu();
        System.out.printf("Quan està %s: %b + %b%n",
                renat.getPosicio(),
                renat.getUllDret().esObert(),
                renat.getUllEsquerre().esObert());
        renat.aixecat();
        System.out.printf("Quan està %s: %b + %b%n",
                renat.getPosicio(),
                renat.getUllDret().esObert(),
                renat.getUllEsquerre().esObert());
    }
}