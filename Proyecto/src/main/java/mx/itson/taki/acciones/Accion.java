package mx.itson.taki.acciones;

import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import mx.itson.taki.entidades.OpenWeather;
import mx.itson.taki.presentacion.Main;

public class Accion {

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

    public Accion(Main main) {
        this.main = main;
    }

    /**
     * Al memento de aplastar el boton se rescatara la informacion de
     * openwheater de la ciudad que se ingreso.
     */
    public void apretarBoton() {
        if (txtInput.getText().length() > 3) {
            //Guarda en la variable 'cargado' la informacion obtenida de OpenWeather
            cargado = OpenWeather.obtener(txtInput.getText());
            //Si no hubo problemas, se mostrara la informacion
            if (cargado != null) {
                mostrarInformacion();
            } else {
                JOptionPane.showMessageDialog(null, "La ciudad ingresada no existe", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debes introducir mas de 3 caracteres", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Muestra la informacion que se obtuvo de openwheatrer en sus respectivos
     * labels.
     */
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

        mostrarIconoClima();
        aplicarZonaHoraria();
        cambiarFondo();
    }

    /**
     * Carga el icono utilizando la API que nos proporciona openweather y la
     * introducimos en un label como icono.
     */
    public void mostrarIconoClima() {
        try {
            URL url = new URL("https://openweathermap.org/img/wn/" + cargado.getClima().get(0).getIcon() + "@2x.png");
            Image image = ImageIO.read(url);
            icono.setIcon(new ImageIcon(image));
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Sumamos la zona horaria con las horas proporcionada por OpenWeather y los
     * tiempos en UNIX la multiplicamos por 1000
     *
     * Tambien mostramos la diferencia de horas dividiendo entre 60 dos veces la
     * zona horaria.
     */
    public void aplicarZonaHoraria() {
        SimpleDateFormat formato = new SimpleDateFormat("HH:mm");
        formato.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date ahora = new Date((new Date().getTime()) + (cargado.getZonahoraria() * 1000));
        Date sunrise = new Date((cargado.getTiempo().getSunrise() * 1000) + (cargado.getZonahoraria() * 1000));
        Date sunset = new Date((cargado.getTiempo().getSunset() * 1000) + (cargado.getZonahoraria() * 1000));
        lblHoraLocal.setText(formato.format(ahora));
        lblSalidaSol.setText(formato.format(sunrise));
        lblPuestaSol.setText(formato.format(sunset));

        lblZonaHoraria.setText("(GMT " + (cargado.getZonahoraria() / 60 / 60) + ")");
    }

    /**
     * Cambiamos el fondo de color dependiendo de las horas que sea en la ciudad
     * que se este mostrando
     */
    private void cambiarFondo() {
        int ahoraHoras = Integer.valueOf(lblHoraLocal.getText().split(":")[0]);
        int sunriseHoras = Integer.valueOf(lblSalidaSol.getText().split(":")[0]);
//        int sunsetHoras = Integer.valueOf(lblPuestaSol.getText().split(":")[0]);

        if (ahoraHoras <= sunriseHoras) {
            main.pnlInformacion.setColor1(new Color(33, 31, 112));
            main.pnlInformacion.setColor2(new Color(3, 0, 40));
        } else if (ahoraHoras > sunriseHoras && ahoraHoras <= 8) {
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

        /**
         * Como es un JPanel personalizado, mando a llamar un metodo que hara
         * que se redibuje el fondo con sus nuevos colores.
         */
        main.pnlInformacion.actualizar();
    }

}
