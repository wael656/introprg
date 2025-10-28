/*Recordes l'exercici de sumar notes? Doncs en aquesta ocasió en faràs un que, en comptes de dir-te la suma de notes, t'informarà de la nota mitjana corresponent a les notes introduïdes.*/
public class Mitjana {
    public static void main(String[] args) {
        int comptador = 0;
        int suma = 0;
        float mitjana = 0;
        
        System.out.println("Introdueix un valor");
        int valor = Integer.parseInt(Entrada.readLine()); 
        
        if (valor < 0 || valor > 100) {
            System.out.println("Cap nota vàlida introduïda");
        } else {
        
            while (valor >= 0 && valor <= 100) {
                suma += valor;
                comptador++;
                
                System.out.println("Introdueix un valor");
                valor = Integer.parseInt(Entrada.readLine());
            }
            mitjana = suma / comptador;
            System.out.println("La mitjana de les notes vàlides és " + mitjana);
        }
    }
}
