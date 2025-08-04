package figuras;

import java.util.Scanner; 

public class GestionFiguras { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int opcion = -1; 

        do { 
            System.out.println("\n--- GESTIÓN DE FIGURAS ---"); 
            System.out.println("1. Crear Círculo");
            System.out.println("2. Crear Rectángulo");
            System.out.println("3. Crear Triángulo");
            System.out.println("4. Calcular área del trapecio");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            if (!sc.hasNextInt()) { 
                System.out.println("Entrada inválida."); 
                sc.next();
                continue;
            }

            opcion = sc.nextInt(); 

            Figura figura = null; 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el radio: ");  
                    double radio = sc.nextDouble();
                    figura = new Circulo(radio);
                    break;
                case 2:
                    System.out.print("Ingrese la base: ");
                    double base = sc.nextDouble();
                    System.out.print("Ingrese la altura: ");
                    double altura = sc.nextDouble();
                    figura = new Rectangulo(base, altura);
                    break;
                case 3:
                    System.out.print("Ingrese el lado 1: ");
                    double l1 = sc.nextDouble();
                    System.out.print("Ingrese el lado 2: ");
                    double l2 = sc.nextDouble();
                    System.out.print("Ingrese el lado 3: ");
                    double l3 = sc.nextDouble(); 
                    if (l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1) {
                        figura = new Triangulo(l1, l2, l3);
                    } else {
                        System.out.println("Los lados no forman un triángulo válido.");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese la base mayor del trapecio: ");
                    double baseMayor = sc.nextDouble();
                    System.out.print("Ingrese la base menor del trapecio: ");
                    double baseMenor = sc.nextDouble();
                    System.out.print("Ingrese la altura del trapecio: ");
                    double alturaTrapecio = sc.nextDouble();

                    FiguraGeometrica trapecio = new Trapecio(baseMayor, baseMenor, alturaTrapecio);
                    System.out.printf("%s - Área: %.2f\n", trapecio, trapecio.calcularArea());
                    break;



                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

            if (figura != null) {
                System.out.println("Figura: " + figura.getNombre());
                System.out.printf("Área: %.2f\n", figura.calcularArea());
                System.out.printf("Perímetro: %.2f\n", figura.calcularPerimetro());
            }

        } while (opcion != 0);
    }

    public static void iniciar() {
    main(null);
}

}
