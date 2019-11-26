package mx.itson.taki.entidades;

import com.google.gson.annotations.SerializedName;

public class Informacion {

    private double temp;
    private int pressure;
    private int humidity;

    @SerializedName("temp_min")
    private double tempMin;

    @SerializedName("temp_max")
    private double tempMax;

    /**
     * Obtiene la temperatura actual de la ciudad.
     *
     * @return La temperatura actual de la ciudad.
     */
    public double getTemp() {
        return temp;
    }

    /**
     * Cambia la temperatura actual de la ciudad.
     *
     * @param temp La temperatura actual de la ciudad.
     */
    public void setTemp(double temp) {
        this.temp = temp;
    }

    /**
     * Obtiene la presion admosferica de la ciudad actual.
     *
     * @return La presion admosferica de la ciudad actual.
     */
    public int getPressure() {
        return pressure;
    }

    /**
     * Cambia la precion admosferica de la ciudad actual.
     *
     * @param pressure La precion admosferica de la ciudad actual.
     */
    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    /**
     * Obtiene la humedad de la ciudad actual.
     *
     * @return La humedad de la ciudad actual.
     */
    public int getHumidity() {
        return humidity;
    }

    /**
     * Cambia la humedad de la ciudad actual.
     *
     * @param humidity La humedad de la ciudad actual.
     */
    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    /**
     * Obtiene la temperatura minima de la ciudad actual.
     *
     * @return La temperatura minima de la ciudad actual.
     */
    public double getTempMin() {
        return tempMin;
    }

    /**
     * Cambia la temperatura minima dela ciudad actual.
     *
     * @param tempMin La temperatura minima de la ciudad actual.
     */
    public void setTempMin(double tempMin) {
        this.tempMin = tempMin;
    }

    /**
     * Obtiene la temperatura maxima de la ciudad actual.
     *
     * @return La temperatura maxima de la ciudad actual.
     */
    public double getTempMax() {
        return tempMax;
    }

    /**
     * Cambia la temperatura maxima dela ciudad actual.
     *
     * @param tempMax la temperatura maxima dela ciudad actual.
     */
    public void setTempMax(double tempMax) {
        this.tempMax = tempMax;
    }

}
