import java.io.*;

public class Mitjana {
    public static void main(String[] args) throws IOException {
        // 1. Obtenir el nombre d'exàmens (6 per defecte) sense excepcions
        int numExamens = 6;
        if (args.length > 0) {
            String arg = args[0].trim();
            boolean esNumArg = true;
            if (arg.isEmpty()) esNumArg = false;
            for (int j = 0; j < arg.length(); j++) {
                if (!Character.isDigit(arg.charAt(j))) {
                    esNumArg = false;
                    break;
                }
            }
            if (esNumArg) {
                numExamens = Integer.parseInt(arg);
            }
        }

        // --- SOLUCIÓ AL TEST 19 ---
        // Si demanen menys de 2 exàmens, mostrem l'error i aturem el programa
        if (numExamens < 2) {
            System.out.println("Com a mínim 2 exàmens.");
            return;
        }
        // --------------------------

        System.out.printf("Càlcul de la mitjana de notes per %d exàmens%n", numExamens);

        String cami = "notes.csv";
        File fitxer = new File(cami);
        if (!fitxer.exists()) return;

        BufferedReader input = new BufferedReader(new FileReader(fitxer));
        input.readLine(); // Saltem la primera línia (capçaleres)

        String linia;
        boolean hiHaNotes = false; 

        while ((linia = input.readLine()) != null) {
            String[] parts = linia.split(",");
            
            // Validar nom de l'alumne
            if (parts.length == 0) continue;
            String nom = parts[0].trim();
            if (nom.isEmpty()) continue;

            hiHaNotes = true; 
            double suma = 0;

            // Recorrem fins al nombre d'exàmens definit
            for (int i = 1; i <= numExamens; i++) {
                if (i < parts.length) {
                    String valor = parts[i].trim();
                    
                    // Comprovem MANUALMENT si és un número
                    boolean esNumero = true;
                    if (valor.isEmpty()) {
                        esNumero = false;
                    } else {
                        for (int j = 0; j < valor.length(); j++) {
                            if (!Character.isDigit(valor.charAt(j))) {
                                esNumero = false;
                                break;
                            }
                        }
                    }

                    // Només sumem si és purament numèric
                    if (esNumero) {
                        suma += Integer.parseInt(valor);
                    }
                }
            }

            // Imprimim el resultat amb dos decimals
            System.out.printf("%s (%.2f)%n", nom, suma / numExamens);
        }

        // Si no hem processat cap nota (Test 04)
        if (!hiHaNotes) {
            System.out.println("El fitxer notes.csv no conté cap nota.");
        }

        input.close();
    }
}
