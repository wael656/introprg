/*Desenvolupa un programa anomenat Lloro, que vagi demanant paraules i les repeteixi fins que rebi una resposta en blanc o bé buida. És a dir, la resposta sigui una cadena buida o bé només espais.*/
public class Lloro {
    public static void main(String[] args) {
        System.out.println("El lloro espera paraula:");
        String entrada = Entrada.readLine();
        
        while (!entrada.isBlank()) {
            System.out.println("El lloro repeteix: " + entrada);
            System.out.println("El lloro espera paraula:");
            entrada = Entrada.readLine();
        }
        System.out.println("Adéu");
    }
}
