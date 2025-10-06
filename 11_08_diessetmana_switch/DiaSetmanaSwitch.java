/*
A banda de l'estructura condicional if…else, Java ens ofereix una altra anomenada switch.

Aquesta estructura permet expressar d'una manera més compacta instruccions condicionals amb múltiples condicions sobre la mateixa expressió. En altres paraules, switch no ens ofereix més funcionalitats de les que teníem amb if…else però el codi pot resultar més llegible. Per aquesta raó, el trobarem sovint, no només en codis Java sinó d'altres llenguatges (no en tots)
*/

public class DiaSetmanaSwitch {
    public static void main(String[] args) {
        int dia = Integer.parseInt(args[0]);
        String diaString;
        switch (dia) {
            case 1:  diaString = "Dilluns";
                     break;
            case 2:  diaString = "Dimarts";
                     break;
            case 3:  diaString = "Dimecres";
                     break;
            case 4:  diaString = "Dijous";
                     break;
            case 5:  diaString = "Divendres";
                     break;
            case 6:  diaString = "Dissabte";
                     break;
            case 7:  diaString = "Diumenge";
                     break;
            default: diaString = "Error";
                     break;
        }
        System.out.println(diaString);
    }
}
