//Ejercicio 4.29
//Cuadrado con asteriscos
import java.util.Scanner;
 
public class Ejercicio6{   
    
    public static void main(String[] args)
    {
        Scanner imput = new Scanner(System.in);

        System.out.print(" Ingrese el tamaño del cuadrado: ");
        int n = imput.nextInt();

        if ( n >= 0 && n <= 20) 
        {
            for( int i = 0; i < n; i++)//Sera la linea superior
            {
                System.out.print("*");
            }

            System.out.println();

            for( int i = 0; i < n-2; i++)//Centro de la forma
            {
                System.out.print("*");
                for( int j = 0; j < n-2; j++)
                {
                    System.out.print(" ");
                }
                System.out.println("*");
            }

            for( int i = 0; i < n; i++)//Sera la linea inferior
            {
                System.out.print("*");
            }
        } else { System.out.println("ERROR. El dato a ingresar debe estar entre 1 y 20"); }
        imput.close();

    }
               
 }           
