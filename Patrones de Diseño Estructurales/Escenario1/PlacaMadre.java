package Escenario1;

public class PlacaMadre implements ComponentePC {
    private float precio;

    public PlacaMadre(float precio) {
        this.precio = precio;
    }

    @Override
    public float getPrecio() {
        return this.precio;
    }
    
}
