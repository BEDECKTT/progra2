public class PruebaPunto {
    public static void main(String[] args) {
        Punto punto1 = new Punto(8, 3);
        Punto punto2 = new Punto(4, 13);
        Punto punto3 = new Punto(4, 3);
        Punto punto4 = new Punto(6, 3);

        Cuadrado cuadrado = new Cuadrado(punto1, punto2, punto3, punto4);
        Rectangulo rectangulo = new Rectangulo(punto1, punto2, punto3, punto4);
        Paralelogramo paralelogramo = new Paralelogramo(punto1, punto2, punto3, punto4);
        Trapezoide trapezoide = new Trapezoide(punto1, punto2, punto3, punto4);

        System.out.println("Área del Cuadrado: " + cuadrado.calcularArea());
        System.out.println("Área del Rectángulo: " + rectangulo.calcularArea());
        System.out.println("Área del Paralelogramo: " + paralelogramo.calcularArea());
        System.out.println("Área del Trapezoide: " + trapezoide.calcularArea());
    }
}