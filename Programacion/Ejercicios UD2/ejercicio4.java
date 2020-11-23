import java.util.Scanner;

public class ejercicio4 {
   
    
    public static void main (String[] args) {
        int a = 0;
        int b = 0;
        float por_chicos = 0; 
        float por_chicas = 0;

        System.out.println("Cuantos chicos: ");
        Scanner sca = new Scanner(System.in);
        a = sca.nextInt();
        System.out.println("Cuantas chicas: ");
        Scanner scb = new Scanner(System.in);
        b = scb.nextInt();

        por_chicos = (a + b)/100 * a;
        por_chicas = (a + b)/100 * b;

        System.out.println("Hay un porcentaje de chicos en clase del : " + por_chicos + "%");
        System.out.println("Hay un porcentaje de chicas en clase del : " + por_chicas + "%");

    }
}
