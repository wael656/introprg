/*Els mètodes aturat(), arrencaAbaix() i arrencaAmunt() canviaran el moviment de l'ascensor a l'indicat, si no ho estava ja, i retornaran true quan s'hagi produït el canvi.

Cal tenir en compte que, l'ascensor no podrà arrencar cap a munt o cap a baix si no estava aturat. En cas que se li demani, l'ascensor es quedarà amb el moviment que ja tenia.

El mètode seguentPis() permetrà fer passar l'ascensor al pis següent segons el moviment. Per exemple, si està pujant i es troba al pis 1, en demanar-li seguentPis() passarà al pis 2 i seguirà pujant.

Quan l'ascensor es troba a baix de tot baixant o a dalt del tot pujant, el seguentPis() correspondrà, respectivament al pis 0 o al 9, i invertirà el sentit del moviment. Per exemple, si es trobava al pis 10 pujant, seguentPis() el coŀlocarà al pis 9 i baixant. */
public class UsaAscensor {
    public static int llegeixEnter() {
        String resposta = Entrada.readLine();
        if (! UtilString.esEnter(resposta)) {
            return -2;
        }
        return Integer.parseInt(resposta);
    }
    public static void main(String[] args) {
        Ascensor ascensor = new Ascensor();

        System.out.println("Pis inicial");
        ascensor.setPis(llegeixEnter());
        System.out.printf("Inicialment l'ascensor està %s%n", ascensor.comEsta());

        // aturat a pujant
        boolean resposta = ascensor.arrencaAmunt();
        System.out.printf("En arrencar amunt l'ascensor respon %b i està %s%n",
                resposta, ascensor.comEsta());

        // demanem que baixi sense aturar
        resposta = ascensor.arrencaAbaix();
        System.out.printf("En arrencar a baix l'ascensor respon %b i està %s%n",
                resposta, ascensor.comEsta());

        // passem del pis indicat al la planta baixa
        System.out.println("Anant a la planta baixa quan està " + ascensor.comEsta());
        while (! ascensor.esAbaix()) {
            ascensor.seguentPis();       // passa al següent pis
            System.out.println("\t ara està "+ ascensor.comEsta());
        }
        ascensor.aturat();
        System.out.printf("Està %s. Final de trajecte!%n", ascensor.comEsta());
    }
}