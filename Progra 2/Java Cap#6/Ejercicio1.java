//Ejercicio 6.15
//Calcula la hipotenusa

import java.util.Scanner;

public class Ejercicio1 {

    public static double hipotenusa(double lado1, double lado2) {
        double hipotenusa = Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2, 2));
        return hipotenusa;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud del lado 1: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Ingrese la longitud del lado 2: ");
        double lado2 = scanner.nextDouble();

        double resultado = hipotenusa(lado1, lado2);

        System.out.println("La longitud de la hipotenusa es: " + resultado);

        scanner.close();
    }
}