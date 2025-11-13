package Tp;
import java.time.LocalDate;

public class Main {
    // Ejemplo de uso del sistema
    public static void main(String[] args) {
        //Builder
        ConstruccionReportes reporte = new ConstruccionReportes.Builder("Reporte de Ventas", "Cuerpo del reporte")
                .agregarEncabezado("Encabezado del reporte")
                .agregarPieDePagina("Pie de página del reporte")
                .agregarFecha(LocalDate.now())
                .agregarAutor("Juan Pérez")
                .agregarOrientacion(ConstruccionReportes.EnumOrientacion.HORIZONTAL)
                .build();

        System.out.println(reporte);

        ConstruccionReportes reporte2 = new ConstruccionReportes.Builder("Reporte de Inventario", "Cuerpo del reporte del inventario")
                .agregarAutor("María Gómez")
                .build();

        System.out.println(reporte2);

        //Singleton
        ConfiguracionGlobal config = ConfiguracionGlobal.getInstance();
        config.getUrlBD();

        System.out.println("URL de la base de datos: " + config.getUrlBD());

        ConfiguracionGlobal otraConfig = ConfiguracionGlobal.getInstance();
        System.out.println("¿Son la misma instancia? " + (config == otraConfig));

        //Factory Method
        System.out.println("\n--- Demostración de Factory ---");
        // 3. El cliente (Main) necesita renderizadores
        MotorRenderizado factory = new MotorRenderizado();

        // 4. El cliente pide los objetos a la fábrica, sin usar "new" de las clases concretas
        RenderizadorReporte motorPDF = factory.crearRenderizador("PDF");
        RenderizadorReporte motorExcel = factory.crearRenderizador("EXCEL");
        
        // 5. Usamos los objetos (que son de tipo interfaz)
        motorPDF.renderizar(reporte);
        motorExcel.renderizar(reporte2);
    }
}
