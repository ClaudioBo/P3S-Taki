package mx.itson.taki.entidades;

public class Clima {

    private String main;
    private String icon;

   /**
     * Obtiene la descripcion del clima
     *
     * @return La descripcion del clima
     */
    public String getMain() {
        return main;
    }

    /**
     * Cambia la descripcion del clima
     *
     * @param main La nueva descripcion del clima
     */
    public void setMain(String main) {
        this.main = main;
    }

    /**
     * Obtiene el nombre del icono que esta relaciondo con el clima
     *
     * @return el nombre del icono que esta relaciondo con el clima
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Cambia el nombre del icono del clima
     *
     * @param icon El nombre del icono del clima
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

}
