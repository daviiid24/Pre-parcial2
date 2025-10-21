package co.edu.uniquindio.preparcial2.ejercicio45;

public class Cuadrado extends FiguraGeometrica implements  IFigura {
    private double lado;
    public Cuadrado() {
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public Cuadrado(String color) {
        super(color);
    }

    @Override
    public void calcularArea() {
    System.out.println(lado * lado);
    }
}
