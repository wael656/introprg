/*Aquest repte consisteix en desenvolupar un programa anomenat TrobaMesProxim, que començarà demanant un valor (l'àncora) i després un seguit de nombres. Finalment el programa indicarà quin dels nombres introduïts és més pròxim a l'àncora.*/
public class TrobaMesProxim {
    public static void main(String[] args) {
        System.out.println("Introdueix l'àncora");
        int ancora = Integer.parseInt(Entrada.readLine());
        int valor = 0;
        int proxim;
        if (ancora >= 0) {
            System.out.println("Introdueix un valor");
            valor = Integer.parseInt(Entrada.readLine());
            proxim = valor;
            if (valor < 0) {
                System.out.println("No s'ha introduït cap valor positiu");
            } else {
                while (valor >= 0) {
                    if (Math.abs(ancora - valor) < Math.abs(ancora - proxim)) {
                        proxim = valor;
                    } else if (Math.abs(ancora - valor) == Math.abs(ancora - proxim)) {
                            if (valor < proxim) {
                                proxim = valor;
                            }
                        }
                        System.out.println("Introdueix un valor");
                        valor = Integer.parseInt(Entrada.readLine());
                }
                System.out.println("El valor introduït més pròxim a " + ancora + " és " + proxim);
            }
        } else {
                System.out.println("Àncora no vàlida");
        }
    }
}
