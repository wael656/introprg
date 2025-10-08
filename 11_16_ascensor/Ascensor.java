/*Considerem un ascensor d'un edifici amb planta baixa i dos pisos (primer pis i segon pis) que tingui els següents botons: ‘pujar un', ‘pujar dos', ‘baixar un' i ‘baixar dos'. L'ascensor es comporta, a partir dels botons esmentats, segons el següent diagrama de transició d'estats:*/

public class Ascensor {
    public static void main(String[] args) {
        System.out.println("pis?");    
        String pis = Entrada.readLine();
        System.out.println("botó?");
        String boto = Entrada.readLine();
        
        if (pis.equals("planta baixa")) {
            if (boto.equals("pujar un")) {
                System.out.println("primer pis");
            } else if (boto.equals("pujar dos")) {
                System.out.println("segon pis");
              } else {
                    System.out.println("error");
                }
        }
        
        if (pis.equals("primer pis")) {
            if (boto.equals("baixar un")) {
                System.out.println("planta baixa");
            } else if (boto.equals("pujar un")) {
                System.out.println("segon pis");
              } else {
                    System.out.println("error");
                }
        }
        
        if (pis.equals("segon pis")) {
            if (boto.equals("baixar un")) {
                System.out.println("primer pis");
            } else if (boto.equals("baixar dos")) {
                  System.out.println("planta baixa");  
              } else {
                    System.out.println("error");
                } 
        }   
        
        if (!pis.equals("planta baixa") && !pis.equals("primer pis") && !pis.equals("segon pis")) {
            System.out.println("error");
        }    
    }
}
