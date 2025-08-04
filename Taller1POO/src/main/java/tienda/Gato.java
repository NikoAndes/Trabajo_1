package tienda;

public class Gato extends Mascota {
    private String color;

    public Gato(String nombre, int edad, String color) {
        super(nombre, edad);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String getTipo() {
        return "Gato";
    }

    @Override
    public String getDescripcion() {
        return "Gato de color " + color;
    }
}
