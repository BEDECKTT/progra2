import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);

       int a,b;

       System.out.print( " Ingrese el primer numero: ");
       a = imput.nextInt();

       System.out.print( " Ingrese el segundo numero: ");
       b = imput.nextInt();

       if ( a > b )
       System.out.println( " Primer numero: " + a + " es mayor que el segundo numero: " + b );

       else if ( a == b ) 
       System.out.println( " El primer numero es igual que al segundo numero " );

       else 

       System.out.println( " El segundo numero: " + b + " es mayor que el primer numero: " + a);
      imput.close();
    }
}