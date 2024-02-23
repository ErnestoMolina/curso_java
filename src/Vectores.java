import java.util.Vector;

public class Vectores {
    public static void main(String[] args){
        Vector<String> libros = new Vector<String>(1,2);
//        agregar contenido a un vector
        libros.add("Cien años de soledad");
        libros.add("Metamorfosis");
        libros.add("El mundo de sofia");
        libros.add("Breves respuestas a grandes preguntas");
        System.out.println("Datos del Vector "+ libros);
//        Remover contenido de un Vector
        libros.remove(2);
        System.out.println("Datos del Vector"+libros);
        System.out.println("Vector libros tamaño " + libros.size() + " Vector libros capacidad " + libros.capacity());
//      Reduce la capacidad del vector a la cantidad de datos que contiene el vector.
        libros.trimToSize();
        System.out.println("Vector libros tamaño " + libros.size() + " Vector libros capacidad " + libros.capacity());
        Vector<String> books = new Vector<String>(1,2);
        books.add("Cien años de soledad");
        books.add("Metamorfosis");
        books.add("El mundo de sofia");
        books.add("Breves respuestas a grandes preguntas");
//        comparar vectores
        boolean resultado = libros.equals(books);
        System.out.println("Los vectores son iguales? "+ resultado);
        for(String libro : libros){
            System.out.println(libro);
        }
        for(String book : books){
            System.out.println(book);
        }
        for (int i = 0; i <= libros.size() - 1; i++){
            System.out.println(libros.get(i) + " Posicion: " + i);
        }

    }
}
