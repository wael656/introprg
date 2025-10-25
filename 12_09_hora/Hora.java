/*Desenvolupa un programa que llegeixi una cadena d'entrada i la tracti com un enter que codifica una hora.*/

public class Hora {
    public static void main(String[] args) {
        String hora = Entrada.readLine();
        
        if (hora.isBlank()) {
            System.out.println("00:00:00");
        } else {
        
        if (hora.length() > 6 || Character.isLetter(hora.charAt(hora.length()-1))) {
            System.out.println("Error");
        } else if (hora.length() == 1) {
            System.out.println("00:00:0" + hora);
          } else if (hora.length() == 2) {
                System.out.println("00:00:" + hora);
            } else if (hora.length() == 3) {
                System.out.println("00:0" + hora.charAt(0) + ":" + hora.charAt(1) + hora.charAt(2));
              } else if (hora.length() == 4) {
                System.out.println("00:" + hora.charAt(0) + hora.charAt(1) + ":" + hora.charAt(2) + hora.charAt(3));
                } else if (hora.length() == 5) {
                    System.out.println("0" + hora.charAt(0) + ":" + hora.charAt(1) + hora.charAt(2) +  ":" + hora.charAt(3) + hora.charAt(4));
                  } else if (hora.length() == 6) {
                        System.out.println("" + hora.charAt(0) + hora.charAt(1) + ":" + hora.charAt(2) + hora.charAt(3) +  ":" + hora.charAt(4) + hora.charAt(5));
                  } else if (hora.charAt(0) == 0 && hora.length() > 6) {
                        System.out.println("" + hora.charAt(1) + hora.charAt(2) + ":" + hora.charAt(3) + hora.charAt(4) +  ":" + hora.charAt(5) + hora.charAt(6));  
                    }
          }  
    }
} 
