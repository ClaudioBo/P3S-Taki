package mx.itson.taki.acciones;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.dateTime;
import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import mx.itson.taki.entidades.OpenWeather;
import mx.itson.taki.presentacion.Main;

public class Acciones {

    Main main;
    OpenWeather cargado;

    public JTextField txtInput;
    public JLabel lblUbicacion;
    public JLabel lblTemp;
    public JLabel lblMedida;
    public JLabel icono;
    public JLabel lblEstado;
    public JLabel lblPresion;
    public JLabel lblViento;
    public JLabel lblHumedad;
    public JLabel lblDireccion;
    public JLabel lblMinTemp;
    public JLabel lblMaxTemp;
    public JLabel lblNubes;
    public JLabel lblHoraLocal;
    public JLabel lblZonaHoraria;
    public JLabel lblSalidaSol;
    public JLabel lblPuestaSol;

    public Acciones(Main main) {
        this.main = main;
    }

    public void apretarBoton() {
        try {
            Thread.sleep(500l);
        } catch (InterruptedException ex) {
            Logger.getLogger(Acciones.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (txtInput.getText().length() > 3) {
            cargado = OpenWeather.obtener(txtInput.getText());
            if (cargado != null) {
                mostrarInformacion();
            } else {
                JOptionPane.showMessageDialog(null, "La ciudad ingresada no existe", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debes introducir mas de 3 caracteres", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void mostrarInformacion() {
        lblUbicacion.setText(cargado.getCiudad() + " " + cargado.getTiempo().getCountry());
        lblTemp.setText(cargado.getInfo().getTemp() + "");

        lblPresion.setText(cargado.getInfo().getPressure() + " hpa");
        lblViento.setText(cargado.getViento().getSpeed() + " m/s");
        lblHumedad.setText(cargado.getInfo().getHumidity() + "%");
        lblDireccion.setText(cargado.getViento().getDeg() + "°");
        lblMinTemp.setText(cargado.getInfo().getTempMin() + " °c");
        lblMaxTemp.setText(cargado.getInfo().getTempMax() + " °c");
        lblNubes.setText(cargado.getNubes().getAll() + "%");

        lblEstado.setText(cargado.getClima().get(0).getMain());

        URL url = null;
        try {
            url = new URL("https://openweathermap.org/img/wn/" + cargado.getClima().get(0).getIcon() + "@2x.png");
        } catch (MalformedURLException ex) {
            Logger.getLogger(Acciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        Image image = null;
        try {
            image = ImageIO.read(url);
        } catch (IOException ex) {
            Logger.getLogger(Acciones.class.getName()).log(Level.SEVERE, null, ex);
        }

        icono.setIcon(new ImageIcon(image));

        SimpleDateFormat formato = new SimpleDateFormat("HH:mm");
        formato.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date ahora = new Date((new Date().getTime()) + (cargado.getZonahoraria() * 1000));
        Date sunrise = new Date((cargado.getTiempo().getSunrise() * 1000) + (cargado.getZonahoraria() * 1000));
        Date sunset = new Date((cargado.getTiempo().getSunset() * 1000) + (cargado.getZonahoraria() * 1000));
        lblHoraLocal.setText(formato.format(ahora));
        lblZonaHoraria.setText("(GMT " + (cargado.getZonahoraria() / 60 / 60) + ")");

        lblSalidaSol.setText(formato.format(sunrise));
        lblPuestaSol.setText(formato.format(sunset));

        int ahoraHoras = Integer.valueOf(lblHoraLocal.getText().split(":")[0]);

        if (ahoraHoras <= 5) {
            main.pnlInformacion.setColor1(new Color(33, 31, 112));
            main.pnlInformacion.setColor2(new Color(3, 0, 40));
        } else if (ahoraHoras > 6 && ahoraHoras <= 8) {
            main.pnlInformacion.setColor1(new Color(243, 195, 0));
            main.pnlInformacion.setColor2(new Color(137, 36, 6));
        } else if (ahoraHoras > 8 && ahoraHoras <= 13) {
            main.pnlInformacion.setColor1(new Color(160, 229, 255));
            main.pnlInformacion.setColor2(new Color(2, 120, 255));
        } else if (ahoraHoras > 13 && ahoraHoras <= 16) {
            main.pnlInformacion.setColor1(new Color(243, 195, 0));
            main.pnlInformacion.setColor2(new Color(137, 36, 6));
        } else if (ahoraHoras > 16 && ahoraHoras <= 19) {
            main.pnlInformacion.setColor1(new Color(254, 126, 0));
            main.pnlInformacion.setColor2(new Color(57, 31, 151));
        } else if (ahoraHoras > 19) {
            main.pnlInformacion.setColor1(new Color(33, 31, 112));
            main.pnlInformacion.setColor2(new Color(3, 0, 40));
        }

        main.pnlInformacion.actualizar();

    }

}
