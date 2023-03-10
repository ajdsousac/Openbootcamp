package smartDevice;

public class SmartDevice {
    public String marca;
    public String modelo;
    public String color;
    public Boolean camaraPrincipal;
    public   Boolean camaraSecundaria;
    public  int capacidadBateria;
    public  String sistemaOperativo;
    public Boolean resistenciaAgua;
    public  Boolean reconocimientoHuella;


    public SmartDevice(){}

    public SmartDevice(String marca, String modelo, String color, Boolean camaraPrincipal, Boolean camaraSecundaria, int capacidadBateria, String sistemaOperativo, Boolean resistenciaAgua, Boolean reconocimientoHuella) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.camaraPrincipal = camaraPrincipal;
        this.camaraSecundaria = camaraSecundaria;
        this.capacidadBateria = capacidadBateria;
        this.sistemaOperativo = sistemaOperativo;
        this.resistenciaAgua = resistenciaAgua;
        this.reconocimientoHuella = reconocimientoHuella;
    }
}
