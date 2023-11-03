//Ejercicio 4.21
//EL mayor de 10 numeros
import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args)
    {
        Scanner imput = new Scanner(System.in);

        int numero;
        int contador = 1;
        int mayor;

        System.out.printf(" \n Ingrese un numero %d: ", contador++);
        mayor = imput.nextInt();

        while ( 10 >= contador )
        {
            System.out.printf(" \n Ingrese un numero %d: ", contador++);
            numero = imput.nextInt();

            if ( numero > mayor )
            mayor = numero;
        }

        System.out.printf(" El numero mayor es: %d\n\n", mayor);

        imput.close();
    }

    
}
