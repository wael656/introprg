/*Desenvolupa un lloro que vagi demanant texts fins trobar la cadena buida o en blanc. Per cada text, indicarà si és o no igual al primer, tot ignorant els espais sobrers que hi puguin tenir cadascú dels dos texts.*/
public class ForaEspaisSobrers {
    public static void main(String[] args) {
        while (true) {
            System.out.println("El lloro espera un text");
            String text = Entrada.readLine();
            if (text.isEmpty()) {
                break;
            }
            System.out.println("El lloro respon: " + UtilString.normalitzaBlancs(text));            
        }
        System.out.println("El lloro s'acomiada atentament");   
    }
}
