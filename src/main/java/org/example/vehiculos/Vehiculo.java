package org.example.vehiculos;

/**
 * Clase abstracta que representa un vehículo genérico.
 * Define atributos comunes y métodos que deben ser implementados por las subclases.
 */
public abstract class Vehiculo {
    protected String marca;
    protected String modelo;

    /**
     * Constructor para inicializar los atributos comunes de un vehículo.
     * @param marca Marca del vehículo.
     * @param modelo Modelo del vehículo.
     */
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * Método abstracto que representa la acción de arrancar el vehículo.
     */
    public abstract void arrancar();
}
