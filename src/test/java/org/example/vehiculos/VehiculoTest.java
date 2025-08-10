package org.example.vehiculos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas para verificar el comportamiento de las subclases de Vehiculo.
 * Se valida que los métodos arrancar(), tipoCombustible() y tipoBicicleta() funcionen correctamente.
 */
public class VehiculoTest {

    /**
     * Verifica que el metodo tipoCombustible() de la clase Coche retorne el tipo correcto.
     */
    @Test
    void testTipoCombustibleCoche() {
        Coche coche = new Coche("Toyota", "Corolla", "Gasolina");
        assertEquals("Gasolina", coche.tipoCombustible(), "El tipo de combustible debe ser 'Gasolina'");
    }

    /**
     * Verifica que el metodo tipoBicicleta() de la clase Bicicleta retorne el tipo correcto.
     */
    @Test
    void testTipoBicicleta() {
        Bicicleta bici = new Bicicleta("GW", "X-Trail", "Montaña");
        assertEquals("Montaña", bici.tipoBicicleta(), "El tipo de bicicleta debe ser 'Montaña'");
    }

    /**
     * Verifica que el metodo arrancar() de la clase Coche se ejecute sin lanzar excepciones.
     */
    @Test
    void testArrancarCocheNoLanzaExcepcion() {
        Vehiculo coche = new Coche("Mazda", "3", "Diesel");
        assertDoesNotThrow(coche::arrancar, "El método arrancar() no debe lanzar excepciones en Coche");
    }

    /**
     * Verifica que el metodo arrancar() de la clase Bicicleta se ejecute sin lanzar excepciones.
     */
    @Test
    void testArrancarBicicletaNoLanzaExcepcion() {
        Vehiculo bici = new Bicicleta("Trek", "FX", "Ruta");
        assertDoesNotThrow(bici::arrancar, "El método arrancar() no debe lanzar excepciones en Bicicleta");
    }
}
