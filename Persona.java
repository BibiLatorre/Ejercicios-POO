package Entidades;

public class Persona {
    public String nombre;
    public String edad;
    public String apellido;

    public void caminar (){
        System.out.println("Estoy caminando");
    }
    public void cumple(){
        System.out.println("Hoy es mi cumpleaños");
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
