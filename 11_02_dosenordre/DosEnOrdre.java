/*Desenvolupa un programa que demani dos números i escrigui els dos números ordenats creixentment (de menor a major). Per exemple, si els números són 3 i 2, el resultat serà 2 3*/
public class DosEnOrdre {
    public static void main(String[] args) {
        System.out.println("Primer?");
        int primer = Integer.parseInt(Entrada.readLine());
        
        System.out.println("Segon?");
        int segon = Integer.parseInt(Entrada.readLine());
        
        if (primer > segon) {
            System.out.println(segon + " i " + primer);
        } else if (segon > primer) {
            System.out.println(primer + " i " + segon);
        } else {
            System.out.println(primer + " i " + segon);
        }
    }
}
