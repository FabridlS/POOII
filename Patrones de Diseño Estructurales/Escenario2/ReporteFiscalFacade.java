package Escenario2;

public class ReporteFiscalFacade {
    // La fachada "tiene" instancias de todas las clases del subsistema
    private ConectorDB conector;
    private ServicioWebAFIP servicioAfip;
    private ProcesadorDeImpuestos procesador;
    private RenderizadorPDF renderizador;

    // El constructor inicializa todo el subsistema
    public ReporteFiscalFacade() {
        this.conector = new ConectorDB();
        this.servicioAfip = new ServicioWebAFIP();
        this.procesador = new ProcesadorDeImpuestos();
        this.renderizador = new RenderizadorPDF();
    }

    // Este es el método simple que el cliente usará
    public void generarReporteFiscal() {
        // Oculta toda la complejidad de los pasos 
        conector.conectar();
        String cuit = conector.getCuitCliente();
        
        servicioAfip.autenticar();
        DatosFiscales datos = servicioAfip.obtenerDatosFiscales(cuit);
        
        MontosCalculados montos = procesador.calcular(datos);
        
        renderizador.generarPDF(montos);
        
        System.out.println("Reporte generado exitosamente.");
    }
}
