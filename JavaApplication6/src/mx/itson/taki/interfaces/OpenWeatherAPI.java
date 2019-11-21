package mx.itson.taki.interfaces;

import mx.itson.taki.entidades.OpenWeather;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface OpenWeatherAPI {

    @GET("weather")
    Call<OpenWeather> getClima(@Query("q") String city,
            @Query("appid") String appid,
            @Query("units") String unidad);
}
