package tienda;

// Clase abstracta base
public abstract class Mascota {
    protected String nombre;
    protected int edad;

    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // Método abstracto para que cada subclase indique su tipo
    public abstract String getTipo();

    // Método abstracto para descripción
    public abstract String getDescripcion();
}
