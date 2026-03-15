package Escenario3;

import java.util.Queue;
import java.util.LinkedList;


public class SistemaTaxis {

    public static void main(String[] args) {

        Queue<Solicitud> solicitudes = new LinkedList<>();

        int cantidadDatos = 100;

        long inicio = System.nanoTime();

        for (int i = 0; i < cantidadDatos; i++) {
            solicitudes.add(new Solicitud(i));
        }

        for (int i = 0; i < cantidadDatos; i++) {
            solicitudes.poll();
        }

        long fin = System.nanoTime();

        long tiempo = fin - inicio;

        System.out.println("Tiempo de ejecución: " + tiempo + " ns");

        Runtime runtime = Runtime.getRuntime();
        long memoriaUsada = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("Memoria usada: " + memoriaUsada + " bytes");

        System.out.println("Solicitudes pendientes: " + solicitudes.size());
    }
}
