package co.edu.uniquindio.preparcial2.ejercicio42;

public class EmpleadoFijo extends Empleado{
    private double salario;

    public EmpleadoFijo() {
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    @Override
    public double calcularSalario() {
    return salario;
    }
}
