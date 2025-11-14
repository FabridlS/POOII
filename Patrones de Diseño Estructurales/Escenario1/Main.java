package Escenario1;

public class Main {
    public static void main(String[] args) {

        KitGabinete miGabinete = new KitGabinete(120);
        miGabinete.agregar(new PlacaMadre(250));
        miGabinete.agregar(new MemoriaRAM(80));

        // 2. Envolverlo con Decoradores
        ComponentePC gabineteConInstalacion = new ServicioInstalacion(miGabinete);
        ComponentePC gabineteCompleto = new GarantiaExtendida(gabineteConInstalacion);

        // 3. El cliente trata a todo igual
        // Llama a getPrecio() sobre el último envoltorio
        float precioFinal = gabineteCompleto.getPrecio();
        System.out.println("El precio final del gabinete es: $" + precioFinal);
    }

}
