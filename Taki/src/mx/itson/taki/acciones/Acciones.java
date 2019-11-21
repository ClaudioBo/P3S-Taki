package mx.itson.taki.acciones;

import java.util.Date;
import java.util.HashMap;
import javax.swing.Icon;
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
        if (txtInput.getText().length() > 3) {
            cargado = OpenWeather.obtener(txtInput.getText());
            mostrarInformacion();
        } else {
            JOptionPane.showMessageDialog(null, "Debes introducir mas de 3 caracteres", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void mostrarInformacion() {
        lblUbicacion.setText(cargado.getCiudad()+" "+cargado.getTiempo().getCountry());
        lblTemp.setText(cargado.getInfo().getTemp()+"");
        
        lblPresion.setText(cargado.getInfo().getPressure()+" hpa");
        lblViento.setText(cargado.getViento().getSpeed()+" m/s");
        lblHumedad.setText(cargado.getInfo().getHumidity()+"%");
        lblDireccion.setText(cargado.getViento().getDeg()+"°");
        lblMinTemp.setText(cargado.getInfo().getTempMin()+" °c");
        lblMaxTemp.setText(cargado.getInfo().getTempMax()+" °c");
        
        lblEstado.setText(cargado.getClima().get(0).getMain());
        icono.setIcon(new ImageIcon("https://openweathermap.org/img/wn/"+cargado.getClima().get(0).getIcon()+"@2x.png"));
        
        lblHoraLocal.setText(new Date().toString());
        lblZonaHoraria.setText(cargado.getZonahoraria()+"");
        lblSalidaSol.setText(new Date(cargado.getTiempo().getSunrise()).toString());
        lblPuestaSol.setText(new Date(cargado.getTiempo().getSunset()).toString());
        
    }

}
