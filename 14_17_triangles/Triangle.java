/*Desenvolupa un programa anomenat Triangle, que demani un nombre enter positiu i dibuixi tants triangles com se li indiqui.

Si el valor d'entrada és menor que 1, el programa no mostrarà cap sortida.*/
public class Triangle {
    public static void main(String[] args) {
        System.out.println("quants?");
        int num = Integer.parseInt(Entrada.readLine());
        
        if (num < 1) {
            System.out.println();
        } else {
            
            for (int rep = 0; rep < num; rep++) {
                
                for (int i = 0; i <= 9; i++) {
                
                    for (int j = 0; j < 9 - i; j++) {
                        System.out.print(".");
                    }

                    for (int j = 9 - i; j <= 9; j++) {
                        System.out.print(j);
                    }
                    
                    for (int j = 8; j > 8 - i; j--) {
                        System.out.print(j);
                    }
                    
                    for (int j = 0; j < 9 - i; j++) {
                        System.out.print(".");
                    }
                    
                        System.out.println();
                    }
                }
        }
    }
}
