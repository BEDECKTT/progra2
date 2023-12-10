public class EmpleadoPorComision extends Empleado {
    private double ventasBrutas;
    private double tarifaComision;

    public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double ventasBrutas, double tarifaComision) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }

    public double ingresos() {
        return ventasBrutas * tarifaComision;
    }

    @Override
    public String toString() {
        return String.format("Empleado por Comisión: %s\nVentas Brutas: %.2f\nTarifa de Comisión: %.2f\nIngresos: %.2f",
                super.toString(), ventasBrutas, tarifaComision, ingresos());
    }
}