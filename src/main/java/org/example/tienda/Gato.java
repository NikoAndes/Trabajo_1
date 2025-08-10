package org.example.tienda;

/**
 * Clase que representa un gato, subclase de Animal.
 * Implementa los métodos sonido() y comer() con comportamiento específico.
 */
public class Gato extends Animal {

    /**
     * Constructor que inicializa un gato con nombre y edad.
     * @param nombre Nombre del gato.
     * @param edad Edad del gato.
     */
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    /**
     * Retorna el sonido característico del gato.
     * @return "Maullido"
     */
    @Override
    public String sonido() {
        return "Maullido";
    }

    /**
     * Muestra en consola cómo come el gato.
     */
    @Override
    public void comer() {
        System.out.println(nombre + " está comiendo atún.");
    }
}
