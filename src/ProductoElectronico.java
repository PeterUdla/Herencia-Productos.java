import java.util.Scanner;


class ProductoElectronico extends Producto {
    private String marca;

    public ProductoElectronico(String nombre, double precio, String marca) {
        super(nombre, precio);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Marca: " + marca);
    }
}
