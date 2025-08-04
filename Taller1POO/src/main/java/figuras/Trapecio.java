package figuras;

/**
 * Clase que representa un trapecio y calcula su área.
 */
public class Trapecio extends FiguraGeometrica {
    private double baseMayor;
    private double baseMenor;
    private double altura;

    public Trapecio(double baseMayor, double baseMenor, double altura) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return ((baseMayor + baseMenor) * altura) / 2;
    }

    @Override
    public String toString() {
        return String.format("Trapecio (Base Mayor: %.2f, Base Menor: %.2f, Altura: %.2f)", baseMayor, baseMenor, altura);
    }
}
