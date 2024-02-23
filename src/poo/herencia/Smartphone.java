package poo.herencia;

import poo.clases.SmartDevice;

public class Smartphone extends SmartDevice {
    public boolean camara;

    public Smartphone(){
    }

    public Smartphone(String marca, String modelo, int anio, double proporciones, int bateria, boolean camara) {
        super(marca, modelo, anio, proporciones, bateria);
        this.camara = camara;
    }
}
