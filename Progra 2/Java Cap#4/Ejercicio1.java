//Ejercicio 4.6


public class Ejercicio1{
    public static void main(String[] args)
    {
        int suma = 0;
        int x = 1;

        while (x <= 10) 
        {
            suma += x; 
            ++x; //incrementa
        }

        System.out.printf("La suma es: %d%n", suma);
    }
} 