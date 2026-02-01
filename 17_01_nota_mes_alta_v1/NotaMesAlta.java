/*Desenvolupa un programa que vagi demanant les notes obtingudes pels estudiants de programació en el darrer examen (com a mínim dues) i indiqui quina ha estat la nota més alta.

Les notes estaran representades en base 10 i, per tant, els valors vàlids són els números enters del 1 fins el 10.

El programa deixarà de recollir notes quan rebi un valor negatiu.

Finalment, el programa mostrarà quina ha estat la nota més alta.*/
public class NotaMesAlta {
    public static void main(String[] args) {
        System.out.println("Introdueix les notes (-1 per finalitzar)");
        int gran = 0;
        int i = 0;
        while (true) {
            int num = Integer.parseInt(Entrada.readLine());
            if (num > 0 && num < 11) {
                if (num > gran) {
                  gran = num;
                }
            }   
            if (num == -1) {
                System.out.println("La nota més alta és " + gran);
                break;
            } 
        }
    }
}
