package Escenario1;

import java.util.*;

public class RegistroPacientes {

    private Queue<Paciente> colaPacientes;
    private Map<String, Paciente> mapaPacientes;

    public RegistroPacientes() {
        colaPacientes = new LinkedList<>();
        mapaPacientes = new HashMap<>();
    }

    public boolean registrarPaciente(Paciente p) {

        if(mapaPacientes.containsKey(p.getDocumento())){
            System.out.println("Paciente duplicado");
            return false;
        }

        colaPacientes.add(p);
        mapaPacientes.put(p.getDocumento(), p);

        return true;
    }

    
    public Paciente buscarPaciente(String documento){
        return mapaPacientes.get(documento);
    }

    
    public Paciente atenderPaciente(){

        Paciente p = colaPacientes.poll();

        if(p != null){
            mapaPacientes.remove(p.getDocumento());
        }

        return p;
    }

   
    public int totalPacientes(){
        return colaPacientes.size();
    }
}

