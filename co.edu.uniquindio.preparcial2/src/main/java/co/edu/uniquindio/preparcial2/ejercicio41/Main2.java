package co.edu.uniquindio.preparcial2.ejercicio41;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
       ArrayList<Animal> animales=new ArrayList<>();
       Perro perro=new Perro();
       Gato gato=new Gato();
       animales.add(perro);
       animales.add(gato);
       for(Animal animal:animales){
           animal.hacerSonido();
       }
    }
}
