package Tp;

interface RenderizadorReporte {
    // Le pasamos el reporte que debe renderizar
    void renderizar(ConstruccionReportes reporte);
}

class RenderizadorPDF implements RenderizadorReporte {
    @Override
    public void renderizar(ConstruccionReportes reporte) {
        System.out.println("Renderizando reporte '" + 
            reporte.toString() + "' como PDF...");
        // (lógica compleja de PDF)
    }
}

class RenderizadorExcel implements RenderizadorReporte {
    @Override
    public void renderizar(ConstruccionReportes reporte) {
        System.out.println("Renderizando reporte '" + 
            reporte.toString() + "' como EXCEL...");
        // (lógica compleja de Excel)
    }
}

class RenderizadorCSV implements RenderizadorReporte {
    @Override
    public void renderizar(ConstruccionReportes reporte) {
        System.out.println("Renderizando reporte '" + 
            reporte.toString() + "' como CSV...");
        // (lógica compleja de CSV)
    }
}

public class MotorRenderizado {
    public RenderizadorReporte crearRenderizador(String formato) {
        // El cliente solo pide "PDF", no sabe que existe "RenderizadorPDF"
        if (formato == null || formato.isEmpty()) {
            return null;
        }

        switch (formato.toUpperCase()) {
            case "PDF":
                return new RenderizadorPDF();
            case "EXCEL":
                return new RenderizadorExcel();
            case "CSV":
                return new RenderizadorCSV();
            // case "XML":
            //    return new RenderizadorXML();   
            default:
                throw new IllegalArgumentException("Formato de reporte desconocido: " + formato);
        }
    }
}