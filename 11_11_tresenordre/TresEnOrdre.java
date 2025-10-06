/*Desenvolupa un programa que demani tres números i escrigui els tres números ordenats creixentment (de menor a major).*/

public class TresEnOrdre {
    public static void main(String[] args) {
        System.out.println("Primer?");
        int primer = Integer.parseInt(Entrada.readLine());
        
        System.out.println("Segon?");
        int segon = Integer.parseInt(Entrada.readLine());
        
        System.out.println("Tercer?");
        int tercer = Integer.parseInt(Entrada.readLine());
        
        if (tercer < segon && tercer < primer && primer < segon) {
            System.out.println(tercer + ", " + primer + " i " + segon);
        }         
        else if (primer < segon && segon < tercer) {
            System.out.println(primer + ", " + segon + " i " + tercer);
        }         
        else if (primer > segon && primer > tercer && segon < tercer) {
            System.out.println(segon + ", " + tercer + " i " + primer);  
        }         
        else if (primer > segon && segon < tercer) {
            System.out.println(segon + ", " + primer + " i " + tercer);
        }
        else if (primer < segon && segon > tercer) {
            System.out.println(primer + ", " + tercer + " i " + segon);
        }
        else if (primer > segon && segon > tercer) {
            System.out.println(tercer + ", " + segon + " i " + primer);
        }
        else if (primer == segon && segon == tercer) {
            System.out.println(tercer + ", " + primer + " i " + segon);
        }
        else if (primer == segon && tercer > primer) {
            System.out.println(primer + ", " + segon + " i " + tercer);
        }
    }
}
