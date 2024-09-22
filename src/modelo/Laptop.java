/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Hector Marquez
 */
public class Laptop {
    private String fabricante;
    private String modelo;
    private String microprocesador;
    private String ram;
    private String pantalla;
    private String discoDuro;

    public Laptop(String fabricante, String modelo, String microprocesador, String ram, 
                  String pantalla, String discoDuro) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.microprocesador = microprocesador;
        this.ram = ram;
        this.pantalla = pantalla;
        this.discoDuro = discoDuro;
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
