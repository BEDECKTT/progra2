import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);

        double a,b,c,d;
        double promedio;

        System.out.print( " Ingrese el primer dato: ");
        a = imput.nextFloat();

         System.out.print( " Ingrese el segundo dato: ");
        b = imput.nextFloat();
        
         System.out.print( " Ingrese el tercer dato: ");
        c = imput.nextFloat();

         System.out.print( " Ingrese el cuarto dato: ");
        d = imput.nextFloat();

        promedio = (a + b + c + d)/4;

        System.out.printf( " El promedio de los cuatro datos es " + promedio);
        imput.close();
    }
}


