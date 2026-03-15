package Escenario4;

public class Main {

    public static void main(String[] args) {

        Ecommerce tienda = new Ecommerce();

        Producto p1 = new Producto("A1", "Celular", 1800);
        Producto p2 = new Producto("A2", "Audífonos", 250);
        Producto p3 = new Producto("A3", "Teclado", 150);

        tienda.agregarProducto(p1);
        tienda.agregarProducto(p2);
        tienda.agregarProducto(p3);

        System.out.println("Buscar producto código A2:");
        System.out.println(tienda.buscarProducto("A2"));

        System.out.println("\nProductos ordenados por precio:");
        tienda.mostrarOrdenados();
    }
}