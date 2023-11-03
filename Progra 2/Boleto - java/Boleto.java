
public class Boleto {
    private boolean[][] seats;
    private int numRows;
    private int numCols;

    public Boleto(int numRows, int numCols) {
        this.numRows = numRows;
        this.numCols = numCols;
        seats = new boolean[numRows][numCols];
        // asientos como disponibles al comienzo
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                seats[i][j] = true;
            }
        }
    }

    public void printSeatMap() {
        System.out.println("Estado de los asientos:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (seats[i][j]) {
                    System.out.print("O "); // o para asientos disponibles
                } else {
                    System.out.print("X "); // x para asientos ocupados
                }
            }
            System.out.println();
        }
    }

    public void bookSeat(int row, int col) {
        if (row >= 1 && row <= numRows && col >= 1 && col <= numCols) {
            if (seats[row - 1][col - 1]) {
                seats[row - 1][col - 1] = false;
                System.out.println("¡Boleto reservado con éxito!");
               
            } else {
                System.out.println("El asiento seleccionado ya está ocupado. Por favor, elige otro.");
            }
        } else {
            System.out.println("Asiento no válido. Por favor, ingresa un número de fila y columna válidos.");
        }
        
        System.out.print("Su numero de asiento es: " + row + "-" + col);
        
    }
    
}