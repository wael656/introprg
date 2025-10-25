/*Desenvolupa un programa que llegeixi una cadena d'entrada i la tracti com un enter que codifica una hora.*/

public class Hora {
    public static void main(String[] args) {
        String hora = Entrada.readLine();
        
        if (hora.isBlank()) {
            System.out.println("00:00:00");
        } else {
        
        if (hora.length() > 6 || (hora.length() >= 1 && Character.isLetter(hora.charAt(0))) || (hora.length() >= 2 && Character.isLetter(hora.charAt(1))) || (hora.length() >= 3 && Character.isLetter(hora.charAt(2))) || (hora.length() >= 4 && Character.isLetter(hora.charAt(3))) || (hora.length() >= 5 && Character.isLetter(hora.charAt(4))) || (hora.length() == 6 && Character.isLetter(hora.charAt(5)))) {
                System.out.println("ERROR");
                
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
                        
                        int h = Integer.parseInt("" + hora.charAt(0) + hora.charAt(1));
                        int m = Integer.parseInt("" + hora.charAt(2) + hora.charAt(3));
                        int s = Integer.parseInt("" + hora.charAt(4) + hora.charAt(5));
                        
                        if (h > 23 || m > 59 || s > 59) {
                            System.out.println("ERROR");
                        } else {
                            System.out.println("" + hora.charAt(0) + hora.charAt(1) + ":" + hora.charAt(2) + hora.charAt(3) + ":" + hora.charAt(4) + hora.charAt(5));
                        }
                  } else if (hora.charAt(0) == 0 && hora.length() > 6) {
                        System.out.println("" + hora.charAt(1) + hora.charAt(2) + ":" + hora.charAt(3) + hora.charAt(4) +  ":" + hora.charAt(5) + hora.charAt(6));  
                        
                    
                    }
          }  
    }
} 
