import Entidades.Animal;
import Entidades.Persona;

public class Main {
    public static void main(String[] args) {
      /*  Animal perro =new Animal();
        perro.raza ="criollo";
        perro.color="gris";
        perro.nombre="Milu";
        System.out.println(perro);
        perro.mover();
        perro.comer();
        perro.dormir();
    }
}*/


        Persona persona1 = new Persona();
        persona1.nombre = "Bibiana";
        persona1.edad = "43";
        persona1.apellido = "Latorre";
        System.out.println(persona1);
        persona1.caminar();
        persona1.cumple();

    }



    }