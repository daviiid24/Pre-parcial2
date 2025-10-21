package co.edu.uniquindio.preparcial2.ejercicio45;

import java.util.ArrayList;

public class Main5 {
    public static void main(String[] args) {
    ArrayList<IFigura> figuras = new ArrayList<>();
    Circulo circulo=new Circulo();
    circulo.setRadio(5);
    Cuadrado cuadrado=new Cuadrado();
    cuadrado.setLado(5);
    figuras.add(circulo);
    figuras.add(cuadrado);
    for(IFigura figura : figuras){
        figura.calcularArea();
    }
    }
}
