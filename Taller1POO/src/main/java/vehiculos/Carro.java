package vehiculos;

public class Carro extends Vehiculo {
    public Carro(String marca, String modelo, double velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
    }

    @Override
    public String getTipo() {
        return "Carro";
    }
}
