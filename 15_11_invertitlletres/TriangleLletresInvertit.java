/*Desenvolupa un programa anomenat TriangleLletresInvertit, que demani un text i dibuixi un triangle amb les lletres del text en ordre invers al text introduït.

Considera la següent simulació:

 Text?
 Romualda
 a, d, l, a, u, m, o, R
 d, l, a, u, m, o, R
 l, a, u, m, o, R
 a, u, m, o, R
 u, m, o, R
 m, o, R
 o, R
 R
El mòdul main() se n'encarregarà d'obtenir les dades d'entrada, i cridarà un nou mòdul anomenat dibuixaTriangle() que serà qui realitzi realment la feina de mostrar el triangle. De fet, aquest es recolzarà en un altre anomenat dibuixaLinia() que serà qui realment faci la feina de dibuixar cada línia del triangle.*/
public class TriangleLletresInvertit {
    public static void main(String[] args) {
        System.out.println("Text?");
        String entrada = Entrada.readLine();
        String text = "";
        
        for (int i = entrada.length()-1; i >= 0; i--) {
            text += entrada.charAt(i);
        }
        dibuixaTriangleInvertit(text);        
    }
    
    public static void dibuixaTriangleInvertit(String text) {
        for (int i = 0; i < text.length(); i++) {
            dibuixaLiniaInvertida(text, i);
        }
    }
    
    public static void dibuixaLiniaInvertida(String text, int linia) {
        for (int j = linia; j <= text.length()-1; j++) {
            System.out.print(text.charAt(j));
            
            if (j < text.length()-1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

}
