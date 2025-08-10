package org.example;

import org.example.tienda.*;
import org.example.vehiculos.*;
import org.example.figuras.*;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase principal que permite navegar entre los ejercicios del Taller 1
 * usando un menú interactivo en consola.
 */
public class Main {
    public static void main(String[] args) {
        mostrarBienvenida(); // Mostrar mensaje de bienvenida

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== MENÚ PRINCIPAL ===");
            System.out.println("1. Tienda de Mascotas");
            System.out.println("2. Vehículos");
            System.out.println("3. Figuras Geométricas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> ejecutarTiendaMascotas();
                case 2 -> ejecutarVehiculos();
                case 3 -> ejecutarFiguras(scanner);
                case 4 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("Opción inválida. Intente de nuevo.\n");
            }
        } while (opcion != 4);
    }

    /**
     * Muestra un mensaje de bienvenida con información del proyecto y autores.
     */
    private static void mostrarBienvenida() {
        System.out.println("==============================================");
        System.out.println("  ¡Bienvenido la actividad numero 1! ");
        System.out.println("  Clase de Programación 3 - 2025");
        System.out.println("  Creado por:");
        System.out.println("    Nicolas Isaza Sierra (7004625)");
        System.out.println("    Julián David Galindo Hernández (7004600)");
        System.out.println("    Saúl Alejandro Pérez Estupiñán (7004631)");
        System.out.println("==============================================\n");
    }

    /**
     * Ejecuta el ejercicio de la tienda de mascotas.
     * Muestra los animales y sus comportamientos.
     */
    public static void ejecutarTiendaMascotas() {
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Firulais", 3));
        animales.add(new Gato("Michi", 2));
        animales.add(new Pajaro("Piolín", 1));

        System.out.println("\n--- TIENDA DE MASCOTAS ---");
        for (Animal a : animales) {
            System.out.println(a.nombre + " hace: " + a.sonido());
            a.comer();
            System.out.println();
        }
    }

    /**
     * Ejecuta el ejercicio de vehículos.
     * Muestra cómo arrancan y sus tipos específicos.
     */
    public static void ejecutarVehiculos() {
        Vehiculo coche = new Coche("Toyota", "Corolla", "Gasolina");
        Vehiculo bici = new Bicicleta("GW", "X-Trail", "Montaña");

        System.out.println("\n--- VEHÍCULOS ---");
        coche.arrancar();
        System.out.println("Tipo de combustible: " + ((Coche) coche).tipoCombustible());

        bici.arrancar();
        System.out.println("Tipo de bicicleta: " + ((Bicicleta) bici).tipoBicicleta());
        System.out.println();
    }

    /**
     * Ejecuta el ejercicio de figuras geométricas.
     * Permite al usuario elegir una figura y calcular su área.
     * @param scanner Scanner para entrada de datos.
     */
    public static void ejecutarFiguras(Scanner scanner) {
        System.out.println("\n--- FIGURAS GEOMÉTRICAS ---");
        System.out.println("Seleccione una figura:");
        System.out.println("1. Círculo");
        System.out.println("2. Rectángulo");
        System.out.println("3. Triángulo");
        System.out.println("4. Trapecio");
        System.out.print("Opción: ");
        int figura = scanner.nextInt();

        Figura f = null;

        switch (figura) {
            case 1 -> {
                System.out.print("Ingrese el radio: ");
                double radio = scanner.nextDouble();
                f = new Circulo(radio);
            }
            case 2 -> {
                System.out.print("Ingrese la base: ");
                double base = scanner.nextDouble();
                System.out.print("Ingrese la altura: ");
                double altura = scanner.nextDouble();
                f = new Rectangulo(base, altura);
            }
            case 3 -> {
                System.out.print("Ingrese la base: ");
                double base = scanner.nextDouble();
                System.out.print("Ingrese la altura: ");
                double altura = scanner.nextDouble();
                f = new Triangulo(base, altura);
            }
            case 4 -> {
                System.out.print("Ingrese la base mayor: ");
                double baseMayor = scanner.nextDouble();
                System.out.print("Ingrese la base menor: ");
                double baseMenor = scanner.nextDouble();
                System.out.print("Ingrese la altura: ");
                double altura = scanner.nextDouble();
                f = new Trapecio(baseMayor, baseMenor, altura);
            }
            default -> System.out.println("Opción inválida.");
        }

        if (f != null) {
            System.out.printf("El área de la figura es: %.2f\n\n", f.calcularArea());
        }
    }
}
