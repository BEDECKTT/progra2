import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
              
        Scanner imput = new Scanner(System.in);
                
        String nombre;
        String direccion;
        int edad;
                
        System.out.print("Introduce tu nombre: ");
        nombre = imput.nextLine(); 
                
        System.out.print("Introduce tu edad: ");
        edad = imput.nextInt(); 
                    
        imput.nextLine();

        System.out.print("Introduce tu direccion: ");
        direccion = imput.nextLine(); 
                
        System.out.println("Datos introducidos");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Direccion: " + direccion); 
        imput.close();                                              
    }
}
    
