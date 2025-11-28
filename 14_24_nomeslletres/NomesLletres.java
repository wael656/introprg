/*Desenvolupa un programa anomenat NomesLletres que demani un text i mostri només les lletres que conté. Cada lletra apareixerà separada per una coma en l'ordre en que apareixia al text original. La resta de caràcters no es mostrarà.*/
public class NomesLletres {
    public static void main(String[] args) {
        System.out.println("Text?");
        String entrada = Entrada.readLine();
        char ultim = entrada.charAt(entrada.length() - 1);
        
        for (int i = 0; i < entrada.length()-1; i++) {
            char c = entrada.charAt(i);
            if (Character.isLetter(c)) {
                System.out.print(c);
            }
        }
        if (Character.isLetter(ultim)) {
            System.out.print(ultim);
        }
        System.out.println();
    }
}
