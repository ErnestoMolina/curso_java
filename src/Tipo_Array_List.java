import java.util.ArrayList;

public class Tipo_Array_List {
    public static void main(String[] args) {
        ArrayList<String> productos = new ArrayList<String>();
        productos.add("Pasta");
        productos.add("Lentejas");

//        System.out.println(productos.size());
//        String array[] = new String[productos.size()];
//        for(int i = 0; i < productos.size(); i++){
//            array[i] = productos.get(i);
//        }
//        for (String producto : array) {
//            System.out.println(producto);
//        }

        for (Object arrayObject : productos.toArray()){
            System.out.println(arrayObject.toString());
        }
    }
}
