import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear listas de recetas y productos comprados
        List<String> recetasChef = new ArrayList<>();
        recetasChef.add("Paella");
        recetasChef.add("Risotto");

        List<String> productosCompradosCliente = new ArrayList<>();
        productosCompradosCliente.add("Pasta");
        productosCompradosCliente.add("Salsa");

        // Crear instancias de Chef y Cliente
        Chef chef = new Chef("Carlos", 35, recetasChef, 10);
        Cliente cliente = new Cliente("Ana", 28, productosCompradosCliente);

        // Mostrar información inicial
        chef.mostrarInformacion();
        cliente.mostrarInformacion();

        // Probar métodos funcionales
        System.out.println(chef.prepararPlato("Ensalada"));
        System.out.println(cliente.recomendarProducto());

        // Agregar y mostrar nuevas recetas y productos
        chef.agregarReceta("Sopa");
        cliente.agregarProductoYMostrar("Pan");

        // Mostrar información actualizada
        chef.mostrarInformacion();
        cliente.mostrarInformacion();

        // Contar recetas
        System.out.println("Número de recetas del chef: " + chef.contarRecetas());
    }
}