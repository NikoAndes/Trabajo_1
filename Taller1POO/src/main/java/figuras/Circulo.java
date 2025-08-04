package figuras; 

public class Circulo extends Figura {
    private double radio; // Atributo para el radio del círculo

    public Circulo(double radio) {
        super("Círculo"); // Nombre de la figura
        this.radio = radio; // Inicializa el radio del círculo
    }

    @Override
    public double calcularArea() { // Fórmula del área de un círculo: π * r^2
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() { // Fórmula del perímetro de un círculo: 2 * π * r
        return 2 * Math.PI * radio; 
    }
}
