//Ejercicio 5.24
//Rombo usando asteriscos

public class Ejercicio8 {
    
    public static void main( String[] args)
    {
        int dimension = 9;//controla la diagonal
        for ( int i = 1; i <= ((dimension/2) + 1); i ++ )
        {
            for ( int  k = 1; k <= dimension / 2 - i + 1; k++ )
            System.out.printf(" ");

            for ( int j = (dimension / 2) - i + 2; j <= (dimension / 2) + i; j++ )
            System.out.printf("*");//Imprime el triangulo superior

            System.out.printf("\n");
        }
        for ( int l = 1; l <= dimension / 2; l++ )//Triangulo inferior
        {
            for( int m = 1; m <= l; m++ )//Imprime los espacios
            {
                System.out.printf(" ");
            }
            for (int n = l + 1; n <= dimension - l  ; n++)
            System.out.printf("*");

            System.out.println();
        }
    }
    
}
