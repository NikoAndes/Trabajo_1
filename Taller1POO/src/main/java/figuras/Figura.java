package figuras;

// Clase abstracta Figura
public abstract class Figura {
    protected String nombre; // Nombre de la figura

    public Figura(String nombre) { // Constructor que inicializa el nombre de la figura
        this.nombre = nombre;
    }

    public String getNombre() { // Método para obtener el nombre de la figura
        return nombre;
    }

    // Métodos abstractos para implementar en las subclases
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}
