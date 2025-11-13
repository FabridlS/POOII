package Escenario1;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // Crear componentes individuales y compuestos
        ComponenteIndividual placaMadre = new ComponenteIndividual("Placa Asus xx", BigDecimal.valueOf(200));
        ComponenteCompuesto pcGamer = new ComponenteCompuesto("PC Gamer", BigDecimal.valueOf(1000));
        pcGamer.AgregarIndividual(placaMadre);

        // Agregar agregados
        Agregado rgb = new Agregado("RGB", BigDecimal.valueOf(50));
        placaMadre.SumarAgregado(rgb);
        pcGamer.SumarAgregado(new Agregado("Water Cooling", BigDecimal.valueOf(150)));

        // Crear carrito de compras y agregar componentes
        CarritoCompras carrito = new CarritoCompras();
        carrito.AgregarComponenteCompuesto(pcGamer);

        System.out.println("Precio total del carrito: " + carrito.PrecioTotal());
    }

}
