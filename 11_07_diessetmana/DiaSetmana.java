/*Desenvolupa un programa que reculli el primer argument de línia de comandes, i respongui segons la taula: 1 dilluns, 2 dimarts, 3 dimecres...*/

public class DiaSetmana {
    public static void main(String[] args) {
        int dia = Integer.parseInt(args[0]);
        
        if (dia == 1) {
            System.out.println("dilluns");
        } else if (dia == 2) {
            System.out.println("dimarts");
        } else if (dia == 3) {
            System.out.println("dimecres");
        } else if (dia == 4) {
            System.out.println("dijous");
        } else if (dia == 5) {
            System.out.println("divendres");
        } else if (dia == 6) {
            System.out.println("dissabte");
        } else if (dia == 7) {
            System.out.println("diumenge");
        } else {
            System.out.println("Error");
        }
    }
}
