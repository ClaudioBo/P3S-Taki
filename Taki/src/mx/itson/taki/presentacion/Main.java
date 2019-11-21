package mx.itson.taki.presentacion;

import mx.itson.taki.entidades.OpenWeather;

public class Main {

    public static void main(String[] args) {
        OpenWeather ow = OpenWeather.obtener("Guaymas");
        
        System.out.println("res: "+ow.getCiudad());
    }
}
