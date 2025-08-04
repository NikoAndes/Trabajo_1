package vehiculos;

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected double velocidadMaxima;

    public Vehiculo(String marca, String modelo, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public abstract String getTipo();
}
