//Ejercicio 6.16
//Multiplos

import java.util.Scanner;

public class Ejercicio2 {

    public static boolean esMultiplo(int numero1, int numero2) {
        if (numero2 % numero1 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese el primer número (o -1 para salir): ");
            int numero1 = scanner.nextInt();

            if (numero1 == -1) {
                break;
            }

            System.out.print("Ingrese el segundo número: ");
            int numero2 = scanner.nextInt();

            boolean resultado = esMultiplo(numero1, numero2);

            if (resultado) {
                System.out.println(numero2 + " es múltiplo de " + numero1);
            } else {
                System.out.println(numero2 + " no es múltiplo de " + numero1);
            }
        }

        scanner.close();
    }
}