/*Desenvolupa un programa anomenat MatriculaValida que demani a l'usuari una matrícula i li digui si el que li ha introduït correspon a una matrícula italiana vàlida en el format vigent.*/

public class MatriculaValida {
    public static void main(String[] args) {
        System.out.println("Introduïu una matrícula");
        String matricula = Entrada.readLine();
        
        if (matricula.length() == 7) { 
            if (Character.isUpperCase(matricula.charAt(0)) && Character.isUpperCase(matricula.charAt(1)) && Character.isUpperCase(matricula.charAt(5)) && Character.isUpperCase(matricula.charAt(6))) {            
                if (Character.isLetter(matricula.charAt(0)) && Character.isLetter(matricula.charAt(1)) && Character.isLetter(matricula.charAt(5)) && Character.isLetter(matricula.charAt(6)) && Character.isDigit(matricula.charAt(2)) && Character.isDigit(matricula.charAt(3)) && Character.isDigit(matricula.charAt(4))) {
                
                char a = matricula.charAt(0);
                char b = matricula.charAt(1);
                char c = matricula.charAt(5);
                char d = matricula.charAt(6);
                
                if (a != 'Ü' && b != 'Ü' && c != 'Ü' && d != 'Ü' && a != 'Ú' && b != 'Ú' && c != 'Ú' && d != 'Ú' && a != 'Ö' && b != 'Ö' && c != 'Ö' && d != 'Ö' && a != 'Ó' && b != 'Ó' && c != 'Ó' && d != 'Ó' && a != 'Ò' && b != 'Ò' && c != 'Ò' && d != 'Ò' && a != 'Ï' && b != 'Ï' && c != 'Ï' && d != 'Ï' && a != 'Í' && b != 'Í' && c != 'Í' && d != 'Í' && a != 'Ì' && b != 'Ì' && c != 'Ì' && d != 'Ì' && a != 'Ë' && b != 'Ë' && c != 'Ë' && d != 'Ë' && a != 'É' && b != 'É' && c != 'É' && d != 'É' && a != 'È' && b != 'È' && c != 'È' && d != 'È' && a != 'Æ' && b != 'Æ' && c != 'Æ' && d != 'Æ' && a != 'Ä' && a != 'Ç' && a != 'À' && a != 'Ñ' && a != 'ß' && a != 'I' && a != 'O' && a != 'Q' && a != 'Q' && b != 'Ä' && b != 'Ç' && b != 'À' && b != 'Ñ' && b != 'ß' && b != 'I' && b != 'O' && b != 'Q' && b != 'Q' && c != 'Ä' && c != 'Ç' && c != 'À' && c != 'Ñ' && c != 'ß' && c != 'I' && c != 'O' && c != 'Q' && c != 'Q' && d != 'Ä' && d != 'Ç' && d != 'À' && d != 'Ñ' && d != 'ß' && d != 'I' && d != 'O' && d != 'Q' && d != 'Q' && a != 'U' && b != 'U' && c != 'U' && d != 'U') {
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
