package co.edu.uniquindio.preparcial2.model;

import java.util.ArrayList;

public class FincaUQ {
    private String nombre;
    private ArrayList<Tarea> listaTareas=new ArrayList<>();
    private ArrayList<Empleado> listaEmpleados=new ArrayList<>();

    public FincaUQ(){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Tarea> getListaTareas() {
        return listaTareas;
    }

    public void setListaTareas(ArrayList<Tarea> listaTareas) {
        this.listaTareas = listaTareas;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public boolean crearEmpleado(String nombre,
                                 String apellido,
                                 String cedula,
                                 int edad,
                                 double salario,
                                 int numeroHorasTrabajo) {

        Empleado empleadoEncontrado = obtenerEmpleado(cedula);
        if(empleadoEncontrado == null) {
            Empleado empleado = new Empleado();
            empleado.setNombre(nombre);
            empleado.setApellido(apellido);
            empleado.setCedula(cedula);
            empleado.setEdad(edad);
            empleado.setSalario(salario);
            empleado.setNumeroHorasTrabajo(numeroHorasTrabajo);
            getListaEmpleados().add(empleado);

            return true;
        }else{
            return false;
        }
    }

    public boolean eliminarEmpleado(String idEliminar) {
        Empleado empleadoEncontrado=obtenerEmpleado(idEliminar);
        if(empleadoEncontrado!=null) {
            getListaEmpleados().remove(empleadoEncontrado);
            return true;
        } else {
            return false;
        }
    }
    public boolean actualizarEmpleado(String nombre,
                                      String apellido,
                                      String cedula,
                                      int edad,
                                      double salario,
                                      int numeroHorasTrabajo) {
        Empleado empleadoEncontrado = obtenerEmpleado(cedula);
        if(empleadoEncontrado.getCedula().equalsIgnoreCase(cedula)) {
            empleadoEncontrado.setNombre(nombre);
            empleadoEncontrado.setApellido(apellido);
            empleadoEncontrado.setCedula(cedula);
            empleadoEncontrado.setEdad(edad);
            empleadoEncontrado.setSalario(salario);
            empleadoEncontrado.setNumeroHorasTrabajo(numeroHorasTrabajo);

            return true;
        }else{
            return false;
        }
    }

    public Empleado obtenerEmpleado(String idBuscar) {
        Empleado empleadoEncontrado =  null;
        for (Empleado empleado : getListaEmpleados()) {
            if(empleado.getCedula().equalsIgnoreCase(idBuscar)) {
                empleadoEncontrado = empleado;
                break;
            }
        }

        return empleadoEncontrado;
    }
}
