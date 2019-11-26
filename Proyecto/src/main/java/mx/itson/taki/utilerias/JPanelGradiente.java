package mx.itson.taki.utilerias;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class JPanelGradiente extends JPanel {
    
    /**
     * Esta clase se extiende del JPanel, y el proposito de esta
     * es solo dibujar el fondo con un degradado de 2 colores
     * 
     * Solo se sobre-escribe el metodo de dibujo en pantalla para mostrar dicho
     * efecto
     * 
     * Lo hicimos gracias a unos videos en Youtube
     */

    private Color color1;
    private Color color2;

    private boolean rotar = false;

    public JPanelGradiente() {
        color1 = new Color(0, 255, 0);
        color2 = new Color(0, 0, 255);
    }

    public JPanelGradiente(Color col1, Color col2, boolean rotar) {
        this.color1 = col1;
        this.color2 = col2;
        this.rotar = rotar;

    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        int width = getWidth();
        int height = getHeight();
        GradientPaint gp = null;
        if (rotar) {
            gp = new GradientPaint(width, height, color1, 0, 0, color2);
        } else {
            gp = new GradientPaint(0, 0, color1, width, height, color2);
        }
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, width, height);
    }

    public void actualizar() {
        paintComponent(getGraphics());
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

    public boolean isRotar() {
        return rotar;
    }

    public void setRotar(boolean rotar) {
        this.rotar = rotar;
    }

}
