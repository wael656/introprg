/*Desenvolupa el programa HistoricEdats que demani el nom d'una persona, la seva edat i l'any actual, i escrigui l'edat que tenia aquella persona cada any des del seu naixement.*/
public class HistoricEdats {
    public static void main(String[] args) {
        System.out.println("nom?");
        String nom = Entrada.readLine();
        if (nom.isBlank()) {
            System.out.println("Error");
        } else {
            System.out.println("edat?");
            int edat = Integer.parseInt(Entrada.readLine());

            System.out.println("any actual?");
            int anyActual = Integer.parseInt(Entrada.readLine());
            
            if (edat == 0) {
                System.out.println("Adéu " + nom);
            } else {
            
                if (anyActual < 1971) {
                    System.out.println("Error");
                } else {
                
                    if (edat < 0) {
                       System.out.println("Entrada incorrecta");
                    } else {
                        int anyNaixament = anyActual - edat;
                        System.out.println("El " + anyNaixament + " vau néixer");
                        
                        for (int i = anyNaixament + 1; i < anyActual; i++) {
                            int anyAbans = i - anyNaixament;
                            if (anyAbans == 1) {
                                System.out.println("El " + i + " teníeu " + anyAbans + " any");
                            } else {
                                System.out.println("El " + i + " teníeu " + anyAbans + " anys");
                            }
                        }
                        System.out.println("Adéu " + nom);
                    }
                }
            }
        }
    }
}
