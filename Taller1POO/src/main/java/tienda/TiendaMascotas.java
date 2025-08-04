package tienda;

import java.util.ArrayList;
import java.util.Scanner;

public class TiendaMascotas {
    private ArrayList<Mascota> mascotas;
    private Scanner scanner;

    public TiendaMascotas() {
        mascotas = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void iniciar() {
        int opcion;

        do {
            System.out.println("\n--- Menú Tienda de Mascotas ---");
            System.out.println("1. Agregar mascota");
            System.out.println("2. Listar mascotas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    agregarMascota();
                    break;
                case 2:
                    listarMascotas();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 3);
    }

    private void agregarMascota() {
        System.out.print("¿Qué tipo de mascota desea agregar? (1. Perro / 2. Gato): ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        if (tipo == 1) {
            System.out.print("Raza: ");
            String raza = scanner.nextLine();
            Perro perro = new Perro(nombre, edad, raza);
            mascotas.add(perro);
        } else if (tipo == 2) {
            System.out.print("Color: ");
            String color = scanner.nextLine();
            Gato gato = new Gato(nombre, edad, color);
            mascotas.add(gato);
        } else {
            System.out.println("Tipo inválido.");
        }
    }

    private void listarMascotas() {
        System.out.println("\n--- Lista de Mascotas ---");
        if (mascotas.isEmpty()) {
            System.out.println("No hay mascotas registradas.");
            return;
        }

        for (Mascota m : mascotas) {
            System.out.println(m.getTipo() + " - " + m.getNombre() + " - " + m.getEdad() + " años - " + m.getDescripcion());
        }
    }

    public static void main(String[] args) {
        TiendaMascotas tienda = new TiendaMascotas();
        tienda.iniciar();
    }
}
