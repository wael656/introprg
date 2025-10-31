/*En aquesta ocasió desenvoluparem un programa anomenat EndevinaNombre, que es pensarà un nombre enter entre el 1 i el 100, i reptarà els usuaris a que l'endevini.*/
public class EndevinaNombre {
    public static void main(String[] args) {
        int endevina = Integer.parseInt(args[0]);
        int valor = 999;
        String entrada = "";
        System.out.println("Ves introduint enters entre 1 i 100 fins que encertis el que jo he pensat");
        
        
            while (endevina != valor) {            
                System.out.println("Introdueix un valor");
                entrada = Entrada.readLine();
               
                if (entrada.isBlank()) {
                    System.out.println("Cancel·lat!");
                    endevina = valor;
                } else { 
                    valor = Integer.parseInt(entrada);
                
                if (valor < endevina && valor < 101 && valor > 0) {
                    System.out.println("És més gran que " + valor);   
                } else if (valor > 100) {
                    System.out.println("Com a màxim 100");
                } else if (valor < 1) {
                    System.out.println("Com a mínim 1");
                } else if (valor > endevina) {
                    System.out.println("És més petit que " + valor);
                } else if (valor == endevina) {
                    System.out.println("Has encertat!");
                }  
            }
        }
    }
}
