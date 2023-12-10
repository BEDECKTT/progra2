public class PruebaPago {
    public static void main(String[] args) {
        // Crear objetos de las subclases
        Empleado empleadoAsalariado = new EmpleadoAsalariado("John", 800.00);
        Empleado empleadoPorHoras = new EmpleadoPorHoras("Jane", 16, 20.5);
        Empleado empleadoPorComision = new EmpleadoPorComision("Bob",5000, 20.5);
        Empleado empleadoBaseMasComision = new EmpleadoBaseMasComision("Mike", 3000, 20.5, 12000);

        // Crear un arreglo de objetos PorPagar
        PorPagar[] cuentasPorPagar = new PorPagar[]{empleadoAsalariado, empleadoPorHoras, empleadoPorComision, empleadoBaseMasComision};

        // Procesar el arreglo y obtener los montos de pago
        for (PorPagar cuenta : cuentasPorPagar) {
            System.out.printf("%s\n%s: $%,.2f\n\n", cuenta, "Pago total", cuenta.obtenerMontoPago());
        }
    }
}
