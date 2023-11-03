//
//

public class Ejercicio9 {

    public static void main( String[] args)
    {
        int dimension = 5;

        System.out.print("\nEste programa prueba e imprime todas las ternas");
        System.out.printf(" pitagoricas para numeros no mayores que %d ", dimension);
        System.out.print(" mediante la fuerza bruta.\n");

        for ( int i = 1; i <= dimension; i++ )
        for ( int j = 1; j <= dimension; j++ )
        for ( int k = 1; k <= dimension; k++ )
        {
            if ( i*i == j*j + k*k )
            System.out.printf("%3d\t%3d\t%3d\n", i, j, k);
        }
    }
    
}
