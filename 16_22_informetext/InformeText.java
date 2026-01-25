/*Desenvolupa un programa anomenat InformeText que demani un text i mostri un petit informe resum d'estadístiques del text.

L'informe indicarà quants caràcters, lletres i vocals catalanes (majúscules i minúscules), dígits i altres caràcters conté. A banda, indicarà, per cada categoria, el percentatge respecte el total dels caràcters.*/
public class InformeText {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        System.out.println("Informe");
        System.out.println("=======");
        System.out.printf("lletres en majúscules: %d (%.2f%%)%n",
                  UtilString.numLletresMajuscules(text),
                  100.0 * UtilString.numLletresMajuscules(text) / UtilString.totalCaracters(text));
        System.out.printf("lletres en minúscules: %d (%.2f%%)%n",
                  UtilString.numLletresMinuscules(text),
                  100.0 * UtilString.numLletresMinuscules(text) / UtilString.totalCaracters(text));
        System.out.printf("total lletres: %d (%.2f%%)%n",
                  UtilString.numLletres(text),
                  100.0 * UtilString.numLletres(text) / UtilString.totalCaracters(text));
        System.out.printf("vocals en majúscules: %d (%.2f%%)%n",
                  UtilString.numVocalsMajuscules(text),
                  100.0 * UtilString.numVocalsMajuscules(text) / UtilString.totalCaracters(text));
        System.out.printf("vocals en minúscules: %d (%.2f%%)%n",
                  UtilString.numVocalsMinuscules(text),
                  100.0 * UtilString.numVocalsMinuscules(text) / UtilString.totalCaracters(text));
        System.out.printf("total vocals: %d (%.2f%%)%n",
                  UtilString.numVocals(text),
                  100.0 * UtilString.numVocals(text) / UtilString.totalCaracters(text));
        System.out.printf("digits: %d (%.2f%%)%n",
                  UtilString.numDigits(text),
                  100.0 * UtilString.numDigits(text) / UtilString.totalCaracters(text));
        System.out.printf("altres caràcters: %d (%.2f%%)%n",
                  UtilString.altresCaracters(text),
                  100.0 * UtilString.altresCaracters(text) / UtilString.totalCaracters(text));
        System.out.println("total caràcters: " + UtilString.totalCaracters(text));
    }
}
