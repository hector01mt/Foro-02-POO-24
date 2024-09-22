/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Hector Marquez
 */
public class Tablet {
    
    private String fabricante;
    private String modelo;
    private String microprocesador;
    private String pantalla;
    private String discoDuro;
    private String tipoPantalla;
    private String memoriaNAND;
    private String sistemaOperativo;

    // Constructor
    public Tablet(String fabricante, String modelo, String microprocesador, String pantalla, String discoDuro, String tipoPantalla, String memoriaNAND, String sistemaOperativo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.microprocesador = microprocesador;
        this.pantalla = pantalla;
        this.discoDuro = discoDuro;
        this.tipoPantalla = tipoPantalla;
        this.memoriaNAND = memoriaNAND;
        this.sistemaOperativo = sistemaOperativo;
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

    public String getTipoPantalla() {
        return tipoPantalla;
    }

    public void setTipoPantalla(String tipoPantalla) {
        this.tipoPantalla = tipoPantalla;
    }

    public String getMemoriaNAND() {
        return memoriaNAND;
    }

    public void setMemoriaNAND(String memoriaNAND) {
        this.memoriaNAND = memoriaNAND;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }
    
    
    
}
