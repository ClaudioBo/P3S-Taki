package mx.itson.taki.utilerias;

import mx.itson.taki.interfaces.OpenWeatherAPI;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitUtil {

    public static OpenWeatherAPI getApi() {
        
//        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
//        httpClient.setConnectTimeout$okhttp(2000);
//        httpClient.setReadTimeout$okhttp(2000);
        
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.openweathermap.org/data/2.5/")
                .addConverterFactory(GsonConverterFactory.create())
//                .client(httpClient.build())
                .build();
        return retrofit.create(OpenWeatherAPI.class);
    }
}
