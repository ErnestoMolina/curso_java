import poo.clases.Vehiculo;
import poo.clases.Motor;
import poo.herencia.*;

public class Main {
    public static void main(String[] args) {
//        crear un objeto: clase indicador = new clase();

//        crear unn objeto utilizando el constructor vacio
        Motor Esparco = new Motor("EsparcoGT",150,506.0,7);

//      el encapsulamiento puede ser privatizar un atributo de una clase para que esta solamente
//      pueda ser utilizada dentro de esa clase; tambien podemos asignar un objeto a otro objeto.

        Vehiculo mazda = new Vehiculo();

//        crear unn objeto utilizando el constructor con todos los parametros
        Vehiculo toyota = new Vehiculo("Mazda", "T800", 2024, 1.5,40,Esparco);

        System.out.println(toyota.acelerar(50));

//        2. Herencia
        Motocicleta kawaskiNinja = new Motocicleta();
        kawaskiNinja.fabricante = "Kawaski";
        kawaskiNinja.modelo = "Honda";

        System.out.println("Fin programa");

//        3. Polimorfismo
        Vehiculo vehiculo;
        vehiculo = new Motocicleta("Auteco","Pulsar",2014, 1.5,120, Esparco,false);
        vehiculo.acelerar(50);
        vehiculo = new Camion();
        vehiculo.acelerar(50);
        vehiculo = new Coche();
        vehiculo.acelerar(50);
/*      4. clases abstractas son aquellas que no se permiten instanciar, solamente se pueden instanciar las clases hijas
        esto lo podemos hacer agregandole a la clase la palabra abstract despues de public o identificador de acceso.*/

//        ejercicio crear clase base y clases derivadas
        Smartphone phone14 = new Smartphone("Phone","Phone 14 Pro",2022,6.9,4000,true);
        Smartwhatch flexpool = new Smartwhatch("Flexpool","Flexpool 3000",2024,3.2,800,true);
        System.out.println(phone14.marca);
        System.out.println(phone14.modelo);
        System.out.println(phone14.anio);
        System.out.println(phone14.proporciones);
        System.out.println(phone14.bateria);
        System.out.println(phone14.camara);
        System.out.println(flexpool.marca);
        System.out.println(flexpool.modelo);
        System.out.println(flexpool.anio);
        System.out.println(flexpool.proporciones);
        System.out.println(flexpool.bateria);
        System.out.println(flexpool.pulsera);
    }
}