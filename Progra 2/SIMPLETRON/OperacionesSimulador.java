import java.util.Scanner;

public class OperacionesSimulador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.println("Operación A: Leer 10 números positivos y calcular la suma");
        int sumaA = 0;
        for (int i = 1; i <= 10; i++) {
            int numero;
            do {
                System.out.print("Ingrese el número " + i + ": ");
                numero = input.nextInt();
                if (numero <= 0) {
                    System.out.println("El número debe ser positivo. Inténtelo de nuevo.");
                }
            } while (numero <= 0);
            sumaA += numero;
        }
        System.out.println("La suma de los números positivos es: " + sumaA);

        System.out.println("\nOperación B: Leer 7 números y calcular el promedio");
        int contadorB = 0;
        int sumaB = 0;
        while (contadorB < 7) {
            System.out.print("Ingrese un número: ");
            int numero = input.nextInt();
            sumaB += numero;
            contadorB++;
        }
        double promedioB = (double) sumaB / contadorB;
        System.out.println("El promedio de los números es: " + promedioB);

     
        System.out.println("\nOperación C: Encontrar el número más grande");
        System.out.print("Ingrese la cantidad de números a procesar: ");
        int cantidadNumeros = input.nextInt();
        int numeroMasGrande = Integer.MIN_VALUE;
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingrese un número: ");
            int numero = input.nextInt();
            if (numero > numeroMasGrande) {
                numeroMasGrande = numero;
            }
        }
        System.out.println("El número más grande es: " + numeroMasGrande);

        input.close();
    }
}
