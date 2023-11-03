import java.util.Scanner;
 
public class Ejercicio4 {
    
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);

        int num1;
        int num2;
        int num3;

        System.out.print( " Escriba el primer entero: ");
        num1 = imput.nextInt();

        System.out.print( " Escriba el segundo entero: ");
        num2 = imput.nextInt();

        num3 = ( num1 ) / ( num2 );

        if ( num2 == 0 ){
            
            System.out.printf( " Error al ingresesar el segundo entero", num2);

        }   else 
        System.out.printf( " La division es %d%n ", num3);
        imput.close();
    }
}
