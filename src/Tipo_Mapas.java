import java.util.HashMap;
import java.util.Map;

public class Tipo_Mapas {
    public static void main(String[] args) {
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("Manzana",500);
        mapa.put("Pera",800);
        mapa.put("Durazno",500);
        mapa.replace("Manzana", 700);
        System.out.println(mapa.get("Manzana"));


        for (Map.Entry elemento : mapa.entrySet()){
            System.out.println("Elemento clave: " + elemento.getKey());
            System.out.println("Elemento valor: " + elemento.getValue());
        }
    }
}
