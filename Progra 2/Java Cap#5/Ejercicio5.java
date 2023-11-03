//Ejercicio 5.15
//Triangulo en diferentes posiciones

public class Ejercicio5 {

    public static void main(String[] args)
    {
      int dimension = 10;

      for ( int i = 1; i <= dimension; i++)
      {
        for ( int j = 1; j <= i; j++ )
        System.out.print("*");

        for ( int k = i + 1; k <= dimension; k++)
        System.out.print(" ");

        System.out.print(" ");
        System.out.print(" ");
        System.out.print(" ");
        System.out.print(" ");

        for ( int l = 1; l <= dimension + 1 - i; l++ )
        System.out.print("*");

        for ( int m = dimension - 1 -i; m <= dimension; m++)
        System.out.print(" ");

        System.out.print(" ");
        System.out.print(" ");
        System.out.print(" ");
        System.out.print(" ");

        for ( int n = 1; n < i; n++ )
        System.out.print(" ");
   
        for ( int p = i; p <= dimension; p++ )
        System.out.print("*");

        System.out.print(" ");
        System.out.print(" ");
        System.out.print(" ");
        System.out.print(" ");

        for ( int q = 1; q <= dimension - i; q++ )
        System.out.print(" ");

        for ( int r = dimension - i; r < dimension; r++ )
        System.out.print("*");

        System.out.println();
      }
      System.out.println("\n");
    } 
}
