/*Desenvolupa un nou "Lloro". En aquest cas li anomenaràs LloroVocalIniFi i només repetirà les paraules que iniciïn i finalitzin amb la mateixa vocal, independentment de si apareixen en majúscules o minúscules.*/
public class LloroVocalIniFi {
    public static void main(String[] args) {
        System.out.println("Paraula?");
        String entrada;
        String eMinusucula;
        
        char primer = eMinuscula.charAt(0);
        char ultim = eMinuscula.charAt() - 1;
        
        while (!entrada.isBlank()) {
            System.out.println("Paraula?");
            entrada = Entrada.readLine();
            eMinusucula = entrada.toLowerCase();
            
            if (primer == ultim) {
                System.out.println("Repeteixo: " + entrada);
            } 
        }
        System.out.println("Adéu");
    }
}
