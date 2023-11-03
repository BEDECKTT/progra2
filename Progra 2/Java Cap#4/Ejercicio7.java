//EJERCICIO 4.35
//Determine que triangulo se forma
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args)
    {
        Scanner imput = new Scanner(System.in);

        long l1, l2, l3;
 
		System.out.println("Escriba el lado 1");
		l1 = imput.nextLong();
 
		System.out.println("Escriba el lado 2");
		l2 = imput.nextLong();
 
		System.out.println("Escriba el lado 3");
		l3 = imput.nextLong();
 
		if(l1== l2 && l2 == l3 && l1 == l3)
		{
		    System.out.println("Triangulo Equilatero");
		}
        else	
        {
			if((l1==l2 && l1 != l3) || (l1==l3 && l1 != l2) || (l2==l3 && l2 != l1))
			{
				System.out.println("Triangulo Isoseles");
			}	
            else	
            {
			    System.out.println("Triangulo Escaleno");
			}
		}
        imput.close();
    }
    
}
