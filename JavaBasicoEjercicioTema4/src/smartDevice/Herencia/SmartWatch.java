package smartDevice.Herencia;

import smartDevice.SmartDevice;

public class SmartWatch extends SmartDevice {

    public boolean sensorPulsaciones;
    public  boolean llamadas;
    public boolean contadorPasos;

    public SmartWatch() {}

    public SmartWatch(String marca, String modelo, String color, Boolean camaraPrincipal, Boolean camaraSecundaria, int capacidadBateria, String sistemaOperativo, Boolean resistenciaAgua, Boolean reconocimientoHuella, boolean sensorPulsaciones, boolean llamadas, boolean contadorPasos) {
        super(marca, modelo, color, camaraPrincipal, camaraSecundaria, capacidadBateria, sistemaOperativo, resistenciaAgua, reconocimientoHuella);
        this.sensorPulsaciones = sensorPulsaciones;
        this.llamadas = llamadas;
        this.contadorPasos = contadorPasos;
    }
}
