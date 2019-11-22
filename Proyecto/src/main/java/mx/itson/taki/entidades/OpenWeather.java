package mx.itson.taki.entidades;

import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import mx.itson.taki.utilerias.RetrofitUtil;
import retrofit2.*;

public class OpenWeather {

    @SerializedName("dt")
    private long fechaAhora;

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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public List<Clima> getClima() {
        return clima;
    }

    public void setClima(List<Clima> clima) {
        this.clima = clima;
    }

    public Informacion getInfo() {
        return info;
    }

    public void setInfo(Informacion info) {
        this.info = info;
    }

    public Viento getViento() {
        return viento;
    }

    public void setViento(Viento viento) {
        this.viento = viento;
    }

    public Tiempo getTiempo() {
        return tiempo;
    }

    public void setTiempo(Tiempo tiempo) {
        this.tiempo = tiempo;
    }

    public Nubes getNubes() {
        return nubes;
    }

    public void setNubes(Nubes nubes) {
        this.nubes = nubes;
    }

    public long getZonahoraria() {
        return zonahoraria;
    }

    public void setZonahoraria(long zonahoraria) {
        this.zonahoraria = zonahoraria;
    }

    public long getFechaAhora() {
        return fechaAhora;
    }

    public void setFechaAhora(long fechaAhora) {
        this.fechaAhora = fechaAhora;
    }

}
