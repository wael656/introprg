/*En aquesta ocasió desenvoluparem una calculadora senzilla que demani a l'usuari un primer operand numèric, una operació entre (+ - * /) i un segon operand, i escrigui el resultat d'aplicar l'operació als operands.*/

public class CalculadoraSenzilla {
    public static void main(String[] args) {
        System.out.println("Operand 1?");
        double operand1 = Double.parseDouble(Entrada.readLine());
        System.out.println("Operador?");
        char operador =  Entrada.readLine().charAt(0);
        System.out.println("Operand 2?");
        double operand2 = Double.parseDouble(Entrada.readLine());
        double resultat;
        
        if (operador == '+') {
            resultat = operand1 + operand2;
            System.out.println(operand1 + " + " + operand2 + " = " + resultat);
        }
        else if (operador == '-') {
            resultat = operand1 - operand2;
            System.out.println(operand1 + " - " + operand2 + " = " + resultat);
        }
        else if (operador == '*') {
            resultat = operand1 * operand2;
            System.out.println(operand1 + " * " + operand2 + " = " + resultat);
        }                   
        if (operador == '/' && operand2 == 0) {
            System.out.println("No es pot dividir entre 0");  
        }    
        else if (operador == '/') {
            resultat = operand1 / operand2;
            System.out.println(operand1 + " / " + operand2 + " = " + resultat);
        }           
        if (operador != '+' && operador != '-' && operador != '*' && operador != '/') {    
            System.out.println("L'operador " + operador + " no està disponible");
        }
        
    }
}
