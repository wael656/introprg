/*Un UllDeGat pot estar obert o tancat i ofereix els mètodes:

obret()

tancat()

boolean esObert()

A banda, ofereix dos constructors, el de per defecte que l'inicialitzarà tancat, i un d'específic que permet indicar si l'ull comença obert (true) o no.*/
public class UllDeGat {
    private boolean obret;

    public UllDeGat() {
        this.obret = false;
    }

    public UllDeGat(boolean comEsta) {
        this.obret = comEsta;
    }

    public void obret() {
        this.obret = true;
    }

    public void tancat() {
        this.obret = false;
    }
    
    public boolean esObert() {
        return this.obret;
    }
}