package poo.herencia;

import poo.clases.SmartDevice;

public class Smartwhatch extends SmartDevice {
    public boolean pulsera;

    public Smartwhatch(String marca, String modelo, int anio, double proporciones, int bateria, boolean pulsera) {
        super(marca, modelo, anio, proporciones, bateria);
        this.pulsera = pulsera;
    }
}
