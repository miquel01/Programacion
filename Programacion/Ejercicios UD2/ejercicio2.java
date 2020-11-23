import java.util.Scanner;

public class ejercicio2 {
    
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;

        System.out.println("Escribe la variable A: ");
        Scanner sca = new Scanner(System.in);
        a = sca.nextInt();
        System.out.println("Escribe la variable B: ");
        Scanner scb = new Scanner(System.in);
        b = scb.nextInt();
        c = a;
        a = b;
        b = c;
        System.out.println("La variable A se intercambia por B = " + a);
        System.out.println("La variable B se intercambia por A = " + b);
    }
}