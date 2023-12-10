// Subclase EmpleadoAsalariado
public class EmpleadoAsalariado extends Empleado {
    private double salarioMensual;

    public EmpleadoAsalariado(String nombre, double salarioMensual) {
        super(nombre);
        this.salarioMensual = salarioMensual;
    }

    // Implementación del método ingresos
    @Override
    public double ingresos() {
        return salarioMensual;
    }
}