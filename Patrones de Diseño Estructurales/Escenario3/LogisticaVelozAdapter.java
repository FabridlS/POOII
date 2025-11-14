package Escenario3;

public class LogisticaVelozAdapter implements ServicioEncvio{
    // El adaptador "tiene" una instancia de la librería externa
    private ApiLogisticaVeloz apiVeloz;

    public LogisticaVelozAdapter() {
        this.apiVeloz = new ApiLogisticaVeloz();
    }

    @Override
    public float calcularCosto(String codigoPostal) {
        // TRADUCCIÓN: String -> int [cite: 73]
        int cp = Integer.parseInt(codigoPostal);
        
        // TRADUCCIÓN: Llamar al método correcto [cite: 72]
        Cotizacion coti = apiVeloz.cotizarEnvio(cp);
        
        // TRADUCCIÓN: Obtener el dato correcto del objeto devuelto
        return coti.costo;
    }

    @Override
    public String obtenerTiempoEstimado(String codigoPostal) {
        int cp = Integer.parseInt(codigoPostal);
        Cotizacion coti = apiVeloz.cotizarEnvio(cp);
        return coti.dias + " días";
    }

    @Override
    public String despacharPedido(String direccion, String codigoPostal, String idPedido) {
        // TRADUCCIÓN: Mapear tus 3 strings a su objeto DatosEnvio [cite: 75]
        DatosEnvio datos = new DatosEnvio(/*...mapear datos...*/);
        
        // TRADUCCIÓN: Llamar al método correcto
        return apiVeloz.enviarPaquete(datos);
    }
}
