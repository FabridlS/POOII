package Escenario1;

import java.math.BigDecimal;

public class Agregado {
    private String tipo;
    private BigDecimal precio;

    public Agregado(String tipoRecibido, BigDecimal precioRecibido){
        this.tipo = tipoRecibido;
        this.precio = precioRecibido;
    }

    public BigDecimal getPrecio() {
        return precio;
    }
    public String getTipo(){
        return tipo;
    }
}
