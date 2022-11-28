package Entidades;

public class Vehiculo {
    public String marca;
    public String color;
    public String velocidad;
    public void movimiento(){
        System.out.println("En movimiento");

    }
    public void funcionamiento(){
        System.out.println("En funcionamiento");
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", velocidad='" + velocidad + '\'' +
                '}';
    }
}
