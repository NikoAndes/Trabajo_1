package org.example.figuras;

/**
 * Clase que representa un trapecio.
 * Implementa el cálculo de área usando la fórmula ((baseMayor + baseMenor) * altura) / 2.
 */
public class Trapecio extends Figura {
    private double baseMayor;
    private double baseMenor;
    private double altura;

    /**
     * Constructor que inicializa las bases y la altura del trapecio.
     * @param baseMayor Base mayor del trapecio.
     * @param baseMenor Base menor del trapecio.
     * @param altura Altura del trapecio.
     */
    public Trapecio(double baseMayor, double baseMenor, double altura) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    /**
     * Calcula el área del trapecio.
     * @return Área como double.
     */
    @Override
    public double calcularArea() {
        return ((baseMayor + baseMenor) * altura) / 2;
    }
}
