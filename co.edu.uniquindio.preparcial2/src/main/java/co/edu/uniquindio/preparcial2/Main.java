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

    public static void crearTarea(FincaUQ fincaUQ) {
        String idEmpleado=leerStringConsola("Ingrese el id del empleado:");
        int numeroTarea=leerEntero("Ingrese el numero de la tarea: ");
        double duracionTarea=leerDoubleConsola("Ingrese la duracion de la tarea: ");
        String descripcion=leerStringConsola("Ingrese la descripcion de la tarea: ");

        boolean resultado = fincaUQ.crearTarea(numeroTarea, duracionTarea, descripcion);

        if (resultado) {
            System.out.println("Tarea creada con exito");
        } else {
            System.out.println("Tarea no creada");
        }
    }

    private static void eliminarTarea(FincaUQ fincaUQ) {
        int idEliminar =leerEntero("Ingrese el numero de la tarea a eliminar:");
        boolean resultado = fincaUQ.eliminarTarea(idEliminar);
        if (resultado) {
            System.out.println("Tarea eliminada con exito");
        } else {
            System.out.println("Tarea no eliminada");
        }
    }

    private static void actualizarTarea(FincaUQ fincaUQ) {
        String idEmpleado=leerStringConsola("Ingrese el id del empleado a actualizar:");
        int numeroTarea=leerEntero("Ingrese el numero de la tarea: ");
        double duracionTarea=leerDoubleConsola("Ingrese la duracion de la tarea: ");
        String descripcion=leerStringConsola("Ingrese la descripcion de la tarea: ");

        boolean resultado = fincaUQ.actualizarTarea(numeroTarea, duracionTarea, descripcion);


        if (resultado) {
            System.out.println("Tarea actualizada con exito");
        } else {
            System.out.println("Tarea no actualizada");
        }
    }

    public static void obtenerTarea(FincaUQ fincaUQ) {
        int idBuscar = leerEntero("Ingrese el numero de la tarea a buscar:");
        Tarea resultado = fincaUQ.obtenerTarea(idBuscar);
        if (resultado != null) {
            System.out.println("Tarea encontrada con exito");
        } else {
            System.out.println("Tarea no encontrada");
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