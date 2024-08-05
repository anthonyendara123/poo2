
import java.util.List;

public class Chef extends Persona implements Actividad {
    private List<String> recetas;
    private int anosDeExperiencia; // Cambiar a anosDeExperiencia

    public Chef(String nombre, int edad, List<String> recetas, int anosDeExperiencia) {
        super(nombre, edad);
        this.recetas = recetas;
        this.anosDeExperiencia = anosDeExperiencia;
    }

    public List<String> getRecetas() {
        return recetas;
    }

    public void agregarReceta(String receta) {
        recetas.add(receta);
    }

    public int getAnosDeExperiencia() {
        return anosDeExperiencia;
    }

    public void setAnosDeExperiencia(int anosDeExperiencia) {
        this.anosDeExperiencia = anosDeExperiencia;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Chef: " + getNombre() + ", Edad: " + getEdad() + ", Recetas: " + String.join(", ", recetas) + ", Años de Experiencia: " + anosDeExperiencia);
    }

    @Override
    public void realizarActividad() {
        System.out.println(getNombre() + " está creando una nueva receta.");
    }

    public String prepararPlato(String plato) {
        return "El chef " + getNombre() + " ha preparado un " + plato + ".";
    }

    public int contarRecetas() {
        return recetas.size();
    }
}