package poo.herencia;

import poo.clases.Motor;
import poo.clases.Vehiculo;

/**
 * Clase derivada, clase hijo o subclase.
 */
public class Coche extends Vehiculo {
    int numPuertas;

    public Coche() {
    }

    public Coche(String fabricante, String modelo, int year, double cc, int speed, Motor motor, int numPuertas) {
        super(fabricante, modelo, year, cc, speed, motor);
        this.numPuertas = numPuertas;
    }
}
