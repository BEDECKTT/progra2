import java.util.Scanner;

public class Ejercicio7 {
    
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);

        String nombre;
        int area;
        int lado;

        System.out.print( " Ingrese su nombre: ");
        nombre = imput.nextLine();

        System.out.print( " Hola " + nombre + " Ingrese los datos para el area del cuadrado" );
        lado = imput.nextInt();

        area = lado * lado;

        System.out.printf( "El area del cuadra es %d%n", area);
        imput.close();
    }

}
