package Escenario1;
import java.util.*;

public class KitGabinete implements ComponentePC {
    private float precioPropio; // El precio del gabinete vacío
    private List<ComponentePC> hijos = new ArrayList<>();

    public KitGabinete(float precioPropio) {
        this.precioPropio = precioPropio;
    }

    public void agregar(ComponentePC componente) {
        this.hijos.add(componente);
    }

    public void quitar(ComponentePC componente) {
        this.hijos.remove(componente);
    }

    @Override
    public float getPrecio() {
        // Calcula el precio sumando su propio precio + el de todos sus hijos
        float precioTotalHijos = 0;
        for (ComponentePC hijo : hijos) {
            precioTotalHijos += hijo.getPrecio();
        }
        return this.precioPropio + precioTotalHijos;
    }
    
}
