/*La sortida haurà correspondre a aquesta simulació:

Inicialment renat.esViu(): true
Inicialment renat.esDret(): false
Inicialment renat.esAssegut(): false
Inicialment renat.esEstirat(): true
Introdueix quantes vides:
0
Introdueix nova posició:
dret
Finalment renat.esViu(): false
Finalment renat.esDret(): true
Finalment renat.esAssegut(): false
Finalment renat.esEstirat(): false*/
public class UsaGatRenat {
    public static void main(String[] args) {
        GatRenat renat = new GatRenat();
        System.out.println("Inicialment renat.esViu(): " + renat.esViu());
        System.out.println("Inicialment renat.esDret(): " + renat.esDret());
        System.out.println("Inicialment renat.esAssegut(): " + renat.esAssegut());
        System.out.println("Inicialment renat.esEstirat(): " + renat.esEstirat());
        System.out.println("Introdueix quantes vides:");
        renat.setVides(Integer.parseInt(Entrada.readLine()));
        System.out.println("Introdueix nova posició:");
        renat.setPosicio(Entrada.readLine());
        System.out.println("Finalment renat.esViu(): " + renat.esViu());
        System.out.println("Finalment renat.esDret(): " + renat.esDret());
        System.out.println("Finalment renat.esAssegut(): " + renat.esAssegut());
        System.out.println("Finalment renat.esEstirat(): " + renat.esEstirat());
    }
}