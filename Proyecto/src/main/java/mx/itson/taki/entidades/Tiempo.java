package mx.itson.taki.entidades;

public class Tiempo {

    private String country;
    private long sunrise;
    private long sunset;

    /**
     * Obtiene el nombre del pais.
     * @return El nombre del pais.
     */
    public String getCountry() {
        return country;
    }

    /**
     * Cambia el nombre del pais.
     * @param country El nombre del pais.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Obtiene la salida del sol.
     * @return la salida del sol.
     */
    public long getSunrise() {
        return sunrise;
    }
    
    /**
     * Cambia la salida del sol.
     * @param sunrise La salida del sol.
     */
    public void setSunrise(long sunrise) {
        this.sunrise = sunrise;
    }

    /**
     * Obtiene puesta de sol.
     * @return Puesta de sol.
     */
    public long getSunset() {
        return sunset;
    }

    /**
     * Cambia la puesta de sol.
     * @param sunset la puesta de sol.
     */
    public void setSunset(long sunset) {
        this.sunset = sunset;
    }

    

}
