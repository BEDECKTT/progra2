//Ejercicio 6.29
//Lanzar Moneda 

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

    public enum Moneda {
        CARA, CRUZ
    }

    public static Moneda tirar() {
        Random random = new Random();
        int resultado = random.nextInt(2); // 0 para CARA, 1 para CRUZ
        return (resultado == 0) ? Moneda.CARA : Moneda.CRUZ;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int caras = 0;
        int cruces = 0;

        while (true) {
            System.out.println("1. Lanzar moneda");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                Moneda resultadoLanzamiento = tirar();
                System.out.println("Resultado del lanzamiento: " + resultadoLanzamiento);

                if (resultadoLanzamiento == Moneda.CARA) {
                    caras++;
                } else {
                    cruces++;
                }
            } else if (opcion == 2) {
                break;
            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        System.out.println("Resultados:");
        System.out.println("CARAS: " + caras + " veces");
        System.out.println("CRUCES: " + cruces + " veces");

        scanner.close();
    }
}