package co.edu.uniquindio.preparcial2.ejercicio45;

public class Circulo extends FiguraGeometrica implements IFigura {
    private double radio;
    public Circulo() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circulo(String color) {
        super(color);
    }

    @Override
    public void calcularArea() {
        System.out.println(Math.PI * Math.pow(radio, 2));
    }
}
