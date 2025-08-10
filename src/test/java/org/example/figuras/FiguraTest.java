package org.example.figuras;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas para verificar el cálculo de área en las distintas figuras geométricas.
 * Se valida que cada figura retorne el área correcta según su fórmula específica.
 */
public class FiguraTest {

    /**
     * Verifica que el área del círculo se calcule correctamente usando π * radio^2.
     */
    @Test
    void testAreaCirculo() {
        Circulo c = new Circulo(2); // radio = 2
        double esperado = Math.PI * 4; // π * 2^2
        assertEquals(esperado, c.calcularArea(), 0.0001, "El área del círculo debe ser π * radio^2");
    }

    /**
     * Verifica que el área del rectángulo se calcule correctamente usando base * altura.
     */
    @Test
    void testAreaRectangulo() {
        Rectangulo r = new Rectangulo(5, 3); // base = 5, altura = 3
        assertEquals(15, r.calcularArea(), "El área del rectángulo debe ser base * altura");
    }

    /**
     * Verifica que el área del triángulo se calcule correctamente usando (base * altura) / 2.
     */
    @Test
    void testAreaTriangulo() {
        Triangulo t = new Triangulo(6, 4); // base = 6, altura = 4
        assertEquals(12, t.calcularArea(), "El área del triángulo debe ser (base * altura) / 2");
    }

    /**
     * Verifica que el área del trapecio se calcule correctamente usando ((baseMayor + baseMenor) * altura) / 2.
     */
    @Test
    void testAreaTrapecio() {
        Trapecio tr = new Trapecio(8, 4, 5); // baseMayor = 8, baseMenor = 4, altura = 5
        assertEquals(30, tr.calcularArea(), "El área del trapecio debe ser ((baseMayor + baseMenor) * altura) / 2");
    }
}
