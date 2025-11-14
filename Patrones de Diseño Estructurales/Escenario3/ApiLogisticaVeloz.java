package Escenario3;

public class ApiLogisticaVeloz {
    public Cotizacion cotizarEnvio(int cpDestino) { 
        // ...lógica interna...
        return new Cotizacion(150.50f, 2); // Devuelve costo y días
    }
    public String enviarPaquete(DatosEnvio datos) { 
        // ...lógica interna...
        return "LV-987654321"; // Devuelve tracking
    }
}