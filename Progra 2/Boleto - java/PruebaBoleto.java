import java.util.Scanner;

public class PruebaBoleto {

    public static void main(String[] args) 
    {
        try (Scanner imput = new Scanner(System.in)) {
            System.out.println("Bienvenido al sistema de boletos de cine.");

            System.out.print("Ingrese el número de filas en la sala de cine: ");
            int numRows = imput.nextInt();

            System.out.print("Ingrese el número de columnas en la sala de cine: ");
            int numCols = imput.nextInt();

            Boleto cinema = new Boleto(numRows, numCols);

            while (true) 
            {
                System.out.println("\nMenú:");
                System.out.println("1. Mostrar mapa de asientos");
                System.out.println("2. Reservar un asiento");
                System.out.println("3. Salir");
                System.out.print("Seleccione una opción: ");

                int choice = imput.nextInt();

                switch (choice) {
                    case 1:
                        cinema.printSeatMap();
                        break;
                    case 2:
                        System.out.print("Ingrese el número de fila: ");
                        int row = imput.nextInt();
                        System.out.print("Ingrese el número de columna: ");
                        int col = imput.nextInt();
                        cinema.bookSeat(row, col);
                        break;
                    case 3:
                        System.out.println("Gracias por usar el sistema de boletos de cine. ¡Hasta luego!");
                        System.exit(0);
                    default:
                        System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                }

            }
        }
    }
    
}
