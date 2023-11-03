import java.util.Scanner;

public class SimpletronSimulador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declaración e inicialización de variables
        int[] memoria = new int[100];
        int acumulador = 0;
        int contadorDeInstrucciones = 0;

        System.out.println("*** Bienvenido a Simpletron! ***");
        System.out.println("*** Por favor, introduzca en su programa una instrucción ***");
        System.out.println("*** (o palabra de datos) a la vez. Yo le mostraré ***");
        System.out.println("*** el número de ubicación y un signo de interrogación (?) ***");
        System.out.println("*** Entonces usted escribirá la palabra para esa ubicación. ***");
        System.out.println("*** Teclee -9999 para dejar de introducir su programa. ***");

        // Carga de programa en memoria
        System.out.println("Comience a introducir su programa:");

        int inputInstruction;
        do {
            System.out.print(String.format("%02d ? ", contadorDeInstrucciones));
            inputInstruction = input.nextInt();
            memoria[contadorDeInstrucciones] = inputInstruction;
            contadorDeInstrucciones++;
        } while (inputInstruction != -9999);

        System.out.println("*** Se completó la carga del programa ***");
        System.out.println("*** Comienza la ejecución del programa ***");

        // Ejecución del programa
        contadorDeInstrucciones = 0;
        int codigoDeOperacion, operando;

        while (contadorDeInstrucciones < memoria.length) {
            int registroDeInstruccion = memoria[contadorDeInstrucciones];
            codigoDeOperacion = registroDeInstruccion / 100;
            operando = registroDeInstruccion % 100;

            switch (codigoDeOperacion) {
                case 10: // Leer número y almacenar en memoria
                    System.out.print("Ingrese un número: ");
                    int numero = input.nextInt();
                    memoria[operando] = numero;
                    break;
                case 11: // Escribir número
                    System.out.println(memoria[operando]);
                    break;
                case 20: // Cargar número en acumulador
                    acumulador = memoria[operando];
                    break;
                case 21: // Almacenar número desde acumulador en memoria
                    memoria[operando] = acumulador;
                    break;
                case 30: // Sumar número de memoria al acumulador
                    acumulador += memoria[operando];
                    break;
                case 31: // Restar número de memoria al acumulador
                    acumulador -= memoria[operando];
                    break;
                case 32: // Dividir acumulador por número en memoria
                    if (memoria[operando] != 0) {
                        acumulador /= memoria[operando];
                    } else {
                        System.out.println("Error: División por cero.");
                        return;
                    }
                    break;
                case 33: // Multiplicar acumulador por número en memoria
                    acumulador *= memoria[operando];
                    break;
                case 40: // Saltar a una ubicación en memoria
                    contadorDeInstrucciones = operando - 1;
                    break;
                case 41: // Saltar si acumulador es negativo
                    if (acumulador < 0) {
                        contadorDeInstrucciones = operando - 1;
                    }
                    break;
                case 42: // Saltar si acumulador es igual a cero
                    if (acumulador == 0) {
                        contadorDeInstrucciones = operando - 1;
                    }
                    break;
                case 43: // Terminar programa
                    System.out.println("*** Fin de la ejecución del programa ***");
                    contadorDeInstrucciones = memoria.length;
                    break;
                default:
                    System.out.println("Error: Código de operación no válido.");
                    return;
            }
            contadorDeInstrucciones++;
        }

        // Vaciado de la computadora
        System.out.println("*** Vaciado de la computadora ***");
        System.out.println("Contador de instrucciones: " + contadorDeInstrucciones);
        System.out.println("Acumulador: " + acumulador);
        System.out.println("Contenido de la memoria:");

        for (int i = 0; i < memoria.length; i++) {
            if (memoria[i] != 0) {
                System.out.printf("%02d %04d%n", i, memoria[i]);
            }
        }
        input.close();
    }
}