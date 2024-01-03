import java.util.Scanner;


class ProductoRopa extends Producto {
    private String talla;

    public ProductoRopa(String nombre, double precio, String talla) {
        super(nombre, precio);
        this.talla = talla;
    }

    public String getTalla() {
        return talla;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Talla: " + talla);
    }
}
