/*Desenvolupa un programa anomenat PiramideLletres, que rep un text com a primer argument de la línia de comandes, i dibuixa piràmide amb les seves lletres.*/
public class PiramideLletres {
    public static void main(String[] args) {
        String text = args[0];
        piramitza(text);
    }
    
    public static void piramitza(String text) {
        for (int i = 0; i < text.length(); i++) {
            for (int j = 9; j > 0; j--) {
                System.out.print(".");
            }
            System.out.println();
        }
        
    }
}
