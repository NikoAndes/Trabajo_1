package org.example.tienda;

/**
 * Clase que representa un pájaro, subclase de Animal.
 * Implementa los métodos sonido() y comer() con comportamiento específico.
 */
public class Pajaro extends Animal {

    /**
     * Constructor que inicializa un pájaro con nombre y edad.
     * @param nombre Nombre del pájaro.
     * @param edad Edad del pájaro.
     */
    public Pajaro(String nombre, int edad) {
        super(nombre, edad);
    }

    /**
     * Retorna el sonido característico del pájaro.
     * @return "Canto"
     */
    @Override
    public String sonido() {
        return "Canto";
    }

    /**
     * Muestra en consola cómo come el pájaro.
     */
    @Override
    public void comer() {
        System.out.println(nombre + " está comiendo semillas.");
    }
}
