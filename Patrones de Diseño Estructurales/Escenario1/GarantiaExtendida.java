package Escenario1;

public class GarantiaExtendida extends ExtrasDecorator {
    public GarantiaExtendida(ComponentePC componente) {
        super(componente);
    }

    @Override
    public float getPrecio() {
        // Obtiene el precio del objeto envuelto y le añade el 10%
        return super.getPrecio() * 1.10f;
    }
}
