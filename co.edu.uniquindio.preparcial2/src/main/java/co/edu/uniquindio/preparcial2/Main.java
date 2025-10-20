package co.edu.uniquindio.preparcial2;

import co.edu.uniquindio.preparcial2.model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FincaUQ fincaUQ=inicializarDatos();
        crearEmpleado(fincaUQ);
        eliminarEmpleado(fincaUQ);
        actualizarEmpleado(fincaUQ);
        obtenerEmpleado(fincaUQ);
        }

    private static FincaUQ inicializarDatos() {
        FincaUQ fincaUQ = new FincaUQ();
        return fincaUQ;
    }

    public static void crearEmpleado(FincaUQ fincaUQ) {
        String nombre=leerStringConsola("Ingrese el nombre del empleado: ");
        String apellido=leerStringConsola("Ingrese el apellido del empleado: ");
        String cedula=leerStringConsola("Ingrese la cedula del empleado: ");
        int edad=leerEntero("Ingrese la edad del empleado: ");
        double salario=leerDoubleConsola("Ingrese el salario del empleado: ");
        int numeroHorasTrabajo=leerEntero("Ingrese el numero de horas trabajo del empleado: ");

        boolean resultado = fincaUQ.crearEmpleado(nombre, apellido, cedula, edad, salario, numeroHorasTrabajo);

        if (resultado) {
            System.out.println("Empleado creado con exito");
        } else {
            System.out.println("Empleado no creado");
        }
    }

    private static void eliminarEmpleado(FincaUQ fincaUQ) {
        String idEliminar =leerStringConsola("Ingrese el id del empleado a eliminar: ");
        boolean resultado = fincaUQ.eliminarEmpleado(idEliminar);
        if (resultado) {
            System.out.println("Empleado eliminado con exito");
        } else {
            System.out.println("Empleado no eliminado");
        }
    }

    private static void actualizarEmpleado(FincaUQ fincaUQ) {
        String nombre=leerStringConsola("Ingrese el nombre del empleado: ");
        String apellido=leerStringConsola("Ingrese el apellido del empleado: ");
        String cedula=leerStringConsola("Ingrese la cedula del empleado: ");
        int edad=leerEntero("Ingrese la edad del empleado: ");
        double salario=leerDoubleConsola("Ingrese el salario del empleado: ");
        int numeroHorasTrabajo=leerEntero("Ingrese el numero de horas trabajo del empleado: ");

        boolean resultado = fincaUQ.actualizarEmpleado(nombre, apellido, cedula, edad, salario, numeroHorasTrabajo);


        if (resultado) {
            System.out.println("Empleado actualizado con exito");
        } else {
            System.out.println("Empleado no actualizado");
        }
    }

    public static void obtenerEmpleado(FincaUQ fincaUQ) {
        String idBuscar = leerStringConsola("Ingrese el id del empleado a buscar:");
        Empleado resultado = fincaUQ.obtenerEmpleado(idBuscar);
        if (resultado != null) {
            System.out.println("Empleado encontrado con exito");
        } else {
            System.out.println("Empleado no encontrado");
        }
    }

    private static int leerEntero(String mensaje) {
        int dato = 0;
        String captura = "";
        System.out.println(mensaje);
        Scanner teclado = new Scanner(System.in);
        captura = teclado.nextLine();
        dato = Integer.parseInt(captura);
        return dato;
    }

    public static String leerStringConsola(String mensaje) {
        String captura = "";
        System.out.println(mensaje);
        Scanner teclado = new Scanner(System.in);
        captura = teclado.nextLine();
        return captura;
    }

    public static double leerDoubleConsola(String mensaje) {
        double dato = 0;
        String captura = "";
        System.out.println(mensaje);
        Scanner teclado = new Scanner(System.in);
        captura = teclado.nextLine();
        dato = Double.parseDouble(captura);
        return dato;
    }


    }