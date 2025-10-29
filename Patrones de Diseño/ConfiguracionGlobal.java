package Tp;

public class ConfiguracionGlobal {
    private static final ConfiguracionGlobal instance = new ConfiguracionGlobal();

    //Atributos de configuración
    private String urlBD;
    private String userBD;
    private String pathReportes;

    private ConfiguracionGlobal() {
        // Valores por defecto
        this.urlBD = "localhost:3306/miBaseDeDatos";
        this.userBD = "admin";
        this.pathReportes = "/home/usuario/reportes/";
    }
    
    public static ConfiguracionGlobal getInstance() {
        return instance;
    }
    
    //Getters y Setters
    public String getUrlBD() {
        return urlBD;
    }
    public String getUserBD() {
        return userBD;
    }
    public String getPathReportes() {
        return pathReportes;
    }
    public void setUrlBD(String urlBD) {
        this.urlBD = urlBD;
    }
    public void setUserBD(String userBD) {
        this.userBD = userBD;
    }
    public void setPathReportes(String pathReportes) {
        this.pathReportes = pathReportes;
    }
}
