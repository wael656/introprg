/*Fixat especialment en les línies 3 i 14. En ambdues accedim a la única instància de GatRenat. Tant main() com canviaPosicio() no comuniquen aquesta instància entre si ja que, ni la instància de GatRenat està declarada com a global de UsaGatRenat, ni canviaPosicio() la rep com a paràmetre ni la retorna! Amb tot, els canvis que es realitzen en un mòdul són visibles a l'altre. Sembla màgia, oi?

Per completar la plantilla, et caldrà traduir el valor de novaPosicio de manera que:

1 passi a ser estirat

2 passi a ser assegut

3 passi a ser dret

estirat, assegut, dret demanin el canvi de posició corresponent.

qualsevol altre valor no es canvia*/
public class UsaGatRenat {
    public static void main(String[] args) {
        GatRenat renat = GatRenat.getInstancia();
        System.out.println("Inicialment Renat està " + renat.getPosicio());
        for (String posicio: args) {
            canviaPosicio(posicio);
            System.out.println("Ara està " + renat.getPosicio());
        }
    }
    private static void canviaPosicio(String novaPosicio) {
        // Tradueix novaPosicio: 1 -> estirat, 2 -> assegut, 3 -> dret,
        // altrament es queda com estava
        if (novaPosicio.equals("1")) {
            novaPosicio = "estirat";
            GatRenat.getInstancia(novaPosicio);
        } else if (novaPosicio.equals("2")) {
            novaPosicio = "assegut";
            GatRenat.getInstancia(novaPosicio);
        } else if (novaPosicio.equals("3")) {
            novaPosicio = "dret";
            GatRenat.getInstancia(novaPosicio);
        } else if (novaPosicio.equals("estirat") || novaPosicio.equals("assegut") || novaPosicio.equals("dret")) {
            GatRenat.getInstancia(novaPosicio);
        }
    }
}