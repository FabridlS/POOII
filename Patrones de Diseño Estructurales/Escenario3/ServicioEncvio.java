package Escenario3;

public interface ServicioEncvio {
    float calcularCosto(String codigoPostal); 
    String obtenerTiempoEstimado(String codigoPostal); 
    String despacharPedido(String direccion, String codigoPostal, String idPedido); 
}
