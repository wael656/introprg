/*En aquest exercici desenvoluparàs el programa SumaInterval que demanarà dos valors enters i sumarà tots els nombres que hi hagin entre els dos, incloent-los. El programa mostrarà els càlculs intermitjos.*/
public class SumaInterval {
    public static void main(String[] args) {
        System.out.println("primer?");
        int primer = Integer.parseInt(Entrada.readLine());
        System.out.println("segon?");
        int segon = Integer.parseInt(Entrada.readLine());
        int suma = 0;
        
        if (primer > segon) {
            int canvi = primer;
            primer = segon;
            segon = canvi;
        }
        
        for (int i = primer; i <= segon; i++) {            
            System.out.println(suma + " + " + i + " = " + (suma + i));
            suma+=i;
            }
    }
}
