/*Posem en pràctica la possibilitat d'afegir més d'un constructor al nostre amic Renat. En concret, ens interessarà permetre crear instàncies de les següents maneres*/
public class GatRenat {
    private int vides = 7;
    private String posicio = "estirat";
    private Picarol picarol = null;

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

    }
    @Override
    public String toString() { return String.format("Vides: %d. Posició: %s", vides, posicio); }

    public String aixecat() {
        if (posicio.equals("dret")) {
            return "passo de fer res";
        }
        setPosicio("dret");
        if (HiHaPicarol()) {
            this.picarol.sona();
        }
        return "ja m'aixeco";
    }

    public String seu() {
        if (posicio.equals("assegut")) {
            return "passo de fer res";
        }
        setPosicio("assegut");
        if (HiHaPicarol()) {
            this.picarol.sona();
        }
        return "ja m'assec";
    }

    public String estirat() {
        if (posicio.equals("estirat")) {
            return "passo de fer res";
        }
        setPosicio("estirat");
        if (HiHaPicarol()) {
            this.picarol.sona();
        }
        return "ja m'estiro";
    }

    public boolean HiHaPicarol() {
        if (picarol == null) {
            return false;
        }
        return true;
    }

    public Picarol agafaPicarol(Picarol nouPicarol) {
        Picarol anticPicarol = this.picarol;
        this.picarol = nouPicarol;
        return anticPicarol;
    }

    public Picarol deixaPicarol() {
        Picarol anticPicarol = this.picarol;
        this.picarol = null;
        return anticPicarol;
    }
}