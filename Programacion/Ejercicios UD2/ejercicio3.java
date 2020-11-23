import java.util.Scanner;

public class ejercicio3 {
    

    public static void main (String[] args) {
        int a = 0;
        int b = 0;

        System.out.println("Escribe la variable A: ");
        Scanner sca = new Scanner(System.in);
        a = sca.nextInt();
        System.out.println("Escribe la variable B: ");
        Scanner scb = new Scanner(System.in);
        b = scb.nextInt();
        System.out.println("A + B = " + (a + b));
        System.out.println("A - B = " + (a - b));
        System.out.println("A / B = " + (a / b));
        System.out.println("A x B = " + (a * b));

    }
}
