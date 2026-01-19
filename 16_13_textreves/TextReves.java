/*Desenvolupa una nova versió del programa TextReves d'un exercici anterior. En aquesta ocasió, la sortida saltarà els espais de l'entrada per fer més elegant el resultat.*/
public class TextReves {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        String inverteix = UtilString.inverteix(text);
        System.out.println(UtilString.cometeja(inverteix));
    }
}
