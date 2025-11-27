/*Desenvolupa un programa anomenat Parentitza que demani un text i mostri cada lletra entre parèntesis. La resta de caràcters es mantindran sense canvis.*/
public class Parentitza {
    public static void main(String[] args) {
        System.out.println("Text?");
        String entrada = Entrada.readLine();
        
        for (int i = 0; i < entrada.length(); i++) {
            if (Character.isLetter(entrada.charAt(i))) {
                System.out.print("(" + entrada.charAt(i) + ")");
            } else {
                System.out.print(entrada.charAt(i));
            }
        }
    }
}
