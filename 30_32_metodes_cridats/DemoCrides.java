/*En aquest exercici analitzaràs quins són els mètodes que es criden realment quan hi ha pel mig l'herència.

 @startuml
 hide circle
 skinparam monochrome true
 skinparam classAttributeIconSize 0

 class GatRenat extends Gat
 class Gat extends Feli {
    miola()
 }
 class Feli {
    netejaUrpes()
    menja(Menjar)
 }

 Menjar  <- Feli

 @enduml*/
class Feli {
    public Feli() {
        System.out.println("Neix Felí");
    }
    public void netejaUrpes() {
        System.out.println("Felí neteja urpes des de " + this.getClass());
    }
    public void menja(Menjar menjar) {
        System.out.println("Felí menja " + menjar + " des de " + this.getClass());
    }
}

class Gat extends Feli {
    public Gat() {
        System.out.println("Neix Gat");
    }
    public void miola() {
        System.out.println("Gat miola des de " + this.getClass());
    }
    @Override
    public void menja(Menjar menjar) {
        System.out.println("Gat menja " + menjar + " des de " + this.getClass());
        super.menja(menjar);
    }
}

class GatRenat extends Gat {
    public GatRenat() {
        System.out.println("Neix Renat");
    }
    @Override
    public void miola() {
        System.out.println("Renat miola des de " + this.getClass());
    }

    @Override
    public void menja(Menjar menjar) {
        System.out.println("Renat menja " + menjar + " des de " + this.getClass());
        netejaUrpes();
        super.menja(menjar);
    }
}

class Menjar {
    private static final String MENJAR_PER_DEFECTE = "sardines";
    private final String nom;
    public Menjar(String nom) {
        if (nom != null && !nom.isEmpty()) {
            this.nom = nom;
        } else {
            this.nom = MENJAR_PER_DEFECTE;
        }
        System.out.println("Neix Menjar(\"" + this.nom + "\")");
    }
    public String toString() { return nom; }
}

public class DemoCrides {
    public static void main(String[] args) {
        Feli feli = new Feli();
        Gat gat = new Gat();
        GatRenat renat = new GatRenat();

        feli.netejaUrpes();
        gat.netejaUrpes();
        renat.netejaUrpes();

        gat.miola();
        renat.miola();
        Menjar menjar = new Menjar("bacallà");
        renat.menja(menjar);
    }
}