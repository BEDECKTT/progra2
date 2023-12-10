// Subclase EmpleadoBaseMasComision
public class EmpleadoBaseMasComision extends EmpleadoPorComision {
    private double salarioBase;

    public EmpleadoBaseMasComision(String nombre, double ventasBrutas, double tarifaComision, double salarioBase) {
        super(nombre, ventasBrutas, tarifaComision);
        this.salarioBase = salarioBase;
    }

    // Modificación del método ingresos para incluir salario base
    @Override
    public double ingresos() {
        return super.ingresos() + salarioBase;
    }
}