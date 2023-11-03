//Ejercicio 6.17
//Par e Impar

import java.util.Scanner;

public class Ejercicio3 {

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese un número (o -1 para salir): ");
            int numero = scanner.nextInt();

            if (numero == -1) {
                break;
            }

            boolean resultado = esPar(numero);

            if (resultado) {
                System.out.println(numero + " es un número par.");
            } else {
                System.out.println(numero + " es un número impar.");
            }
        }

        scanner.close();
    }
}