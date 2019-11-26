package mx.itson.taki.interfaces;

import mx.itson.taki.entidades.OpenWeather;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface OpenWeatherAPI {
/**
 * Interfas que permite utilizar la libreria utilizada por el profesor.
 * @param city Guardaremos el nombre de la ciudad introducida por el usuario que se utilizara para obtener el clima de esta.
 * @param appid La llave para utilizar la appi de openwheater proporcionada por ellos.
 * @param unidad Tipo de medicion deseada.
 * @return regresa el llamado a la libreria.
 */
    @GET("weather")
    Call<OpenWeather> getClima(@Query("q") String city,
            @Query("appid") String appid,
            @Query("units") String unidad);
}
