import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese información del producto alimenticio:");
        System.out.print("Nombre: ");
        String nombreAlimenticio = scanner.nextLine();
        System.out.print("Precio: ");
        double precioAlimenticio = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Fecha de caducidad: ");
        String fechaCaducidad = scanner.nextLine();


        ProductoAlimenticio productoAlimenticio = new ProductoAlimenticio(nombreAlimenticio, precioAlimenticio, fechaCaducidad);


        System.out.println("\nIngrese información del producto electrónico:");
        System.out.print("Nombre: ");
        String nombreElectronico = scanner.nextLine();
        System.out.print("Precio: ");
        double precioElectronico = scanner.nextDouble();
        scanner.nextLine(); // Consumir la nueva línea pendiente
        System.out.print("Marca: ");
        String marca = scanner.nextLine();


        ProductoElectronico productoElectronico = new ProductoElectronico(nombreElectronico, precioElectronico, marca);


        System.out.println("\nIngrese información del producto de ropa:");
        System.out.print("Nombre: ");
        String nombreRopa = scanner.nextLine();
        System.out.print("Precio: ");
        double precioRopa = scanner.nextDouble();
        scanner.nextLine(); // Consumir la nueva línea pendiente
        System.out.print("Talla: ");
        String talla = scanner.nextLine();


        ProductoRopa productoRopa = new ProductoRopa(nombreRopa, precioRopa, talla);


        scanner.close();


        System.out.println("\nInformación del producto alimenticio:");
        productoAlimenticio.mostrarInformacion();

        System.out.println("\nInformación del producto electrónico:");
        productoElectronico.mostrarInformacion();

        System.out.println("\nInformación del producto de ropa:");
        productoRopa.mostrarInformacion();
    }
}
