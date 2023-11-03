public class Ejercicio10 {
    
    public int numero;

    public Ejercicio10 ( int x )
    {
        numero = x; 
    }

    public void Imprime()
    {
        System.out.println(" \n Acontinuacion se imprime un tabledo de damas: ");

        int contadorHorizontal = 1;
        int contadorVertical = 1;
        int dimension = 8;

        while ( contadorVertical <= dimension )
        {
            contadorHorizontal = 1;

            while ( contadorHorizontal <= dimension )
            {
                if ( 0 == contadorVertical % 2)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print(" *");
                }
                contadorHorizontal++;
            }
            System.out.print("\n");
            contadorVertical++;
        }
    }
}

