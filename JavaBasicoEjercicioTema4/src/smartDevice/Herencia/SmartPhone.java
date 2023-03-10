package smartDevice.Herencia;


import smartDevice.SmartDevice;

public class SmartPhone extends SmartDevice {

    public  Boolean camaraSecundaria;
    public   Boolean flash;
    public   String tipoPuerto;
    public  Boolean entradaAudio;

    public SmartPhone (){};

    public SmartPhone(String marca, String modelo, String color, Boolean camaraPrincipal, Boolean camaraSecundaria, int capacidadBateria, String sistemaOperativo, Boolean resistenciaAgua, Boolean reconocimientoHuella, Boolean camaraSecundaria1, Boolean flash, String tipoPuerto, Boolean entradaAudio) {
        super(marca, modelo, color, camaraPrincipal, camaraSecundaria, capacidadBateria, sistemaOperativo, resistenciaAgua, reconocimientoHuella);
        this.camaraSecundaria = camaraSecundaria1;
        this.flash = flash;
        this.tipoPuerto = tipoPuerto;
        this.entradaAudio = entradaAudio;
    }
};

