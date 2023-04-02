
package main;
import java.util.ArrayList;
import java.util.Collections;
import producto.Producto;
import producto.Envio;
import producto.Venta;

public class Main {

    public static void main(String[] args) {
          // Creamos algunos productos
    Producto p1 = new Producto("Televisor", "Televisor Samsung 55 pulgadas", 3000000, 8);
    Producto p2 = new Producto("Lavadora", "Lavadora LG de carga frontal", 2000000, 12);
    Producto p3 = new Producto("Refrigerador", "Refrigerador Whirlpool con dispensador de agua", 3500000, 6);

    // Creamos una venta
    Venta venta = new Venta();

    // Agregamos algunos productos a la venta
    venta.agregarProducto(p1);
    venta.agregarProducto(p2);
    venta.agregarProducto(p3);

    // Ordenamos los productos por precio
    venta.ordenarProductosPorPrecio();

    // Buscamos un producto por nombre
    Producto productoBuscado = venta.buscarProductoPorNombre("Lavadora");
    if (productoBuscado != null) {
        System.out.println("Producto encontrado: " + productoBuscado.getNombre());
    } else {
        System.out.println("Producto no encontrado");
    }
    

    // Creamos un envío
    Envio envio = new Envio("Jose Leandro Oviedo");

    // Calculamos el costo de envío para una distancia de x kilómetros
    double costoEnvio = envio.calcularCostoEnvio(50);
    System.out.println("El costo de envío es: Gs " + costoEnvio);
    }
    
}
