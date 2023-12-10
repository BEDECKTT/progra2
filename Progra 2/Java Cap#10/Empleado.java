// Clase Empleado
public abstract class Empleado implements PorPagar {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerNombre() {
        return nombre;
    }

    // Método abstracto ingresos que deben implementar las subclases
    public abstract double ingresos();

    // Método de la interfaz PorPagar
    public double obtenerMontoPago() {
        return ingresos();
    }
}

