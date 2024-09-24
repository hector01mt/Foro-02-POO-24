/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
/**
 *
 * @author Emily
 */

public class Laptop extends Dispositivo {
    private String ram;
    private String pantalla;
    private String discoDuro;

    public Laptop(String fabricante, String modelo, String microprocesador, String ram, 
                  String pantalla, String discoDuro) {
        super(fabricante, modelo, microprocesador);  
        this.ram = ram;
        this.pantalla = pantalla;
        this.discoDuro = discoDuro;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public String getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(String discoDuro) {
        this.discoDuro = discoDuro;
    }
}
