import java.util.List;

public abstract class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public abstract void mostrarInformacion();

    public String obtenerInformacionCompleta() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }
}