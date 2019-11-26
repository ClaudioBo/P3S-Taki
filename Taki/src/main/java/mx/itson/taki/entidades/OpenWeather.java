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
     * @return el nombre de la ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Cambia el nombre de la ciudad actual
     *
     * @param ciudad Nombre de la ciudad nueva
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Obtiene los climas de la ciudad actual
     *
     * @return Lista de los climas de la ciudad
     */
    public List<Clima> getClima() {
        return clima;
    }

    /**
     * Cambia los climas de la ciudad actual
     *
     * @param clima Lista nueva de los climas de la ciudad
     */
    public void setClima(List<Clima> clima) {
        this.clima = clima;
    }

    /**
     * Obtener el conjunto de informacion sobre la presion atmosferica, la
     * temperatura y la humedad de la ciudad actual
     *
     * @return Objecto que contiene presion atmosferica, temperatura y humedad
     */
    public Informacion getInfo() {
        return info;
    }

    /**
     * Cambia el conjunto de informacion sobre la presion atmosferica, la
     * temperatura y la humedad de la ciudad actual
     *
     * @param info Objecto nuevo que contiene presion atmosferica, temperatura y humedad
     */
    public void setInfo(Informacion info) {
        this.info = info;
    }

    /**
     * Obtener el conjunto de informacion sobre la velocidad del viendo y su
     * direccion de la ciudad actual
     *
     * @return Objecto que contiene informacion sobre la vel. de viento y la direccion del viento
     */
    public Viento getViento() {
        return viento;
    }

    /**
     * Cambia el conjunto de informacion sobre la velocidad del viendo y su
     * direccion de la ciudad actual
     *
     * @param viento Objecto nuevo que contiene presion atmosferica, temperatura y humedad
     */
    public void setViento(Viento viento) {
        this.viento = viento;
    }

    /**
     * Obtener el conjunto de informacion sobre el nombre del pais, cuando
     * amanecera y cuando anochecera de la ciudad actual.
     *
     * @return Objecto que contiene nombre de pais, tiempo de amanecer y atardecer
     */
    public Tiempo getTiempo() {
        return tiempo;
    }

    /**
     * Cambia el conjunto de informacion sobre el nombre del pais, cuando
     * amanecera y cuando anochecera de la ciudad actual.
     *
     * @param tiempo Objecto nuevo que contiene nombre de pais, tiempo de amanecer y atardecer
     */
    public void setTiempo(Tiempo tiempo) {
        this.tiempo = tiempo;
    }

    /**
     * Obtener el conjunto de informacion sobre el porcentaje de nubes de la
     * ciudad actual.
     *
     * @return Objecto que contiene porcentaje de nubes
     */
    public Nubes getNubes() {
        return nubes;
    }

    /**
     * Cambia el conjunto de informacion sobre el porcentaje de nubes de la
     * ciudad actual.
     *
     * @param nubes Objecto nuevoque contiene porcentaje de nubes
     */
    public void setNubes(Nubes nubes) {
        this.nubes = nubes;
    }

    /**
     * Obtiene la diferencia en segundos sobre la ciudad actual y la medicion
     * "UTC".
     *
     * @return Zona horaria en segundos
     */
    public long getZonahoraria() {
        return zonahoraria;
    }

    /**
     * Cambia la diferencia en segundos sobre la ciudad actual y la medicion
     * "UTC".
     *
     * @param zonahoraria Zona horaria nueva en segundos
     */
    public void setZonahoraria(long zonahoraria) {
        this.zonahoraria = zonahoraria;
    }

}
