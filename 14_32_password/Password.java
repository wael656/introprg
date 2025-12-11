/*Desenvolupa un programa anomenat Password que demani una contrasenya i digui si és vàlida o no segons els següents criteris:

Té una llargària mínima de 8 caràcters i màxima de 16

Ha de contenir un mínim d'un número

Ha de contenir un mínim d'una lletra majúscula

Ha de contenir un mínim d'una lletra minúscula. Considera que una lletra és minúscula si no és majúscula.

Ha de contenir un mínim d'un símbol

El nombre de lletres majúscules no pot ser inferior al de minúscules

No pot contenir espais en blanc

No es poden repetir caràcters excepte si són vocals (a,e,i,o,u)

No poden ser més de 4 caràcters seguits del mateix tipus. Els tipus són números, lletres majúscules, lletres minúscules i símbols. Ex. "91235a!A" no és vàlid perquè té més de quatre dígits seguits.

No poden contenir més de tres números consecutius. Ex. "1234Abc!" no es vàlid perquè inclou els números consecutius 1, 2, 3 i 4. Atenció: No es considera consecutius "8901", és a dir, no són consecutius circulars.

Per passar les proves, els missatges d'error esperat estaran en l'ordre indicat. És a dir, el text "abcdefg" no és un password vàlid per vàries raons. Per exemple, no té números, ni símbols, ni majúscules, etc. El problema pel que es queixarà Password, però, serà per que la longitud no és correcta, ja que és aquesta la primera comprovació a realitzar.

Aniràs descobrint els missatges a donar a partir dels errors que t'indicarà el prgtest.

Pista: No saps per on començar? Et proposo que comencis per resoldre cada regla per separat. Quan una no et passi les proves, considera provar-la en un programa a part, fins que la tinguis funcionant.*/
public class Password {
    public static void main(String[] args) {
        String text = Entrada.readLine();
        
        if (text.length() >= 8 && text.length() <= 16) {
            boolean esDigit = false;
            boolean majus = false;
            boolean minus = false;
            boolean simbol = false;
            boolean nMajus = false;
            boolean espais = false;
            String majusc = "";
            String minusc = "";
            
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                if (Character.isDigit(c)) {
                    esDigit = true;
                 }                               
                if (Character.isUpperCase(c)) {
                    majus = true;
                    majusc += c;
                }
                
                if (Character.isLowerCase(c)) {
                    minus = true; 
                    minusc += c;   
                }
                
                if (!Character.isDigit(c) && !Character.isLetter(c)) {
                    simbol = true;
                }
                
                if (majusc.length() >= minusc.length()) {
                    nMajus = true;
                }
                
                if (c == ' ') {
                    espais = true;
                }

            }
            if (!esDigit) {
                System.out.println("El password ha de contenir com a mínim un numero.");
            } 

            else if (!majus) {
                System.out.println("El password ha de contenir com a mínim una lletra majúscula.");
            } 

            else if (!minus) {
                System.out.println("El password ha de contenir com a mínim una lletra minúscula.");
            } 
                
            else if (!simbol) {
                System.out.println("El password ha de contenir com a mínim un símbol.");
            } 
         
            else if (!nMajus) {
                System.out.println("Incorrecte numero de majuscules");
            } 

            else if (espais == false) {
                System.out.println("Incorrecte espais");
            } 
        
        } else {
            System.out.println("El password ha de tenir entre 8 i 16 caràcters.");
        }
    }
}
