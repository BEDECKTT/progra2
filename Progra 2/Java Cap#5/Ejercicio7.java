//Ejercicio 5.20
//Calcular el valor de PI
import java.util.Random;

public class Ejercicio7 {

    public static void main( String[] args)
    {
        Random aletorios = new Random();

        int dimension = 10;
        int escala = 10;
        int numero;

        for ( int i = 1; i <= dimension; i++ )
        {
            numero = 1 + aletorios.nextInt(escala);

            System.out.printf("%3d", numero);

            System.out.print( (0 == i % 5)? "\n":"" );
        }
    }
}
