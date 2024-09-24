/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
/**
 *
 * @author Emily
 */

public class Computadora extends Dispositivo {
    private String ram;
    private String tarjetaGrafica;
    private String torre;
    private String discoDuro;
 
    public Computadora(String fabricante, String modelo, String microprocesador, String ram, 
                      String tarjetaGrafica, String torre, String discoDuro) {
        super(fabricante, modelo, microprocesador); 
        this.ram = ram;
        this.tarjetaGrafica = tarjetaGrafica;
        this.torre = torre;
        this.discoDuro = discoDuro;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public String getTorre() {
        return torre;
    }

    public void setTorre(String torre) {
        this.torre = torre;
    }

    public String getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(String discoDuro) {
        this.discoDuro = discoDuro;
    }
}