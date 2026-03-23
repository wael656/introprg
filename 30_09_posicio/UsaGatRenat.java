/*Modifica la definició de la seva classe perquè pugui guardar aquesta informació, fent que inicialment el gat estigui estirat.
La informació de l'estat la guardarem en una propietat amb el nom posicio que serà de tipus String.*/
public class UsaGatRenat {
    public static void main(String[] args) {
        GatRenat renat = new GatRenat();
        System.out.println("Vides inicials: " + renat.vides);
        System.out.println("Posició inicial: " + renat.posicioIn);
        System.out.println("Posició final: " + renat.posicioFi);
    }
}