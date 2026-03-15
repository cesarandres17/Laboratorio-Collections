package Escenario2;

public class main {
    public static void main(String[] args) {

        GestionProductos gestion = new GestionProductos();

        gestion.cargarProductos();

        gestion.buscarPorCodigo("002");

        gestion.mostrarOrdenados();

        gestion.filtrarCategoria("Tecnología");
    }
}