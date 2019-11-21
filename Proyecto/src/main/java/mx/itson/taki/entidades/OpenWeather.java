package mx.itson.taki.entidades;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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

    public static OpenWeather obtener(String ciudad) {

        OpenWeather ret = new OpenWeather();

        Call<OpenWeather> llamada = RetrofitUtil.getApi().getClima(ciudad, "4439bd707b540e8ae62dafc87bc966c3", "metric");
        llamada.enqueue(new Callback<OpenWeather>() {
            @Override
            public void onResponse(Call<OpenWeather> call, Response<OpenWeather> rspns) {
                if (rspns.isSuccessful()) {
                    OpenWeather o = rspns.body();
                    ret.setCiudad(o.getCiudad());
                    ret.setClima(o.getClima());
                    ret.setInfo(o.getInfo());
                    ret.setNubes(o.getNubes());
                    ret.setTiempo(o.getTiempo());
                    ret.setViento(o.getViento());
                }
            }

            @Override
            public void onFailure(Call<OpenWeather> call, Throwable thrwbl) {
                thrwbl.printStackTrace();
            }
        });
        
        //Solucion temporal para que alcanze la consulta
        try {
            Thread.sleep(1000l);
        } catch (InterruptedException ex) {
            Logger.getLogger(OpenWeather.class.getName()).log(Level.SEVERE, null, ex);
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
    
    
    
}
