package vehiculos;

public class Camion extends Vehiculo {
    public Camion(String marca, String modelo, double velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
    }

    @Override
    public String getTipo() {
        return "Camión";
    }
}
