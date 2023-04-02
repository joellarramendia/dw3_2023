
package producto;


public class Envio {
    private String direccion;

    public Envio(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double calcularCostoEnvio(int distancia) {
        double costo = distancia * 0.5;
        return costo;
    }
}
