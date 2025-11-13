package Escenario1;
import java.math.BigDecimal;
import java.util.*;

public class CarritoCompras {
    private List<ComponenteCompuesto> componentesCompuestos = new ArrayList<>();
    private List<ComponenteIndividual> componentesIndividuales = new ArrayList<>();
    private BigDecimal precioTotal = BigDecimal.ZERO;
    
    public CarritoCompras(){
        // No es necesario inicializar los atributos. (Ya lo hacemos cuando los declaramos)
    }

    public CarritoCompras(ComponenteCompuesto nuevoCompuesto){
        this.componentesCompuestos.add(nuevoCompuesto);
        this.precioTotal = this.precioTotal.add(nuevoCompuesto.getPrecio()).add(nuevoCompuesto.getPrecioAgregado());
    }

    public CarritoCompras(ComponenteIndividual nuevoIndividual){
        this.componentesIndividuales.add(nuevoIndividual);
        this.precioTotal = this.precioTotal.add(nuevoIndividual.getPrecio()).add(nuevoIndividual.getPrecioAgregado());
    }

    public void AgregarComponenteCompuesto(ComponenteCompuesto nuevoCompuesto){
        this.componentesCompuestos.add(nuevoCompuesto);
        this.precioTotal = this.precioTotal.add(nuevoCompuesto.getPrecio()).add(nuevoCompuesto.getPrecioAgregado());
    }

    public void AgregarComponenteIndividual(ComponenteIndividual nuevoIndividual){
        this.componentesIndividuales.add(nuevoIndividual);
        this.precioTotal = this.precioTotal.add(nuevoIndividual.getPrecio()).add(nuevoIndividual.getPrecioAgregado());
    }

    public BigDecimal PrecioTotal(){
        return precioTotal;
    }

}