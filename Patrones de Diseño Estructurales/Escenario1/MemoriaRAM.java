package Escenario1;

public class MemoriaRAM implements ComponentePC {
    private float precio;

    public MemoriaRAM(float precio) {
        this.precio = precio;
    }

    @Override
    public float getPrecio() {
        return this.precio;
    }
    
}
