/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Emily
 */
public class Dispositivo {
    
    protected String fabricante;
    protected String modelo;
    protected String microprocesador;

    public Dispositivo() {
    }

    public Dispositivo(String fabricante, String modelo, String microprocesador) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.microprocesador = microprocesador;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMicroprocesador() {
        return microprocesador;
    }

    public void setMicroprocesador(String microprocesador) {
        this.microprocesador = microprocesador;
    }
    
}
