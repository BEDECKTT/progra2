// Subclase EmpleadoPorComision
public class EmpleadoPorComision extends Empleado {
    private double ventasBrutas;
    private double tarifaComision;

    public EmpleadoPorComision(String nombre, double ventasBrutas, double tarifaComision) {
        super(nombre);
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }

    // Implementación del método ingresos
    @Override
    public double ingresos() {
        return ventasBrutas * tarifaComision;
    }
}
