import java.math.BigDecimal;

public class Tipo_BigDecimal {
    public static void main(String[] args) {
        BigDecimal n1 = new BigDecimal(0.1f);
        BigDecimal n2 = new BigDecimal(10f);
        BigDecimal resultado = new BigDecimal(0);
        resultado = n1.multiply(n2);
        System.out.println(resultado);
    }
}
