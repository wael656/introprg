/*Desenvolupa un programa anomenat MatriculaValida que demani a l'usuari una matrícula i li digui si el que li ha introduït correspon a una matrícula italiana vàlida en el format vigent.*/

public class MatriculaValida {
    public static void main(String[] args) {
        System.out.println("Introduïu una matrícula");
        String matricula = Entrada.readLine();
        
        if (matricula.length() == 7) {
            if (!Character.isLetter('À') && !Character.isLetter('Ç') && !Character.isLetter('Ñ') && !Character.isLetter('ß') && !Character.isLetter('I') && !Character.isLetter('O') && !Character.isLetter('Q') && !Character.isLetter('U')) { 
                if (Character.isUpperCase(matricula.charAt(0)) && Character.isUpperCase(matricula.charAt(1)) && Character.isUpperCase(matricula.charAt(5)) && Character.isUpperCase(matricula.charAt(6))) {            
                    if (Character.isLetter(matricula.charAt(0)) && Character.isLetter(matricula.charAt(1))) {
                        if (Character.isDigit(matricula.charAt(2)) && Character.isDigit(matricula.charAt(3)) && Character.isDigit(matricula.charAt(4))) {
                            if (Character.isLetter(matricula.charAt(5)) && Character.isLetter(matricula.charAt(6))) {
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
            } else {
                System.out.println("No és una matrícula italiana vàlida");
            }
        } else {
            System.out.println("No és una matrícula italiana vàlida");
        }
    }
}
