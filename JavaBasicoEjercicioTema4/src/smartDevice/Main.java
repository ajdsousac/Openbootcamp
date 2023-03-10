package smartDevice;//En este ejercicio tendréis que crear una clase smartDevice.SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
// Agregaréis atributos tal cual tendrían esos objetos en la realidad.
// Crear constructor vacío y con todos los parámetros para cada clase.
// Desde una clase smartDevice.Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.

import smartDevice.Herencia.SmartPhone;
import smartDevice.Herencia.SmartWatch;

public class Main {
    public static void main(String[] args) {

        SmartPhone iphone = new SmartPhone("Apple", "X Pro", "Blanco", true, true, 6000, "iOS",
                true, true, true, true, "lightning", false);
        System.out.println("A continuacion se imprimen los valores de iphone:");
        System.out.println("Marca: " + iphone.marca);
        System.out.println("Modelo: " + iphone.modelo);
        System.out.println("Color: " + iphone.color);
        System.out.println("Camara Principal: " +iphone.camaraPrincipal);
        System.out.println("Camara Principal: " + iphone.camaraSecundaria);
        System.out.println("Capacidad de la bateria :" +iphone.capacidadBateria);
        System.out.println("Sistema operativo :" +iphone.sistemaOperativo);
        System.out.println("Resistencia al agua: " +iphone.resistenciaAgua);
        System.out.println("Lector de huellas: " +iphone.reconocimientoHuella);
        System.out.println("Camara secundaria :" +iphone.camaraSecundaria);
        System.out.println("Flash: " +iphone.flash);
        System.out.println("Puerto de carga: " +iphone.tipoPuerto);
        System.out.println("Tipo de entrada de Audio: " +iphone.entradaAudio);

        SmartWatch relojinteligente = new SmartWatch("Generic", "D20", "verde", false, false, 90,"Android", false,
                false, true, false, true);
        System.out.println("A continuacion se imprimen los valores de relojinteligente:");
        System.out.println("Marca: " + relojinteligente.marca);
        System.out.println("Modelo: " + relojinteligente.modelo);
        System.out.println("Color: " + relojinteligente.color);
        System.out.println("Camara Principal: " +relojinteligente.camaraPrincipal);
        System.out.println("Camara Principal: " + relojinteligente.camaraSecundaria);
        System.out.println("Capacidad de la bateria :" +relojinteligente.capacidadBateria);
        System.out.println("Sistema operativo :" +relojinteligente.sistemaOperativo);
        System.out.println("Resistencia al agua: " +relojinteligente.resistenciaAgua);
        System.out.println("Lector de huellas: " +relojinteligente.reconocimientoHuella);
        System.out.println("Sensor de Pulsaciones :" +relojinteligente.sensorPulsaciones);
        System.out.println("Recibe llamadas: " + relojinteligente.llamadas);
        System.out.println("Contador de pasos: " +relojinteligente.contadorPasos);

    }
}
