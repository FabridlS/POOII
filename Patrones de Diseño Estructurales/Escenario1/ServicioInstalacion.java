package Escenario1;

public class ServicioInstalacion extends ExtrasDecorator {
    public ServicioInstalacion(ComponentePC componente) {
        super(componente);
    }

    @Override
    public float getPrecio() {
        // Obtiene el precio del objeto envuelto y le suma $50
        return super.getPrecio() + 50.0f;
    }
}
