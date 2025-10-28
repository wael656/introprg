/*Desenvolupa un programa anomenat MatriculaValida que demani a l'usuari una matrícula i li digui si el que li ha introduït correspon a una matrícula italiana vàlida en el format vigent.*/

public class MatriculaValida {
    public static void main(String[] args) {
        System.out.println("Introduïu una matrícula");
        String matricula = Entrada.readLine();

        if (matricula.isEmpty() || matricula.length() != 7) {
            System.out.println("No és una matrícula italiana vàlida");
        } else {
            char a = matricula.charAt(0);
            char b = matricula.charAt(1);
            char c = matricula.charAt(2);
            char d = matricula.charAt(3);
            char e = matricula.charAt(4);
            char f = matricula.charAt(5);
            char g = matricula.charAt(6);
           
            boolean valida = true;
           
            if (!(a >= 'A' && a <= 'Z') || (a == 'I' || a == 'O' || a == 'Q' || a == 'U')) {
                valida = false;
            }
            if (!(b >= 'A' && b <= 'Z') || (b == 'I' || b == 'O' || b == 'Q' || b == 'U')) {
                valida = false;
            }
           
            if (!(c >= '0' && c <= '9')) valida = false;
            if (!(d >= '0' && d <= '9')) valida = false;
            if (!(e >= '0' && e <= '9')) valida = false;
           
            if (!(f >= 'A' && f <= 'Z') || (f == 'I' || f == 'O' || f == 'Q' || f == 'U')) {
                valida = false;
            }
            if (!(g >= 'A' && g <= 'Z') || (g == 'I' || g == 'O' || g == 'Q' || g == 'U')) {
                valida = false;
            }
           
            if (valida) {
                System.out.println("És una matrícula italiana vàlida");
            } else {
                System.out.println("No és una matrícula italiana vàlida");
            }          
        }
    }    
}
