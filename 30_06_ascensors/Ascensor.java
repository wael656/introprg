/* Desenvolupa una nova versió de Ascensor

En aquesta ocasió disposarà d'una funció anomenada creaAscensorsEnEscala() que rebrà un nombre d'ascensors i retornarà un array amb el nombre d'ascensors especificat de manera que cada ascensor estarà en el pis indicat per la seva posició a l'array.

El main() decidirà a partir del valor que rebi en el primer argument de línia de comandes, quants ascensors crea, cridarà a creaAscensorsEnEscala() i mostrarà els pisos de tots els ascensors creats. */
public class Ascensor {
    int pis;

    public static Ascensor[] creaAscensorsEnEscala(int quants) {
        Ascensor[] ascensor = new Ascensor[quants];
        for (int i = 0; i < quants; i++) {
            ascensor[i] = new Ascensor();
            ascensor[i].pis = i;
        }
        return ascensor;
    }

    public static void main(String[] args){
        int quants = Integer.parseInt(args[0]);
        Ascensor[] ascensors = creaAscensorsEnEscala(quants);
        for (int i = 0; i < ascensors.length; i++) {
            System.out.printf("Ascensor %d al pis %d%n", i, ascensors[i].pis);
        }
    }
}