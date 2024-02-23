package poo.clases;

/**
 * Clase base, superclase o clase principal
 */
public class Vehiculo {

//    1. atributos
    public String fabricante;
    public String modelo;
    public int year;
    public double cc;
    public int speed;
    public Motor motor;
//    2. constructores

    public Vehiculo() {

    }

    public Vehiculo(String fabricante, String modelo, int year, double cc, int speed, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.year = year;
        this.cc = cc;
        this.speed = speed;
        this.motor = motor;
    }

    //    3. metodos(comportamientos)
    public int acelerar(int  quality){
        this.speed += quality;
        return speed;
    }
}
