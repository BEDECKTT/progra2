class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

class Cuadrilatero {
    private Punto punto1;
    private Punto punto2;
    private Punto punto3;
    private Punto punto4;

    public Cuadrilatero(Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
        this.punto4 = punto4;
    }

    public double calcularArea() {
        double x1 = punto1.getX();
        double y1 = punto1.getY();
        double x2 = punto2.getX();
        double y2 = punto2.getY();
        double x3 = punto3.getX();
        double y3 = punto3.getY();
        double x4 = punto4.getX();
        double y4 = punto4.getY();

        // Aplicar la fórmula de Shoelace para calcular el área
        double area = 0.5 * Math.abs(x1 * y2 + x2 * y3 + x3 * y4 + x4 * y1
                - y1 * x2 - y2 * x3 - y3 * x4 - y4 * x1);

        return area;
    }
}

class Trapezoide extends Cuadrilatero {
    public Trapezoide(Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
        super(punto1, punto2, punto3, punto4);
    }

    @Override
    public double calcularArea() {
        // Implementa el cálculo del área de un trapecio
        
        return 0.0;
    }
}

class Paralelogramo extends Cuadrilatero {
    public Paralelogramo(Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
        super(punto1, punto2, punto3, punto4);
    }

    @Override
    public double calcularArea() {
        // Implementa el cálculo del área de un paralelogramo
        return 0.0;
    }
}

class Rectangulo extends Paralelogramo {
    public Rectangulo(Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
        super(punto1, punto2, punto3, punto4);
    }

    @Override
    public double calcularArea() {
        // Implementa el cálculo del área de un rectángulo
        return 0.0;
    }
}

class Cuadrado extends Rectangulo {
    public Cuadrado(Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
        super(punto1, punto2, punto3, punto4);
    }

    @Override
    public double calcularArea() {
        // Implementa el cálculo del área de un cuadrado
        return 0.0;
    }
}

