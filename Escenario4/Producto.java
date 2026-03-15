package Escenario4;

public class Producto implements Comparable<Producto> {

    String codigo;
    String nombre;
    double precio;

    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public int compareTo(Producto o) {
        return Double.compare(this.precio, o.precio);
    }

    @Override
    public String toString() {
        return codigo + " - " + nombre + " - $" + precio;
    }
}
