package mx.itson.taki.entidades;

import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import java.util.List;
import mx.itson.taki.utilerias.RetrofitUtil;
import retrofit2.*;

public class OpenWeather {

    @SerializedName("name")
    private String ciudad;

    @SerializedName("weather")
    private List<Clima> clima;

    @SerializedName("main")
    private Informacion info;

    @SerializedName("wind")
    private Viento viento;

    @SerializedName("sys")
    private Tiempo tiempo;

    @SerializedName("timezone")
    private long zonahoraria;

    @SerializedName("clouds")
    private Nubes nubes;

    /**
     * Hace el llamado a la API de OpenWeather para conseguir la informacion de
     * la ciudad introducida.
     *
     * @param ciudad La ciudad introducida por el usuario
     * @return Objecto de tipo OpenWeather con la informacion del servicio.
     */
    public static OpenWeather obtener(String ciudad) {
        OpenWeather ret = null;
        Call<OpenWeather> llamada = RetrofitUtil.getApi().getClima(ciudad, "4439bd707b540e8ae62dafc87bc966c3", "metric");
        try {
            ret = llamada.execute().body();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return ret;
    }

    /**
     * Obtiene el nombre de la ciudad actual
     *
     * @return
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Cambia el nombre de la ciudad actual
     *
     * @param ciudad
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Obtiene los climas de la ciudad actual
     *
     * @return
     */
    public List<Clima> getClima() {
        return clima;
    }

    /**
     * Cambia los climas de la ciudad actual
     *
     * @param clima
     */
    public void setClima(List<Clima> clima) {
        this.clima = clima;
    }

    /**
     * Obtener el conjunto de informacion sobre la presion atmosferica, la
     * temperatura y la humedad de la ciudad actual
     *
     * @return
     */
    public Informacion getInfo() {
        return info;
    }

    /**
     * Cambia el conjunto de informacion sobre la presion atmosferica, la
     * temperatura y la humedad de la ciudad actual
     *
     * @param info
     */
    public void setInfo(Informacion info) {
        this.info = info;
    }

    /**
     * Obtener el conjunto de informacion sobre la velocidad del viendo y su
     * direccion de la ciudad actual
     *
     * @return
     */
    public Viento getViento() {
        return viento;
    }

    /**
     * Cambia el conjunto de informacion sobre la velocidad del viendo y su
     * direccion de la ciudad actual
     *
     * @param viento
     */
    public void setViento(Viento viento) {
        this.viento = viento;
    }

    /**
     * Obtener el conjunto de informacion sobre el nombre del pais, cuando
     * amanecera y cuando anochecera de la ciudad actual.
     *
     * @return
     */
    public Tiempo getTiempo() {
        return tiempo;
    }

    /**
     * Cambia el conjunto de informacion sobre el nombre del pais, cuando
     * amanecera y cuando anochecera de la ciudad actual.
     *
     * @param tiempo
     */
    public void setTiempo(Tiempo tiempo) {
        this.tiempo = tiempo;
    }

    /**
     * Obtener el conjunto de informacion sobre el porcentaje de nubes de la
     * ciudad actual.
     *
     * @return
     */
    public Nubes getNubes() {
        return nubes;
    }

    /**
     * Cambia el conjunto de informacion sobre el porcentaje de nubes de la
     * ciudad actual.
     *
     * @param nubes
     */
    public void setNubes(Nubes nubes) {
        this.nubes = nubes;
    }

    /**
     * Obtiene la diferencia en segundos sobre la ciudad actual y la medicion
     * "UTC".
     *
     * @return
     */
    public long getZonahoraria() {
        return zonahoraria;
    }

    /**
     * Cambia la diferencia en segundos sobre la ciudad actual y la medicion
     * "UTC".
     *
     * @param zonahoraria
     */
    public void setZonahoraria(long zonahoraria) {
        this.zonahoraria = zonahoraria;
    }

}
