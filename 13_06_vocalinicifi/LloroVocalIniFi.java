/*Desenvolupa un nou "Lloro". En aquest cas li anomenaràs LloroVocalIniFi i només repetirà les paraules que iniciïn i finalitzin amb la mateixa vocal, independentment de si apareixen en majúscules o minúscules.*/
public class LloroVocalIniFi {
    public static void main(String[] args) {
        System.out.println("Paraula?");
        String entrada = Entrada.readLine();
        String eMinuscula = entrada.toLowerCase();
        
        
        while (!entrada.isBlank()) {
            char primer = eMinuscula.charAt(0);
            char ultim = eMinuscula.charAt(eMinuscula.length() - 1);
            if (primer == 'a' || primer == 'e' || primer == 'i' || primer == 'o' || primer == 'u') {
                        
                if (primer == ultim) {
                System.out.println("Repeteixo: " + entrada);
            }
            }
            System.out.println("Paraula?");
            entrada = Entrada.readLine();
            eMinuscula = entrada.toLowerCase();
        }
        System.out.println("Adéu");
    }
}
