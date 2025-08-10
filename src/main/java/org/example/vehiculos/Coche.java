package org.example.vehiculos;

/**
 * Clase que representa un coche, subclase de Vehiculo.
 * Implementa el método arrancar() y define el tipo de combustible.
 */
public class Coche extends Vehiculo {
    private String tipoCombustible;

    /**
     * Constructor que inicializa un coche con marca, modelo y tipo de combustible.
     * @param marca Marca del coche.
     * @param modelo Modelo del coche.
     * @param tipoCombustible Tipo de combustible (ej. Gasolina, Diesel).
     */
    public Coche(String marca, String modelo, String tipoCombustible) {
        super(marca, modelo);
        this.tipoCombustible = tipoCombustible;
    }

    /**
     * Muestra en consola que el coche ha arrancado.
     */
    @Override
    public void arrancar() {
        System.out.println("El coche " + marca + " " + modelo + " ha arrancado.");
    }

    /**
     * Retorna el tipo de combustible del coche.
     * @return Tipo de combustible.
     */
    public String tipoCombustible() {
        return tipoCombustible;
    }
}
