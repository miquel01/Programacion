import java.util.Scanner;

public class ejercicio6 {
    
    public static void main (String[] args) {
        double examen_1 = 0;
        double val_examen_1 = 40;
        double nota_deseada = 0;
        double val_examen_2 = 60;
        double val_nota_1_media = 0;
        double examen_2 = 0;
        double val_nota_2_media = 0;

        System.out.println("Introduce la nota de tu Primer examen: ");
        Scanner sca_examen = new Scanner(System.in);
        examen_1 = sca_examen.nextDouble();
        System.out.println("Que nota querrias sacar en el trimestre ?: ");
        nota_deseada = sca_examen.nextDouble();
        val_nota_1_media = (examen_1 * val_examen_1/100);
        val_nota_2_media = nota_deseada - val_nota_1_media;
        examen_2 = (val_nota_2_media*100) / val_examen_2;

        if(examen_2 > 10 || examen_2 < 0) {
            System.out.println("No es posible calcular esa nota");
        }else{
            System.out.printf("Para tener un: " + nota_deseada + " deberias sacar en el segundo examen un: " + "%.2f %n", examen_2);       
        }
    }
}
