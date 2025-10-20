package co.edu.uniquindio.preparcial2.model;

import java.util.ArrayList;

public class Empleado {
private String nombre;
private String apellido;
private String cedula;
private int edad;
private double salario;
private int numeroHorasTrabajo;
    private ArrayList<Tarea> listaTareasAsociadas=new ArrayList<>();

    private FincaUQ ownedByFincaUQ;

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getNumeroHorasTrabajo() {
        return numeroHorasTrabajo;
    }

    public void setNumeroHorasTrabajo(int numeroHorasTrabajo) {
        this.numeroHorasTrabajo = numeroHorasTrabajo;
    }

    public FincaUQ getOwnedByFincaUQ() {
        return ownedByFincaUQ;
    }

    public void setOwnedByFincaUQ(FincaUQ ownedByFincaUQ) {
        this.ownedByFincaUQ = ownedByFincaUQ;
    }

    public ArrayList<Tarea> getListaTareasAsociadas() {
        return listaTareasAsociadas;
    }

    public void setListaTareasAsociadas(ArrayList<Tarea> listaTareasAsociadas) {
        this.listaTareasAsociadas = listaTareasAsociadas;
    }
}
