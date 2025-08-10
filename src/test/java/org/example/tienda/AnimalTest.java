package org.example.tienda;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas para verificar el comportamiento de las subclases de Animal.
 * Se valida que cada animal retorne el sonido correcto y que el metodo comer()
 * se ejecute sin lanzar excepciones.
 */
public class AnimalTest {

    /**
     * Verifica que el metodo sonido() de la clase Perro retorne "Ladrido".
     */
    @Test
    void testSonidoPerro() {
        Animal perro = new Perro("Firulais", 3);
        assertEquals("Ladrido", perro.sonido(), "El sonido del perro debe ser 'Ladrido'");
    }

    /**
     * Verifica que el metodo sonido() de la clase Gato retorne "Maullido".
     */
    @Test
    void testSonidoGato() {
        Animal gato = new Gato("Michi", 2);
        assertEquals("Maullido", gato.sonido(), "El sonido del gato debe ser 'Maullido'");
    }

    /**
     * Verifica que el metodo sonido() de la clase Pajaro retorne "Canto".
     */
    @Test
    void testSonidoPajaro() {
        Animal pajaro = new Pajaro("Piolín", 1);
        assertEquals("Canto", pajaro.sonido(), "El sonido del pájaro debe ser 'Canto'");
    }

    /**
     * Verifica que el metodo comer() de la clase Perro se ejecute sin lanzar excepciones.
     * Aunque no retorna nada, se asegura que el metodo funcione correctamente.
     */
    @Test
    void testComerNoLanzaExcepcion() {
        Animal perro = new Perro("Firulais", 3);
        assertDoesNotThrow(perro::comer, "El método comer() no debe lanzar excepciones");
    }
}
