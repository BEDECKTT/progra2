//Ejercicio 5.12
//Calcular el producto de impares del 1 al 15
public class Ejercicio4 {

    public static void main( String [] args)
    {
        int producto = 1;

        for ( int i = 1; i <= 15; i++)
        {
            if ( i % 2 != 0)
            producto *= i;
        }

        System.out.printf("\nEl producto es: %d\n", producto );
    }
    
}
