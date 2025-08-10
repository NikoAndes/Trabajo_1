package org.example.vehiculos;

/**
 * Clase que representa una bicicleta, subclase de Vehiculo.
 * Implementa el método arrancar() y define el tipo de bicicleta.
 */
public class Bicicleta extends Vehiculo {
    private String tipoBicicleta;

    /**
     * Constructor que inicializa una bicicleta con marca, modelo y tipo.
     * @param marca Marca de la bicicleta.
     * @param modelo Modelo de la bicicleta.
     * @param tipoBicicleta Tipo de bicicleta (ej. Montaña, Ruta).
     */
    public Bicicleta(String marca, String modelo, String tipoBicicleta) {
        super(marca, modelo);
        this.tipoBicicleta = tipoBicicleta;
    }

    /**
     * Muestra en consola que la bicicleta está lista para usarse.
     */
    @Override
    public void arrancar() {
        System.out.println("La bicicleta " + marca + " " + modelo + " está lista para pedalear.");
    }

    /**
     * Retorna el tipo de bicicleta.
     * @return Tipo de bicicleta.
     */
    public String tipoBicicleta() {
        return tipoBicicleta;
    }
}
