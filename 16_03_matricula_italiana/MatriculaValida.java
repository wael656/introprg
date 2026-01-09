/*En aquesta ocasió rescatarem l'exercici de les matrícules italanes i en farem una nova versió que farà servir la funció esLletraValidaPerMatriculaItaliana() que rep un caràcter i retorna un booleà a cert quan el caràcter pot ser una lletra vàlida per una matrícula italiana.*/
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
            
            if (esLletraValidaPerMatriculaItaliana(a)) {
                if (esLletraValidaPerMatriculaItaliana(b)) {
                    if (Character.isDigit(c)) {
                        if (Character.isDigit(d)) {
                            if (Character.isDigit(e)) {
                                if (esLletraValidaPerMatriculaItaliana(f)) {
                                    if (esLletraValidaPerMatriculaItaliana(g)) {
                                        System.out.println("És una matrícula italiana vàlida");
                                    }
                                    else {
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
            } else {
                                        System.out.println("No és una matrícula italiana vàlida");
                                    }
    }
    
    }
    public static boolean esLletraValidaPerMatriculaItaliana(char lletra) {
         String caracter = "WERTYPASDFGHJKLZXCVBNM";
         for (int i = 0; i < caracter.length(); i++) {
            char valid = caracter.charAt(i);
            if (valid == lletra) {
                return true;
            }
        }
        return false;
    }
}
