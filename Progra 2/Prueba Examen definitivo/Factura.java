import java.util.Date;

class Factura {
    private String cliente;
    private Date fecha;
    private LineaFactura[] lineasFactura;

    public Factura(String cliente, Date fecha, LineaFactura[] lineasFactura) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.lineasFactura = lineasFactura;
    }

    public String getCliente() {
        return cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public LineaFactura[] getLineasFactura() {
        return lineasFactura;
    }

    public double getTotal() {
        double subtotal = 0.0;
        for (LineaFactura linea : lineasFactura) {
            subtotal += linea.getCantidad() * linea.getPrecioUnitario();
        }
        return subtotal;
    }
}