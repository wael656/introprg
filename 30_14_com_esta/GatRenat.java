/* Afegeix al repertori de mètodes del Renat els següents:
 class GatRenat {
     + esViu(): boolean
     + esDret(): boolean
     + esAssegut(): boolean
     + esEstirat(): boolean
 }

boolean esViu() // cert si encara li queda alguna vida

boolean esDret(), boolean esAssegut(), boolean esEstirat()*/
public class GatRenat {
    private int vides = 7;
    private String posicio = "estirat";

    public int getVides() {
        return vides;
    }

    public void setVides(int novesVides) {
        if (novesVides >= 0) {
            vides = novesVides;
        }
    }

    public String getPosicio() {
        return posicio;
    }

    public void setPosicio(String novaPosicio) {
        if (novaPosicio.equals("estirat") || novaPosicio.equals("dret") || novaPosicio.equals("assegut")) {
            posicio = novaPosicio;
        }
    }

    public boolean esViu() {
        if (vides > 0) {
            return true;
        }
        return false;
    }

    public boolean esDret() {
        if (posicio.equals("dret")) {
            return true;
        }
        return false;
    }

    public boolean esAssegut() {
        if (posicio.equals("assegut")) {
            return true;
        }
        return false;
    }

    public boolean esEstirat() {
        if (posicio.equals("estirat")) {
            return true;
        } 
        return false;
    }
}