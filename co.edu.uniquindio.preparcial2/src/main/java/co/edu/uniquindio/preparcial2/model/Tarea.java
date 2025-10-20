package co.edu.uniquindio.preparcial2.model;

import java.time.LocalDate;

public class Tarea {
    private int numeroTarea;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double duracionTarea;
    private String descripcion;
    private Empleado empleadoAsociado;
    private FincaUQ ownedByFincaUQ;

    public Tarea() {
    }

    public int getNumeroTarea() {
        return numeroTarea;
    }

    public void setNumeroTarea(int numeroTarea) {
        this.numeroTarea = numeroTarea;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getDuracionTarea() {
        return duracionTarea;
    }

    public void setDuracionTarea(double duracionTarea) {
        this.duracionTarea = duracionTarea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public FincaUQ getOwnedByFincaUQ() {
        return ownedByFincaUQ;
    }

    public void setOwnedByFincaUQ(FincaUQ ownedByFincaUQ) {
        this.ownedByFincaUQ = ownedByFincaUQ;
    }

    public Empleado getEmpleadoAsociado() {
        return empleadoAsociado;
    }

    public void setEmpleadoAsociado(Empleado empleadoAsociado) {
        this.empleadoAsociado = empleadoAsociado;
    }
}
