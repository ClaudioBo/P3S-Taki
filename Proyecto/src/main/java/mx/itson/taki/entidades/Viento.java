package mx.itson.taki.entidades;

public class Viento {

    private double speed;
    private int deg;

    /**
     * Obtiene la velocidad del viento.
     * @return  la velocidad del viento.
     */
    public double getSpeed() {
        return speed;
    }
    
    /**
     * Cambia La velocidad del viento.
     * @param speed La velocidad del viento. 
     */
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    /**
     * Obtiene la direccion del viendo.
     * @return La direccion del viendo.
     */
    public int getDeg() {
        return deg;
    }

    /**
     * Cambia la direccion del viento.
     * @param deg La direccion del viento.
     */
    public void setDeg(int deg) {
        this.deg = deg;
    }

}
