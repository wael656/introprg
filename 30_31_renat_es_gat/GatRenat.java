/*En aquest fitxer es una extensio del fitxer Gat, en aquesta activitat apliquem l'herencia
els accesors de vides i posicio estan al Gat i gracie al extends  la podem utilitzar aqui.*/
public class GatRenat extends Gat {
    public boolean esViu() {
        return vides > 0;
    }
    
    public boolean esDret() {
        return posicio == "dret";
    }
    
    public boolean esAssegut() {
        return posicio == "assegut";
    }

    public boolean esEstirat() {
        return posicio == "estirat";
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