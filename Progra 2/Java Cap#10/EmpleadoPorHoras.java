// Subclase EmpleadoPorHoras
public class EmpleadoPorHoras extends Empleado {
    private double horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoPorHoras(String nombre, double horasTrabajadas, double tarifaPorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    // Implementación del método ingresos
    @Override
    public double ingresos() {
        return horasTrabajadas * tarifaPorHora;
    }
}