/*Desenvolupa un programa anomenat MatriculaValida que demani a l'usuari una matrícula i li digui si el que li ha introduït correspon a una matrícula italiana vàlida en el format vigent.*/

public class MatriculaValida {
    public static void main(String[] args) {
        System.out.println("Introduïu una matrícula");
        String matricula = Entrada.readLine();
        String majuscula = matricula.toUpperCase();
        
        if (majuscula.length() == 7) {
            if (Character.isLetter(majuscula.charAt(0)) && Character.isLetter(majuscula.charAt(1))) {
                if (Character.isDigit(majuscula.charAt(2)) && Character.isDigit(majuscula.charAt(3)) && Character.isDigit(majuscula.charAt(4))) {
                    if (Character.isLetter(majuscula.charAt(5)) && Character.isLetter(majuscula.charAt(6))) {
                        System.out.println("És una matrícula italiana vàlida");
                    } else {
                        System.out.println("No és una matrícula italiana vàlida");
                    }
                } else {
                    System.out.println("No és una matrícula italiana vàlida");
                }
            } else {
                System.out.println("No és una matrícula italiana vàlida");
            }
        } else {
            System.out.println("No és una matrícula italiana vàlida");
        }
    }
}
