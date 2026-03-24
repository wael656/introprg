/*Recorda que les posicions vàlides del gat Renat són exactament: "dret", "assegut" i "estirat".

En cas que el setter de posicio rebi un valor no vàlid, mantindrà el valor de la propietat sense modificar. És a dir, es comportarà igual que setVides().*/
public class UsaGatRenat {
    public static void main(String[] args) {
        GatRenat renat = new GatRenat();
        System.out.println("Les vides inicials són: " + renat.getVides());
        System.out.println("La posició inicial és: " + renat.getPosicio());
        System.out.println("Introdueix nova posició:");
        renat.setPosicio(Entrada.readLine());
        System.out.println("La posició final és: " + renat.getPosicio());
    }
}