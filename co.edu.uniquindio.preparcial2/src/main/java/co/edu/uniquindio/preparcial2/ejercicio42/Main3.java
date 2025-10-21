package co.edu.uniquindio.preparcial2.ejercicio42;

import co.edu.uniquindio.preparcial2.ejercicio42.*;

import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados=new ArrayList<>();
        EmpleadoFijo empleadoFijo=new EmpleadoFijo();
        empleadoFijo.setNombre("Fulano");
        empleadoFijo.setSalario(1000000);
        EmpleadoPorHoras empleadoPorHoras=new EmpleadoPorHoras();
        empleadoPorHoras.setNombre("Fulao");
        empleadoPorHoras.setHorasTrabajadas(5);
        empleadoPorHoras.setValorHora(10000);
        empleados.add(empleadoFijo);
        empleados.add(empleadoPorHoras);
        for(Empleado empleado:empleados){
            System.out.println("Empleado: " + empleado.getNombre());
            System.out.println("Salario: $" + empleado.calcularSalario());
        }
    }
}
