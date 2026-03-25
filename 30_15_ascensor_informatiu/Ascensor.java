/*esAbaix() i esAdalt() retornen cert quan l'ascensor es troba al primer i al darrer pis respectivament.

esEnMoviment() retorna cert quan està pujant o baixant.

comEsta() retorna un String amb el moviment i el pis. Per exemple, si està pujant en el pis 1, el missatge serà pujant al pis 1.*/
public class Ascensor {
    private int pis = -1;
    private String moviment = "aturat";

    public int getPis() {
        return pis;
    }

    public void setPis(int nouPis) {
        if (nouPis >= -1 && nouPis <= 10) {
            pis = nouPis;
        }
    }

    public String getMoviment() {
        return moviment;
    }

    public void setMoviment(String nouMoviment) {
        if (nouMoviment.equals("Aturat") || nouMoviment.equals("pujant") || nouMoviment.equals("baixant")) {
            moviment = nouMoviment;
        }
    }

    public boolean esAbaix() {
        if (pis == -1) {
            return true;
        }
        return false;
    }

    public boolean esAdalt() {
        if (pis == 10) {
            return true;
        }
        return false;
    }

    public boolean esAturat() {
        if (esEnMoviment()) {
            return false;
        }  
        return true;  
    }

    public boolean esEnMoviment() {
        if (moviment.equals("pujant") || moviment.equals("baixant")) {
            return true;
        }
        return false;
    }

    public boolean esPujant() {
        if (moviment.equals("pujant")) {
            return true;
        }
        return false;
    }

    public boolean esBaixant() {
        if (moviment.equals("baixant")) {
            return true;
        }
        return false;
    }

    public String comEsta() {
        return moviment + " al pis " + pis;
    }
}