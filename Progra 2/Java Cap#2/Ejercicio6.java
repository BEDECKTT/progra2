import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner imput = new Scanner (System.in);

        double radio;

        System.out.print( "Ingrese su radio: ");
        radio = imput.nextInt();

        System.out.println( "La longuitud de la circunferencia es: " + 2*Math.PI*radio);
        imput.close();
    }
}