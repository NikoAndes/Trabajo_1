package tienda;

public class Perro extends Mascota {
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    @Override
    public String getTipo() {
        return "Perro";
    }

    @Override
    public String getDescripcion() {
        return "Perro de raza " + raza;
    }
}
