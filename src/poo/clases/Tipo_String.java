package poo.clases;

public class Tipo_String {
    public static void main(String[] args) {
        String cadena = "Mensaje DE TextO";
        String cadena2 = "";
        int num = 9;
        for (int i = cadena.length() - 1; i >= 0 ; i--){
            char letra = cadena.charAt(i);
            cadena2 += letra;
        }
        System.out.println(cadena2);

        if (num == 6){
            System.out.println("numero es igual a 6");
        }else {
            System.out.println("numero es diferente a 6");
        }
    }
}
