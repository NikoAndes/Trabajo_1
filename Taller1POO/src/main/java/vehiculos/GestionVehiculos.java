package vehiculos;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionVehiculos {
    public static void main(String[] args) {
        ArrayList<Vehiculo> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENÚ VEHÍCULOS ===");
            System.out.println("1. Agregar carro");
            System.out.println("2. Agregar moto");
            System.out.println("3. Agregar camión");
            System.out.println("4. Mostrar todos los vehículos");
            System.out.println("5. Calcular velocidad máxima promedio");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                case 2:
                case 3:
                    System.out.print("Marca: ");
                    String marca = sc.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();
                    System.out.print("Velocidad máxima (km/h): ");
                    double velocidad = sc.nextDouble();
                    sc.nextLine(); // limpiar

                    Vehiculo v = null;
                    if (opcion == 1) {
                        v = new Carro(marca, modelo, velocidad);
                    } else if (opcion == 2) {
                        v = new Moto(marca, modelo, velocidad);
                    } else if (opcion == 3) {
                        v = new Camion(marca, modelo, velocidad);
                    }
                    lista.add(v);
                    System.out.println("Vehículo agregado.");
                    break;

                case 4:
                    System.out.println("\n--- Lista de Vehículos ---");
                    for (Vehiculo vehiculo : lista) {
                        System.out.println(vehiculo.getTipo() + " - " + vehiculo.getMarca() + " " + vehiculo.getModelo()
                                + " | Velocidad Máx: " + vehiculo.getVelocidadMaxima() + " km/h");
                    }
                    break;

                case 5:
                    if (lista.isEmpty()) {
                        System.out.println("No hay vehículos registrados.");
                    } else {
                        double suma = 0;
                        for (Vehiculo vehiculo : lista) {
                            suma += vehiculo.getVelocidadMaxima();
                        }
                        double promedio = suma / lista.size();
                        System.out.println("Velocidad máxima promedio: " + promedio + " km/h");
                    }
                    break;

                case 0:
                     System.out.println("Saliendo...");
                     break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }

        } while (opcion != 0);
    }
}
