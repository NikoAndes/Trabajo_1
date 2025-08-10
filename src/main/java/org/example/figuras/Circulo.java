package org.example.figuras;

/**
 * Clase que representa un círculo.
 * Implementa el cálculo de área usando la fórmula π * radio^2.
 */
public class Circulo extends Figura {
    private double radio;

    /**
     * Constructor que inicializa el radio del círculo.
     * @param radio Radio del círculo.
     */
    public Circulo(double radio) {
        this.radio = radio;
    }

    /**
     * Calcula el área del círculo.
     * @return Área como double.
     */
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}
