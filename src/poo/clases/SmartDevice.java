package poo.clases;

public abstract class SmartDevice {
    public String marca;
    public String modelo;
    public int anio;
    public double proporciones;
    public int bateria;

    public SmartDevice(){
    }

    public SmartDevice(String marca, String modelo, int anio, double proporciones, int bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.proporciones = proporciones;
        this.bateria = bateria;
    }
}
