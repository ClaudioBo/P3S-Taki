package mx.itson.taki.entidades;

public class Clima {

    private String main;
    private String icon;

    /**
     *Obtiene la descripcion del clima.
     * @return La descripcion del clima.
     */
    public String getMain() {
        return main;
    }

    /**
     * Cambia la descripcion del clima. 
     * @param main La descripcion del clima.
     */
    public void setMain(String main) {
        this.main = main;
    }

    /**
     * Obtiene el nombre del icono.
     * @return El nombre del icono.
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Cambia el nombre del icono.
     * @param icon El nombre del icono.
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

}
