package poo.herencia;

import poo.clases.Motor;
import poo.clases.Vehiculo;

public class Motocicleta extends Vehiculo {
    boolean baul;
    public Motocicleta(){
    }
    public Motocicleta(String fabricante, String modelo, int year, double cc, int speed, Motor motor, boolean baul) {
        super(fabricante, modelo, year, cc, speed, motor);
        this.baul = baul;
    }
}
