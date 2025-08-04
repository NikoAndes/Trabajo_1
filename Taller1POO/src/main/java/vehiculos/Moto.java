package vehiculos;

public class Moto extends Vehiculo {
    public Moto(String marca, String modelo, double velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
    }

    @Override
    public String getTipo() {
        return "Moto";
    }
}
