/*Desenvolupa una versió de l'exercici del Semàfor de manera que abans de donar el consell, se n'asseguri que els usuaris són majors d'edat.

La nova versió fara servir la funció UtilitatsConfirmacio.respostaABoolean().*/
public class Semafor {
    public static void main(String[] args) {
        System.out.println("Ets major d'edat?");
        String resposta = Entrada.readLine();
        
        if (UtilitatsConfirmacio.respostaABoolean(resposta)) {
            System.out.println("Color?");
            String color = Entrada.readLine();
            
            if (color.equals("vermell")) {
                System.out.println("espera");
            } else if (color.equals("verd")) {
                System.out.println("passa");
              } else if (color.equals("groc")) {
                    System.out.println("corre!");
                } else if (color.equals("magenta")) {
                    System.out.println("ves a l'oculista");
                }        
        } else {
            System.out.println("No pots fer servir aquest programa sense supervisió");
        }
    }
}
