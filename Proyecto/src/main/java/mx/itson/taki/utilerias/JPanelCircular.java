package mx.itson.taki.utilerias;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RadialGradientPaint;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JPanel;

public class JPanelCircular extends JPanel {
    /**
     * Esta clase se extiende del JPanel, y el proposito de esta
     * es solo dibujar el fondo con un degradado de 2 colores
     * 
     * Tambien se guarda el tamaño del degradado y su posicion en X,Y
     * 
     * Solo se sobre-escribe el metodo de dibujo en pantalla para mostrar dicho
     * efecto
     * 
     * Lo hicimos gracias a unos videos en Youtube
     */
    private float gx = 0;
    private float gy = 0;
    private float radio = 1000;
    private Color color1 = new Color(243, 195, 0);
    private Color color2 = new Color(137, 36, 6);

    public JPanelCircular() {
    }

    public JPanelCircular(float gx, float gy, float radio, Color color1, Color color2) {
        this.gx = gx;
        this.gy = gy;
        this.radio = radio;
        this.color1 = color1;
        this.color2 = color2;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        RadialGradientPaint gp = new RadialGradientPaint(gx, gy, radio, new float[]{0.2f, 0.6f}, new Color[]{color1, color2});
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, getWidth(), getHeight());
    }

    public void actualizar() {
        paint(getGraphics());
    }

    public float getGx() {
        return gx;
    }

    public void setGx(float gx) {
        this.gx = gx;
    }

    public float getGy() {
        return gy;
    }

    public void setGy(float gy) {
        this.gy = gy;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }

}
