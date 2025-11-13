package Escenario1;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ComponenteIndividual {
    private List<Agregado> agregado = new ArrayList<>();
    private String tipo;
    private BigDecimal precio;
     private BigDecimal agregadoPrecio;

    public ComponenteIndividual(String tipoRecibido, BigDecimal precioRecibido){
        this.tipo = tipoRecibido;
        this.precio = precioRecibido;
    }

    public void SumarAgregado(Agregado sumado){
        this.agregado.add(sumado);
        this.agregadoPrecio = sumado.getPrecio();
    }

    public BigDecimal getPrecio() {
        return precio;
    }
    public BigDecimal getPrecioAgregado(){
        return agregadoPrecio;
    }
    public String getTipo(){
        return tipo;
    }
}
