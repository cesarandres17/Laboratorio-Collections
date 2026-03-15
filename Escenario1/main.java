package Escenario1;

public class main {

    public static void main(String[] args) {

        RegistroPacientes sistema = new RegistroPacientes();

        int cantidad = 10000;

        long inicio = System.currentTimeMillis();

        for(int i = 0; i < cantidad; i++){
            Paciente p = new Paciente("" + i, "Paciente" + i, 30);
            sistema.registrarPaciente(p);
        }

        long fin = System.currentTimeMillis();

        System.out.println("Pacientes registrados: " + sistema.totalPacientes());
        System.out.println("Tiempo de ejecución: " + (fin - inicio) + " ms");

        // prueba de búsqueda
        Paciente encontrado = sistema.buscarPaciente("500");

        if(encontrado != null){
            System.out.println("Paciente encontrado: " + encontrado);
        }
    }
}