//Ejercicio 4.22
import java.util.Scanner;

public class Ejercicio3{

    public static void main(String[] args)
    {
        Scanner imput = new Scanner(System.in);

        int contador = 1;

        System.out.print("\n   1 10*N 100*N 1000*N \n \n");

        while ( 5 >= contador)
        {
            System.out.printf("%6d %6d %6d %6d\n", contador, 10*contador, 100*contador, 
            1000*contador++);
        }
        imput.close();
    }
    
}