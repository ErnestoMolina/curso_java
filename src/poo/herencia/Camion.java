package poo.herencia;

import poo.clases.Motor;
import poo.clases.Vehiculo;

public class Camion extends Vehiculo {
    private double capacidadCarga;

    public Camion() {
    }

    public Camion(String fabricante, String modelo, int year, double cc, int speed, Motor motor, double capacidadCarga) {
        super(fabricante, modelo, year, cc, speed, motor);
        this.capacidadCarga = capacidadCarga;
    }

    public int cantidadAlmacenado(int paquetes){
        this.capacidadCarga += paquetes;
        return paquetes;
    }
}
