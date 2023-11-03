import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner imput = new Scanner (System.in);

        int num1;
        
        System.out.print( " Ingrese un numero entero: ");
        num1 = imput.nextInt();

        System.out.println( " El cuadrado es: " + Math.pow(num1,2));
        imput.close();
    }
}
