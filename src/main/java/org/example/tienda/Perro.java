package org.example.tienda;

/**
 * Clase que representa un perro, subclase de Animal.
 * Implementa los métodos sonido() y comer() con comportamiento específico.
 */
public class Perro extends Animal {

    /**
     * Constructor que inicializa un perro con nombre y edad.
     * @param nombre Nombre del perro.
     * @param edad Edad del perro.
     */
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    /**
     * Retorna el sonido característico del perro.
     * @return "Ladrido"
     */
    @Override
    public String sonido() {
        return "Ladrido";
    }

    /**
     * Muestra en consola cómo come el perro.
     */
    @Override
    public void comer() {
        System.out.println(nombre + " está comiendo croquetas.");
    }
}
