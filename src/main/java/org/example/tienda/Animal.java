package org.example.tienda;

/**
 * Clase abstracta que representa un animal genérico en la tienda de mascotas.
 * Define atributos comunes y métodos que deben ser implementados por las subclases.
 */
public abstract class Animal {
    public String nombre;
    protected int edad;

    /**
     * Constructor para inicializar los atributos comunes de un animal.
     * @param nombre Nombre del animal.
     * @param edad Edad del animal.
     */
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Metodo abstracto que debe retornar el sonido característico del animal.
     * @return Sonido como cadena de texto.
     */
    public abstract String sonido();

    /**
     * Metodo abstracto que representa la acción de comer del animal.
     */
    public abstract void comer();
}
