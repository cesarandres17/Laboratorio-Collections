package Escenario2;

import java.util.*;

class GestionProductos {

    HashMap<String, Producto> mapa = new HashMap<>();
    TreeSet<Producto> ordenados = new TreeSet<>();
    LinkedList<Producto> lista = new LinkedList<>();

    public void cargarProductos() {

        Producto p1 = new Producto("001", "Laptop", 2500, "Tecnología");
        Producto p2 = new Producto("002", "Mouse", 80, "Tecnología");
        Producto p3 = new Producto("003", "Silla", 300, "Hogar");

        mapa.put(p1.codigo, p1);
        mapa.put(p2.codigo, p2);
        mapa.put(p3.codigo, p3);

        ordenados.add(p1);
        ordenados.add(p2);
        ordenados.add(p3);

        lista.addFirst(p1);
        lista.addFirst(p2);
        lista.addFirst(p3);
    }

    public void buscarPorCodigo(String codigo) {
        System.out.println("Buscar producto código " + codigo + ":");
        System.out.println(mapa.get(codigo));
    }

    public void mostrarOrdenados() {
        System.out.println("\nProductos ordenados por precio:");
        for (Producto p : ordenados) {
            System.out.println(p);
        }
    }

    public void filtrarCategoria(String categoria) {
        System.out.println("\nProductos categoría " + categoria + ":");
        for (Producto p : lista) {
            if (p.categoria.equals(categoria)) {
                System.out.println(p);
            }
        }
    }
}
