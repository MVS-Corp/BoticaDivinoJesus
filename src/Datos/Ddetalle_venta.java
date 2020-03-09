
package Datos;




public class Ddetalle_venta {

    private int cod_detalle;
    private int cantidad_detalle;
    private double precio_producto ;
    private long cod_productoFK; 
    private int cod_ventaFK;
    private double subtotal;
    private double subPrecioCompra;
    private double precio_compra;

    public Ddetalle_venta() {
    }

    public Ddetalle_venta(int cod_detalle, int cantidad_detalle, double precio_producto, long cod_productoFK, int cod_ventaFK, double subtotal, double subPrecioCompra, double precio_compra) {
        this.cod_detalle = cod_detalle;
        this.cantidad_detalle = cantidad_detalle;
        this.precio_producto = precio_producto;
        this.cod_productoFK = cod_productoFK;
        this.cod_ventaFK = cod_ventaFK;
        this.subtotal = subtotal;
        this.subPrecioCompra = subPrecioCompra;
        this.precio_compra = precio_compra;
    }

    public int getCod_detalle() {
        return cod_detalle;
    }

    public void setCod_detalle(int cod_detalle) {
        this.cod_detalle = cod_detalle;
    }

    public int getCantidad_detalle() {
        return cantidad_detalle;
    }

    public void setCantidad_detalle(int cantidad_detalle) {
        this.cantidad_detalle = cantidad_detalle;
    }

    public double getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(double precio_producto) {
        this.precio_producto = precio_producto;
    }

    public long getCod_productoFK() {
        return cod_productoFK;
    }

    public void setCod_productoFK(long cod_productoFK) {
        this.cod_productoFK = cod_productoFK;
    }

    public int getCod_ventaFK() {
        return cod_ventaFK;
    }

    public void setCod_ventaFK(int cod_ventaFK) {
        this.cod_ventaFK = cod_ventaFK;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getSubPrecioCompra() {
        return subPrecioCompra;
    }

    public void setSubPrecioCompra(double subPrecioCompra) {
        this.subPrecioCompra = subPrecioCompra;
    }

    public double getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(double precio_compra) {
        this.precio_compra = precio_compra;
    }

}
