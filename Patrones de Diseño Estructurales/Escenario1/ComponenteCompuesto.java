package Escenario1;
import java.util.*;
import java.math.BigDecimal;

public class ComponenteCompuesto {
    private List<Agregado> agregado = new ArrayList<>();
    private List<ComponenteIndividual> componenteIndividual = new ArrayList<>();
    private String tipo;
    private BigDecimal precio;
    private BigDecimal agregadoPrecio;

    public ComponenteCompuesto(String tipoRecibido, BigDecimal precioRecibido){
        this.tipo = tipoRecibido;
        this.precio = precioRecibido;
    }

    public void AgregarIndividual(ComponenteIndividual individual){
        this.componenteIndividual.add(individual);
        this.precio.add(individual.getPrecio());
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
