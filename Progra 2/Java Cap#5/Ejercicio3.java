//Ejercicio 5.11
//El menor de n numeros

import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args)
    {
        int x;
        int y; 
        int menor;

        Scanner imput = new Scanner(System.in);

        System.out.println(" Numeros que desea comparar: ");
        x = imput.nextInt();

        System.out.println("\nPor favor introduzca un numero: ");
        menor = imput.nextInt();

        for ( int i = 2; i <= x; i++)
        {
            System.out.printf(" \n Por favor ingresar un numero: %d\n ", i );
            y = imput.nextInt();

            if ( y < menor ) menor = y;
        }

        System.out.printf("\nEl menor de los %d numeros es: %d\n", x, menor);

        imput.close();
    }

}
