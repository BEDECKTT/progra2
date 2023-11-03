//Ejercicio 4.36
//Triangulo rectangulo
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args)
    {
        Scanner imput = new Scanner(System.in);

        long L1, L2, L3;

        System.out.println("Escriba el lado 1");
		L1 = imput.nextLong();
 
		System.out.println("Escriba el lado 2");
		L2 = imput.nextLong();
 
		System.out.println("Escriba el lado 3");
		L3 = imput.nextLong();

        if( ( L1 != L2 && L2 != L3 ) && ( L1 < L3 && L2 < L3 ))
        {
            System.out.print("Es un triangulo rectagunlo");
        }
        else 
        {
            System.out.print("No es un triangulo rectangulo!!!");
        }
        imput.close();
    }
    
}
