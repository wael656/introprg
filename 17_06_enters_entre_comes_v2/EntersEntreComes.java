/*En aquesta ocasió, el programa tindrà les següents modificacions:

Els valors de l'array en comptes de ser assignats des del programa, els especificaran els usuaris del programa.

De moment suposarem que els valors d'entrada són sempre enters vàlids.

En comptes de 3 valors a l'array, n'hi haurà 5*/
public class EntersEntreComes {
    public static void main(String[] args) {
        int num[] = new int[5];
        for (int i = 0; i < num.length; i++) {
            System.out.println("Valor " + (i+1)  + "?");
            num[i] = Integer.parseInt(Entrada.readLine());
        }
        for (int i = 0; i < num.length; i++) {
            if (i < num.length-1) {
                System.out.print(num[i] + ", ");
            } else {
                System.out.print(num[i]);
                System.out.println();
            }
        }
    }
}
