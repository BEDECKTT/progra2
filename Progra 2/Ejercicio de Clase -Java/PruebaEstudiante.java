import java.util.Scanner;

public class PruebaEstudiante {
    
    public static void main(String[] args)
    {
        Scanner imput = new Scanner(System.in);

        Estudiante estudiante1 = new Estudiante("03052154", "Alberto", "Fisica", 67);

        System.out.printf("El nombre es %s , %s, %s, %s, %n%n: ", estudiante1.obtenercuenta(),estudiante1.obtenermateria(), estudiante1.obtenernombre(), estudiante1.obtenerobservacion());

    }
}
