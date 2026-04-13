/*En aquest exercici implementarem un nou gat, l'amic Garfield.

Per poder-ho encabir en el nostre ecosistema de gats, ens tocarà fer alguns canvis.

Un dels primers canvis és els gats hauran de disposar d'un nom. El nom es guardarà en la propietat nom i definirem Gat de manera que no pugui instanciar-se sense nom.

Donat que el nom, un cop nascut el gat, no canviarà:

caldrà què sigui un requeriment de tots els constructors

no s'oferirà cap setter

la propietat que contindrà el nom podria ser declarada com a final

El nom d'un gat cal que sigui no null, ni buit ni blanc. En cas que el nom que se li assigna al gat no sigui vàlid, el gat passarà a dir-se "anònim".

Els gats podran especificar en el seu naixement, a banda del requerit nom, les vides o/i la posició inicial.*/
public class Gat {
    private final String nom;
    private int vides = 7;
    private String posicio = "estirat";

    public Gat (String nom) {
        this(nom, 7, "estirat");
    }

    public Gat(String nom, int vides) {
        this(nom, vides, "estirat");
    }

    public Gat(String nom, String posicio) {
        this(nom, 7, posicio);
    }

    public Gat(String nom, int vides, String posicio) {
        if (nom == null || nom.isBlank()) {
            this.nom = "anònim";
        } else {
            this.nom = nom;
        }
        this.posicio = posicio;
        this.vides = vides;
    }

    public String getNom() { return nom; }
    public String getPosicio() { return posicio; }
    public int getVides() { return vides; }

    public void setVides (int novesVides) {
        if (novesVides >= 0) {
            vides = novesVides;
        }
    }

    public void setPosicio (String novaPosicio) {
        if (novaPosicio.equals("dret") || novaPosicio.equals("estirat") || novaPosicio.equals("assegut")) {
            posicio = novaPosicio;
        }
    }

    public boolean esViu() {
        return vides >= 0;
    }

    public boolean esDret() {
        return getPosicio().equals("dret");
    }
    
    public boolean esAssegut() {
        return getPosicio().equals("assegut");
    }

    public boolean esEstirat() {
        return getPosicio().equals("estirat");
    }

    public String aixecat() {
        if (esDret()) {
            return "passo de fer res";
        }
        setPosicio("dret");
        return "ja m'aixeco";
    }

    public String seu() {
        if (esAssegut()) {
            return "passo de fer res";
        }
        setPosicio("assegut");
        return "ja m'assec";
    }

    public String estirat() {
        if (esEstirat()) {
            return "passo de fer res";
        }
        setPosicio("estirat");
        return "ja m'estiro";
    }
}