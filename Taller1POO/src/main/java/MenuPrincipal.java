import tienda.TiendaMascotas;
import vehiculos.GestionVehiculos;
import figuras.GestionFiguras;

import java.util.Scanner;

public class MenuPrincipal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Tienda de Mascotas");
            System.out.println("2. Jerarquía de Vehículos");
            System.out.println("3. Figuras Geométricas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    TiendaMascotas tienda = new TiendaMascotas();
                    tienda.iniciar();
                    break;

                case 2:
                    GestionVehiculos.main(null); 
                    break;

                 case 3:
                    GestionFiguras.iniciar();
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}
