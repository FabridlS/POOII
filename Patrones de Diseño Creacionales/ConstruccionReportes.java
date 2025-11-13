package Tp;

import java.time.LocalDate;

public class ConstruccionReportes {
    // datos obligatorios 
    private String titulo;
    private String cuerpoPrincipal;
    // datos opcionales
    private String encabezado;
    private String pieDePagina;
    private LocalDate fecha;
    private String autor;
    private EnumOrientacion orientacion;

    private StringBuilder salida;

    enum EnumOrientacion {
        HORIZONTAL,
        VERTICAL
    }    

    private ConstruccionReportes(Builder builder) {
        this.titulo = builder.titulo;
        this.cuerpoPrincipal = builder.cuerpoPrincipal;
        this.encabezado = builder.encabezado;
        this.pieDePagina = builder.pieDePagina;
        this.fecha = builder.fecha;
        this.autor = builder.autor;
        this.orientacion = builder.orientacion;
        // Use the Builder's StringBuilder to initialize the outer instance's salida
        this.salida = builder.salida;
    }
    @Override
    public String toString(){
        return salida.toString();
    }
    public static class Builder {
        // Copiamos todos los atributos
        private String titulo;
        private String cuerpoPrincipal;
        private String encabezado;
        private String pieDePagina;
        private LocalDate fecha;
        private String autor;
        private EnumOrientacion orientacion;
        // Builder-local StringBuilder to accumulate output (avoids referencing outer instance)
        private StringBuilder salida = new StringBuilder();

        public Builder(String titulo, String cuerpoPrincipal) {
            this.titulo = titulo;
            this.cuerpoPrincipal = cuerpoPrincipal;
            salida.append("Título: ").append(titulo).append(" || Cuerpo: ").append(cuerpoPrincipal).append("\n");
        }

        //Metodos para agregar los atributos opcionales
        public Builder agregarEncabezado(String encabezado) {
            this.encabezado = encabezado;
            salida.append("Encabezado: ").append(encabezado).append("\n");
            return this; // Retorna el mismo builder para encadenar llamadas
        }

        public Builder agregarPieDePagina(String pieDePagina) {
            this.pieDePagina = pieDePagina;
            salida.append("Pie de pagina: ").append(pieDePagina).append("\n");
            return this;
        }

        public Builder agregarFecha(LocalDate fecha) {
            this.fecha = fecha;
            salida.append("Fecha: ").append(fecha).append("\n");
            return this;
        }

        public Builder agregarAutor(String autor) {
            this.autor = autor;
            salida.append("Autor: ").append(autor).append("\n");
            return this;
        }

        public Builder agregarOrientacion(EnumOrientacion orientacion) {
            this.orientacion = orientacion;
            salida.append("Orientacion: ").append(orientacion).append("\n");
            return this;
        }

        // Metodo build para construir el objeto final
        public ConstruccionReportes build() {
            return new ConstruccionReportes(this);
        }
    }
}