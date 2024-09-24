/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
/**
 *
 * @author Emily
 */

public class Tablet extends Dispositivo {
    private String pantalla;
    private String discoDuro;
    private String tipoPantalla;
    private String memoriaNAND;
    private String sistemaOperativo;

    public Tablet(String fabricante, String modelo, String microprocesador, String pantalla, 
                  String discoDuro, String tipoPantalla, String memoriaNAND, String sistemaOperativo) {
        super(fabricante, modelo, microprocesador);  // Llamada al constructor de la clase padre
        this.pantalla = pantalla;
        this.discoDuro = discoDuro;
        this.tipoPantalla = tipoPantalla;
        this.memoriaNAND = memoriaNAND;
        this.sistemaOperativo = sistemaOperativo;
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