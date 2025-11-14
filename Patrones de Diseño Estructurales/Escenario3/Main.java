package Escenario3;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ejecutando el sistema con el Adaptador de LogísticaVeloz ---");
        
        // El cliente (nuestro Main) solo conoce la interfaz IServicioEnvio.
        // Instanciamos el Adaptador, pero lo tratamos como si fuera cualquier
        // otro IServicioEnvio.
        LogisticaVelozAdapter servicioDeEnvio = new LogisticaVelozAdapter();

        // 1. El cliente llama a calcularCosto
        String codigoPostalCliente = "1640";
        float costo = servicioDeEnvio.calcularCosto(codigoPostalCliente);
        System.out.println("\n[CLIENTE] Costo consultado para CP " + codigoPostalCliente + ": $" + costo);

        // 2. El cliente llama a obtenerTiempoEstimado
        String tiempo = servicioDeEnvio.obtenerTiempoEstimado(codigoPostalCliente);
        System.out.println("[CLIENTE] Tiempo estimado para CP " + codigoPostalCliente + ": " + tiempo);

        // 3. El cliente llama a despacharPedido
        String trackingId = servicioDeEnvio.despacharPedido("Av. Siempreviva 742", "1640", "PED-001");
        System.out.println("[CLIENTE] Pedido despachado. Código de seguimiento: " + trackingId);
    }
}
