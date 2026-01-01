/*En aquesta ocasió desenvoluparem un programa anomenat TriangleParaules, que ens permetrà construir un triangle, no de caràcters sinó de paraules!

Considerarem que les paraules són cadenes de caràcters separades per espais en blanc.*/
public class TriangleParaules {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        
        mostraTriangle(text);
    }
    
    public static void mostraTriangle(String text) {
        String paraula = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            paraula+=c;
            if (i == text.length() -1 || text.charAt(i+1) == ' ') {
                System.out.println(paraula);
            }
        }
    }
}
