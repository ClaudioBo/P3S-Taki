package mx.itson.taki.utilerias;

import mx.itson.taki.interfaces.OpenWeatherAPI;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitUtil {

    /**
     * Prepara el cliente para conectarse a la api. 
     * @return El cliente para conectarse a la api 
     */
    public static OpenWeatherAPI getApi() {
    
        
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.openweathermap.org/data/2.5/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(OpenWeatherAPI.class);
    }
}
