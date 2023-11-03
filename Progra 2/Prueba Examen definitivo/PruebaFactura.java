import java.util.Date;
class PruebaFactura {
    public static void main(String[] args) {
        // Crear líneas de factura
        LineaFactura[] lineasFactura = new LineaFactura[2];
        lineasFactura[0] = new LineaFactura(3, "Producto A", 10.0);
        lineasFactura[1] = new LineaFactura(2, "Producto B", 15.0);

        // Crear una factura
        Factura factura = new Factura("Cliente XYZ", new Date(), lineasFactura);

        // Imprimir la información de la factura
        System.out.println("Cliente: " + factura.getCliente());
        System.out.println("Fecha: " + factura.getFecha());

        System.out.println("Detalles de la factura:");
        for (LineaFactura linea : factura.getLineasFactura()) {
            System.out.println("Producto: " + linea.getProducto());
            System.out.println("Cantidad: " + linea.getCantidad());
            System.out.println("Precio Unitario: " + linea.getPrecioUnitario());
        }

        double total = factura.getTotal();
        System.out.println("Subtotal de la factura: $" + total);
    }
}
