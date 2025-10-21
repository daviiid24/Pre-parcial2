package co.edu.uniquindio.preparcial2.ejercicio45;

public abstract class FiguraGeometrica {
    private String color;
    public FiguraGeometrica() {}
    public  FiguraGeometrica(String color) {
        this.color = color;
    }
    public void mostrarColor() {
        System.out.println(color);
    }
}
