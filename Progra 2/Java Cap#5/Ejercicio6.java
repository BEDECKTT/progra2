//Ejercicio 5.16
//Asteriscos segun el numero ingresado
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[]args)
    {
        Scanner imput = new Scanner(System.in);

        int numero;
        int contador = 1;

        while ( contador <= 5 )
        {
            System.out.printf(" \n Por favor ingrese un numero %d: \n", contador);
            numero = imput.nextInt();

            if ( ( numero >= 5 ) && ( numero <= 30) )
            {
                for ( int i = 1; i <= numero; i++)
                System.out.print("*");

                System.out.println();
                contador++;
            }
        }
        imput.close();
    }
    
}
