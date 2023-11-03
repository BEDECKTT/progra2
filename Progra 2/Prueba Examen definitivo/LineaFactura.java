class LineaFactura {
    private int cantidad;
    private String producto;
    private double precioUnitario;

    public LineaFactura(int cantidad, String producto, double precioUnitario) {
        this.cantidad = cantidad;
        this.producto = producto;
        this.precioUnitario = precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getProducto() {
        return producto;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }
}