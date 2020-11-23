import java.util.Scanner;


public class ejercicio5 {
    
    public static void main(String[] args) {
        double a = 0;
        final double pesetas = 166.386;
        double convert = 0;
        
        System.out.println("Escribe la cantidad de Euros que quiere convertir en Pesetas: ");
        Scanner sca = new Scanner(System.in);
        a = sca.nextDouble();

        convert = a * pesetas;
        System.out.println("La cantidad de Euros en Pesetas es:  " + convert + "PTAS");
    }
}
