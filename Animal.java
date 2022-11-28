package Entidades;

public class Animal {
    public String raza;
    public String color;
    public String nombre;

    public void mover(){
        System.out.println("Estoy moviéndome");
    }
    public void  dormir(){
        System.out.println("Estoy durmiendo");
    }
    public void comer(){
        System.out.println("Estoy comiendo");

    }

    @Override
    public String toString() {
        return "Animal{" +
                "raza='" + raza + '\'' +
                ", color='" + color + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
