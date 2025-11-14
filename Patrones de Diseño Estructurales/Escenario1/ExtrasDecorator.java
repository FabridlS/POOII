package Escenario1;

public abstract class ExtrasDecorator implements ComponentePC {
    protected ComponentePC componentePC;

    public ExtrasDecorator(ComponentePC componentePC) {
        this.componentePC = componentePC;
    }

    @Override
    public float getPrecio() {
        return componentePC.getPrecio();
    }
}