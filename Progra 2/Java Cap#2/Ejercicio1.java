import java.util.Scanner;

public class Ejercicio1 {

     public static void main(String[] args)
    {
        Scanner imput = new Scanner (System.in);

        int num1;
        int num2;
        int suma;
        
        System.out.print( " Escriba el primer numero entero: " );
        num1 = imput.nextInt();

        System.out.print( " Escriba el segundo entero: " );
        num2 = imput.nextInt();

        suma = num1 + num2;

        System.out.printf("La suma es %d%n", suma);
        imput.close();
    }

}


