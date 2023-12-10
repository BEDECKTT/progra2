public class EmpleadoPorHoras extends Empleado {
    private double horas; // Horas trabajadas por el empleado
    private double sueldo; // Sueldo por horas

    // Constructor que recibe los datos necesarios
    public EmpleadoPorHoras(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double sueldoPorHoras, double horasTrabajadas) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial); // Llama al constructor de la clase base
        establecerSueldo(sueldoPorHoras);
        establecerHoras(horasTrabajadas);
    }

    // Método para establecer el sueldo por horas
    public void establecerSueldo(double sueldoPorHoras) {
        if (sueldoPorHoras >= 0) {
            sueldo = sueldoPorHoras;
        } else {
            throw new IllegalArgumentException("El sueldo por horas debe ser mayor o igual a 0");
        }
    }

    // Método para establecer las horas trabajadas
    public void establecerHoras(double horasTrabajadas) {
        if (horasTrabajadas >= 0 && horasTrabajadas <= 168) {
            horas = horasTrabajadas;
        } else {
            throw new IllegalArgumentException("Las horas trabajadas deben estar entre 0 y 168");
        }
    }

    // Método para calcular los ingresos del empleado por horas
    public double ingresos() {
        if (horas <= 40) {
            return horas * sueldo;
        } else {
            // Si se trabajan más de 40 horas, se aplican las horas extras con un sueldo de 1.5 veces el sueldo base
            return 40 * sueldo + (horas - 40) * (sueldo * 1.5);
        }
    }

    // Método toString para obtener la representación en cadena del objeto
    @Override
    public String toString() {
        return String.format("Empleado por horas: %s%nSueldo por horas: %.2f%nHoras trabajadas: %.2f%nIngresos: %.2f",
                super.toString(), sueldo, horas, ingresos());
    }
}
