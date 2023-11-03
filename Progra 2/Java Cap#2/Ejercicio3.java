import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);

        int num1;
        int num2;
        int num3;

        System.out.print( "Escriba el primero entero: " );
        num1 = imput.nextInt();

        System.out.print( " Escriba el segundo entero: " );
        num2 = imput.nextInt();

        num3 = num1 - num2;

        System.out.printf( " La resta es %d%n ", num3);
        imput.close();
    }
}
