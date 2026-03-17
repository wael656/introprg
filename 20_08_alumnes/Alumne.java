/*En aquest exercici acabarem de completar algunes de les funcions associades al tipus Alumne que hem definit als continguts.

Recordem la definició:

static class Alumne {
    String nom;
    String email;
    int edat;
    boolean esOient;
    int[] notes;
}
Per provar algunes d'elles, desenvoluparem un programa que llegirà les dades d'un fitxer en format csv, i mostrarà la informació relativa a cada alumne que correspongui al criteri de cerca que s'indiqui per l'argument esperat.

El criteri de cerca és un String que el programa rep com a primer argument de la línia de comandes, i que ha d'aparèixer com a part del nom o de la part de l'usuari al correu electrònic (abans de @) dels alumnes a mostrar. El programa no serà sensible a majúscules/minúscules ni als caràcters especials propis de la llengua catalana (en concret, les vocals accentuades i la ç)*/ 
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class Alumne {
    static class Alumne {
        String nom;
        String email;
        int edat;
        boolean esOient;
        int[] notes;
    }

    public static Alumne construeixAlumne(String nom, String email,
                                          int edat, boolean esOient,
                                          int[] notes) {
        Alumne alumne = new Alumne();
        alumne.nom = nom;
        alumne.email = email;
        alumne.edat = edat;
        alumne.esOient = esOient;
        alumne.notes = notes;
        return alumne;
    }

    public static void mostraAlumne(Alumne alumne) {
        System.out.println("Alumne: " + alumne.nom);
        System.out.println(" - email: " + alumne.email);
        System.out.println(" - edat: " + alumne.edat);
        System.out.println(" - és oïent: " + (alumne.esOient ? "Sí" : "No"));
        System.out.println(" - notes: " + notesACsv(alumne.notes));
    }

    public static String notesACsv(int[] notes) {
        String resultat = "";
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] == -1) {
                resultat += "NP";
            } else {
                resultat += notes[i];
            }
            if (i < notes.length - 1) {
                resultat += ",";
            }
        }
        return resultat;
    }

    public static String alumneAString(Alumne alumne) {
        return String.format(
                "Alumne(nom: \"%s\", email: \"%s\", edat: %d, esOient: %b, notes: {%s})",
                alumne.nom, alumne.email, alumne.edat, alumne.esOient,
                notesACsv(alumne.notes));
    }

    public static String alumneACsv(Alumne alumne) {
        return String.format("%s,%s,%d,%b,%s", 
                alumne.nom, alumne.email, alumne.edat, alumne.esOient, notesACsv(alumne.notes));
    }

    public static Alumne csvAAlumne(String csv) {
        String[] parts = csv.split(",");
        String nom = parts[0].trim();
        String email = parts[1].trim();
        int edat = Integer.parseInt(parts[2].trim());
        boolean esOient = Boolean.parseBoolean(parts[3].trim());
        
        int numNotes = parts.length - 4;
        int[] notes = new int[numNotes];
        for (int i = 0; i < numNotes; i++) {
            String notaStr = parts[4 + i].trim();
            if (notaStr.equalsIgnoreCase("NP")) {
                notes[i] = -1;
            } else {
                notes[i] = Integer.parseInt(notaStr);
            }
        }
        return construeixAlumne(nom, email, edat, esOient, notes);
    }

    public static String netejaText(String text) {
        if (text == null) return "";
        text = text.toLowerCase();
        char[] lletres = text.toCharArray();
        
        for (int i = 0; i < lletres.length; i++) {
            char c = lletres[i];
            if (c == 'à' || c == 'á') lletres[i] = 'a';
            else if (c == 'è' || c == 'é') lletres[i] = 'e';
            else if (c == 'í' || c == 'ï') lletres[i] = 'i';
            else if (c == 'ò' || c == 'ó') lletres[i] = 'o';
            else if (c == 'ú' || c == 'ü') lletres[i] = 'u';
            else if (c == 'ç') lletres[i] = 'c';
        }
        return new String(lletres);
    }

    // Alternativa manual a contains()
    public static boolean conte(String text, String cerca) {
        if (cerca == null || cerca.length() == 0) return true;
        if (text == null || text.length() < cerca.length()) return false;

        for (int i = 0; i <= text.length() - cerca.length(); i++) {
            boolean coincideix = true;
            for (int j = 0; j < cerca.length(); j++) {
                if (text.charAt(i + j) != cerca.charAt(j)) {
                    coincideix = false;
                    break;
                }
            }
            if (coincideix) {
                return true;
            }
        }
        return false;
    }

    public static int trobaCaracter(String text, char c) {
        if (text == null) return -1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == c) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.out.println("Error: Cal indicar un criteri de cerca.");
            return;
        }

        String criteri = netejaText(args[0]);
        boolean alumneTrobat = false;

        BufferedReader br = new BufferedReader(new FileReader("alumnes.csv"));
        String linia = br.readLine();

        while ((linia = br.readLine()) != null) {
            if (linia.trim().isEmpty()) continue;
            Alumne alumne = csvAAlumne(linia);
            String nomNet = netejaText(alumne.nom);
            String partUsuari = alumne.email;
            
            int posicioArroba = trobaCaracter(partUsuari, '@');
            if (posicioArroba != -1) {
                partUsuari = partUsuari.substring(0, posicioArroba);
            }
            
            String usuariNet = netejaText(partUsuari);

            if (conte(nomNet, criteri) || conte(usuariNet, criteri)) {
                mostraAlumne(alumne);
                alumneTrobat = true;
            }
        }

        br.close();

        if (!alumneTrobat) {
            System.out.println("No s'ha trobat cap alumne amb els criteris indicats.");
        }
    }
}