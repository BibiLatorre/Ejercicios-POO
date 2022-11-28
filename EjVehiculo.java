import Entidades.Vehiculo;

public class EjVehiculo {
    public static void main(String[] args) {
        Vehiculo automovil=new Vehiculo();
        automovil.color="azul";
        automovil.marca="VW";
        automovil.velocidad="180K/h";
        System.out.println(automovil);
        automovil.movimiento();
        automovil.funcionamiento();
    }
}
