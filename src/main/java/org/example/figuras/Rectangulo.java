package org.example.figuras;

/**
 * Clase que representa un rectángulo.
 * Implementa el cálculo de área usando la fórmula base * altura.
 */
public class Rectangulo extends Figura {
    private double base;
    private double altura;

    /**
     * Constructor que inicializa la base y altura del rectángulo.
     * @param base Base del rectángulo.
     * @param altura Altura del rectángulo.
     */
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     * Calcula el área del rectángulo.
     * @return Área como double.
     */
    @Override
    public double calcularArea() {
        return base * altura;
    }
}
