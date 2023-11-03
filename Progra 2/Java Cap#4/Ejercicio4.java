//Ejercicio 4.33
//Multiplos de 2
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args)
    {
        Scanner imput = new Scanner(System.in);

        System.out.print(" \n Este programa imprime los multiplos de 2");
        
        int x = 1;

        while ( x > 0)
        {
            System.out.printf("\n %d", 2*x++);
        }

        imput.close();
    }  
}
