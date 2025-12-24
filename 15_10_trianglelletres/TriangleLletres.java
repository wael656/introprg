/*Desenvolupa un programa anomenat TriangleLletres, que demani un text i dibuixi un triangle amb les lletres del text.

Considera la següent simulació:

 Text?
 Nemesio
 N
 N, e
 N, e, m
 N, e, m, e
 N, e, m, e, s
 N, e, m, e, s, i
 N, e, m, e, s, i, o
Per passar les proves, el mòdul main() se se n'encarregarà d'obtenir les dades d'entrada, i cridarà un mòdul anomenat dibuixaTriangle() que serà qui realitzi realment la feina de mostrar el triangle. De fet, aquest es recolzarà en un altre anomenat dibuixaLinia() que serà qui realment faci la feina de dibuixar cada línia del triangle.*/
public class TriangleLletres {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        dibuixaTriangle(text);
    }
    
    public static void dibuixaTriangle(String text) {
        for (int i = 0; i < text.length(); i++) {
            dibuixaLinia(text, i);
        }
    }
    
    public static void dibuixaLinia(String text, int linia) {
        for (int j = 0; j <= linia; j++) {
            if (j < linia) {
                System.out.print(text.charAt(j) + ", ");
            } else {
                System.out.print(text.charAt(j));
            }
        }
        System.out.println(); 
    }
}
