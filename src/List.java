import java.util.ArrayList;
import java.util.LinkedList;

public class List {
    public static void main(String[] args) {
//      ArrayList: Nos permite almacenar y consultar datos mas rapido.
        ArrayList<String> frutas = new ArrayList<String>();
        frutas.add("Pera");
        frutas.add("Manzana");
        frutas.add("Fresa");
        frutas.add("Frambuesa");
        frutas.add("Papaya");

/*      LinkedList: Mucho mas rapido cuando queremos modificar datos; deriva de la clase List hereda los metodos
        implenta dos interfaces interfaceList y deke
        podemos inplentar colas(ingresamos datos por in sitio y los sacamos por otro.

        Clases de colas: lifo (lo ultimo que entra es lo primero que sale, fifo (primero que entra es la primero que sale)

        * se puede pasar la informacion de un ArrayList a una LinkedList y viseversa ingresando el nombre asignado en los parentesis.
 */
        LinkedList<String> listaEnlazada = new LinkedList<String>(frutas);

        System.out.println("datos del ArrayList "+ frutas);

    }
}
