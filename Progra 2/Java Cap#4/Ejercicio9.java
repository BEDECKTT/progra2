public class Ejercicio9 {
    
    public static long factorial( long numero )
    {
        if ( numero <= 1 )
        {
            return 1;
        }
        else 
        {
            return numero * factorial( numero - 1 );
        }

    }

    public static void main(String[] args)
    {
        for ( int contador = 0; contador <= 21; contador++)
        {
            System.out.printf(" %d! = %d%n", contador, factorial(contador));
        }

    }
}
