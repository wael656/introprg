/*T'has plantejat mai de quin tipus és el paràmetre del procediment main() que contenen tants programes que has fet en Java?

public static void main(String[] args)
Sí, és un paràmetre de tipus array de String!

En aquest exercici consisteix en fer un programa que analitzi els arguments que es passen per la línia de comandes i distingeixi si són o no enters.*/
public class Arguments {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Cap argument");
        }
        for (int i = 0; i < args.length; i++) {
            if (!UtilString.esEnter(args[i])) {
                System.out.println("[" + i + "] " + "\"" + args[i] + "\"" + ":" + " no és enter");
            } else {
                System.out.println("[" + i + "] " + "\"" + args[i] + "\"" + ":" + " és enter");
            }
        }
    }
}
