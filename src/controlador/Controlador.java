/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Computadora;
import modelo.Laptop;
import modelo.Tablet;
import pootrabajo.principal;

/**
 *
 * @author Hector Marquez
 */
public class Controlador {
    
    private principal vista;
    private List<Computadora> computadoras;
    private List<Laptop> laptops;
    private List<Tablet> tablets;

    public Controlador(principal vista) {
        this.vista = vista;
        computadoras = new ArrayList<>();
        laptops = new ArrayList<>();
        tablets = new ArrayList<>();
        
    }

    public List<Computadora> getComputadoras() {
        return computadoras;
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public List<Tablet> getTablets() {
        return tablets;
    }
    
    public void ingresarComputadora(String fabricante, String modelo, String microprocesador, String ram, String tarjetaGrafica, String torre, String discoDuro) {
   
    Computadora computadora = new Computadora(fabricante, modelo, microprocesador, ram, tarjetaGrafica, torre, discoDuro);
    computadoras.add(computadora);
    
    JOptionPane.showMessageDialog(null, "Computadora ingresada correctamente.");
}
    
    public void ingresarLaptop(String fabricante, String modelo, String microprocesador, String ram, String pantalla, String discoDuro) {
    
    Laptop laptop = new Laptop(fabricante, modelo, microprocesador, ram, pantalla, discoDuro);
    laptops.add(laptop);

    JOptionPane.showMessageDialog(null, "Laptop ingresada correctamente.");
}
     
    public void ingresarTablet(String fabricante, String modelo, String microprocesador, String pantalla, String disco, String tipoPantalla, String nand, String so) {
    
        Tablet tablet = new Tablet(fabricante, modelo, microprocesador, pantalla, disco, tipoPantalla, nand, so);
        tablets.add(tablet);

        JOptionPane.showMessageDialog(null, "Tablet ingresada correctamente.");
    }
    
}
