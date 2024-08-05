import java.util.List;

public class Cliente extends Persona implements Actividad {
    private List<String> productosComprados;

    public Cliente(String nombre, int edad, List<String> productosComprados) {
        super(nombre, edad);
        this.productosComprados = productosComprados;
    }

    public List<String> getProductosComprados() {
        return productosComprados;
    }

    public void agregarProductoComprado(String producto) {
        productosComprados.add(producto);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Cliente: " + getNombre() + ", Edad: " + getEdad() + ", Productos Comprados: " + String.join(", ", productosComprados));
    }

    @Override
    public void realizarActividad() {
        System.out.println(getNombre() + " está revisando su historial de compras.");
    }

    public String recomendarProducto() {
        return "Basado en tus compras, te recomendamos revisar nuestros nuevos productos.";
    }

    public void agregarProductoYMostrar(String producto) {
        agregarProductoComprado(producto);
        System.out.println(getNombre() + " ha agregado un nuevo producto: " + producto);
    }
}