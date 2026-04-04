/*En aquest exercici implementaràs una versió de la classe GatRenat de manera que només hi pugui haver una única instància.*/
public class GatRenat {
    private int vides = 7;
    private String posicio = "estirat";
    private static GatRenat instancia;

    private GatRenat() {
        setVides(vides);
        setPosicio(posicio);
    }

    private GatRenat(int vides) {
        setVides(vides);
        setPosicio(posicio);
    }

    private GatRenat(String posicio) {
        setVides(vides);
        setPosicio(posicio);
    }

    private GatRenat(int vides, String posicio) {
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

    public static GatRenat getInstancia() {
        if (instancia == null) {
            instancia = new GatRenat();
        }
        return instancia;
    }

    public static GatRenat getInstancia(int vides) {
        if (instancia == null) {
            instancia = new GatRenat(vides);
        } else {
            instancia.setVides(vides);
        }
        return instancia;
    }

    public static GatRenat getInstancia(String posicio) {
        if (instancia == null) {
            instancia = new GatRenat(posicio);
        } else {
            instancia.setPosicio(posicio);
        }
        return instancia;
    }

    public static GatRenat getInstancia(int vides, String posicio) {
        if (instancia == null) {
            instancia = new GatRenat(vides, posicio);
        } else {
            instancia.setVides(vides);
            instancia.setPosicio(posicio);
        }
        return instancia;
    }
}