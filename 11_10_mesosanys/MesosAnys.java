/*Desenvolupa un programa que demani un mes i un any, i escrigui el mes anterior i el mes següent.j
ava MesosAnys
Mes?
10
Any?
2022
Mes anterior 9/2022 i mes següent 11/2022*/

public class MesosAnys {
    public static void main(String[] args) {
        System.out.println("Mes?");
        int mes = Integer.parseInt(Entrada.readLine());
        
        System.out.println("Any?");
        int any = Integer.parseInt(Entrada.readLine());
        
        if (mes > 1 && mes < 12) {
            System.out.println("Mes anterior " + (mes - 1) + "/" + any + " i mes següent " + (mes + 1) + "/" + any);  
        } else if (mes == 1) {
            System.out.println("Mes anterior " + (mes + 11) + "/" + (any - 1) + " i mes següent " + (mes + 1) + "/" + any);  
        } else if (mes == 12) {
            System.out.println("Mes anterior " + (mes - 1) + "/" + any + " i mes següent " + (mes - 11) + "/" + (any + 1));
        }
    }
}
