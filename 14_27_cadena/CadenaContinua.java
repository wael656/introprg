/*Desenvolupa un programa anomenat CadenaContinua, que demani un text i un nombre enter, i mostri tants caràcters del text com indiqui el nombre enters, començant pel primer. En cas que en faltin, el programa tornarà a mostrar el text a partir del primer caràcter fins que hagi aconseguit tots els caràcters demanats.

En cas que se li demani menys d'un caràcter, simplement no mostrarà res. En cas que el text introduït sigui buit o només format per caràcters en blanc, mostrarà un missatge d'error (prgtest especificarà) i finalitzarà l'execució sense demanar la longitud de la cadena a generar.*/
public class CadenaContinua {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        if (text.isBlank()) {
            System.out.println("ERROR: el text no conté caràcters no blancs");
        } else {
            System.out.println("Nombre?");
            int num = Integer.parseInt(Entrada.readLine());
            
            if (num < 0) {
                System.out.println();
            } else { 
            
                for (int i = 0; i < num; i++) {
                    int index = i % text.length();
                    char c = text.charAt(index);
                    System.out.print(c); 
                }
                System.out.println();
            }
        }
    }
}
