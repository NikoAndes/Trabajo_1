package org.example.figuras;

/**
 * Clase que representa un triángulo.
 * Implementa el cálculo de área usando la fórmula (base * altura) / 2.
 */
public class Triangulo extends Figura {
    private double base;
    private double altura;

    /**
     * Constructor que inicializa la base y altura del triángulo.
     * @param base Base del triángulo.
     * @param altura Altura del triángulo.
     */
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     * Calcula el área del triángulo.
     * @return Área como double.
     */
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}
