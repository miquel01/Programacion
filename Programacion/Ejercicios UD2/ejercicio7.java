import java.util.Scanner;

public class ejercicio7 {
    public static void main (String[] args) {
    
        double z = 0;

        Scanner num = new Scanner(System.in);
        System.out.println("Introduce el valor de x: ");
        double x = num.nextDouble();
        System.out.println("Introduce el valor de y: ");
        double y = num.nextDouble();

        z = (1 + ((x * x) / y)) / ((x * x * x) / (1 + y));
        
        
        System.out.println("El valor de z es: " + z);
    }
}
