package producto;
import java.util.ArrayList;
import java.util.Collections;

public class Venta {
    private ArrayList<Producto> productos;

    public Venta() {
        productos = new ArrayList<Producto>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

    public Producto buscarProductoPorNombre(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equals(nombre)) {
                return producto;
            }
        }
        return null;
    }

    public void ordenarProductosPorPrecio() {
        Collections.sort(productos);
    }
}
