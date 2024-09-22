/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pootrabajo;

import controlador.Controlador;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Computadora;
import modelo.Laptop;
import modelo.Tablet;

/**
 *
 * @author carlo
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    
    private Controlador controlador;
    private List<Computadora> computadoras;
    private List<Laptop> laptops;
    private List<Tablet> tablets;
    public principal() {
        initComponents();
        controlador = new Controlador(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Electrodomesticos UDB");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ver equipos");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Añadir");

        jLabel4.setText("<html>Los mejores productos computadoras, laptos y tablets! </html>");
        jLabel4.setToolTipText("");

        jButton5.setText("jButton5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("jButton6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("jButton7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel5.setText("Computadoras");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Laptops");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Tablets");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jLabel5))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(12, 12, 12)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7)))
                .addGap(33, 33, 33)
                .addComponent(jButton4)
                .addGap(0, 46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
               //boton para salir        
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    //Ingresar Computadora
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String fabricante = JOptionPane.showInputDialog("Ingrese el Fabricante");
        String modelo = JOptionPane.showInputDialog("Ingrese el Modelo");
        String microprocesador = JOptionPane.showInputDialog("Ingrese el Microprocesador");
        String ram = JOptionPane.showInputDialog("Ingrese la cantidad de Memoria RAM");
        String tarjetaGrafica = JOptionPane.showInputDialog("Ingrese el tipo de Tarjeta gráfica");
        String torre = JOptionPane.showInputDialog("Ingrese el Tamaño de la torre");
        String discoDuro = JOptionPane.showInputDialog("Ingrese la Capacidad de disco duro");

    controlador.ingresarComputadora(fabricante, modelo, microprocesador, ram, tarjetaGrafica, torre, discoDuro);
    }//GEN-LAST:event_jButton5ActionPerformed

    //Ingresar Laptop
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String fabricante = JOptionPane.showInputDialog("Ingrese el Fabricante");
        String modelo = JOptionPane.showInputDialog("Ingrese el Modelo");
        String microprocesador = JOptionPane.showInputDialog("Ingrese el Microprocesador");
        String ram = JOptionPane.showInputDialog("Ingrese la cantidad de Memoria RAM");
        String pantalla = JOptionPane.showInputDialog("Ingrese el Tamaño de la pantalla");
        String discoDuro = JOptionPane.showInputDialog("Ingrese la Capacidad de disco duro");

    // Llamar al controlador para procesar estos datos
    controlador.ingresarLaptop(fabricante, modelo, microprocesador, ram, pantalla, discoDuro);
    }//GEN-LAST:event_jButton6ActionPerformed

    
    //Ingresar Tablet
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        String fabricante = JOptionPane.showInputDialog("Ingrese el Fabricante");
        String modelo = JOptionPane.showInputDialog("Ingrese el Modelo");
        String microprocesador = JOptionPane.showInputDialog("Ingrese el Microprocesador");
        String pantalla = JOptionPane.showInputDialog("Ingrese el Tamaño pantalla");
        String discoDuro = JOptionPane.showInputDialog("Ingrese la Capacidad de disco duro");
        String tipoPantalla = JOptionPane.showInputDialog("¿Es Capacitiva o Resistiva?");
        String nand = JOptionPane.showInputDialog("Ingrese el tamaño de memoria NAND");
        String sistemaOperativo = JOptionPane.showInputDialog("Ingrese el sistema operativo");
    
    controlador.ingresarTablet(fabricante, modelo, microprocesador, pantalla, discoDuro, tipoPantalla, nand, sistemaOperativo);

    }//GEN-LAST:event_jButton7ActionPerformed

    //Ver Computadora
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
     if (controlador.getComputadoras().isEmpty()) {
        JOptionPane.showMessageDialog(this, "No hay computadoras registradas.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Mostrar los datos de la última computadora ingresada
            Computadora ultimaComputadora = controlador.getComputadoras().get(controlador.getComputadoras().size() - 1);

            String datos = "Fabricante: " + ultimaComputadora.getFabricante() + "\n" +
                           "Modelo: " + ultimaComputadora.getModelo() + "\n" +
                           "Microprocesador: " + ultimaComputadora.getMicroprocesador() + "\n" +
                           "RAM: " + ultimaComputadora.getRam() + "\n" +
                           "Tarjeta Gráfica: " + ultimaComputadora.getTarjetaGrafica() + "\n" +
                           "Tamaño Torre: " + ultimaComputadora.getTorre() + "\n" +
                           "Disco Duro: " + ultimaComputadora.getDiscoDuro();

            // Mostrar los datos en un JOptionPane
            JOptionPane.showMessageDialog(this, datos, "Datos de la Computadora", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

        //Ver Laptop
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (controlador.getLaptops().isEmpty()) {
        JOptionPane.showMessageDialog(this, "No hay laptops registradas.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Lógica para mostrar la última laptop
            Laptop ultimaLaptop = controlador.getLaptops().get(controlador.getLaptops().size() - 1);
            
            String datos = "Fabricante: " + ultimaLaptop.getFabricante() + "\n" +
                           "Modelo: " + ultimaLaptop.getModelo() + "\n" +
                           "Microprocesador: " + ultimaLaptop.getMicroprocesador() + "\n" +
                           "RAM: " + ultimaLaptop.getRam() + "\n" +
                           "Tarjeta Gráfica: " + ultimaLaptop.getPantalla()+ "\n" +
                           "Disco Duro: " + ultimaLaptop.getDiscoDuro();
            
            
            JOptionPane.showMessageDialog(this, datos, "Datos de la Laptop", JOptionPane.INFORMATION_MESSAGE);
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

        //Ver Tablet
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (controlador.getTablets().isEmpty()) {
        JOptionPane.showMessageDialog(this, "No hay tablets registradas.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Lógica para mostrar la última tablet
            Tablet ultimaTablet = controlador.getTablets().get(controlador.getTablets().size() - 1);
            
            String datos = "Fabricante: " + ultimaTablet.getFabricante() + "\n" +
                           "Modelo: " + ultimaTablet.getModelo() + "\n" +
                           "Microprocesador: " + ultimaTablet.getMicroprocesador() + "\n" +
                           "Pantalla: " + ultimaTablet.getPantalla()+ "\n" +
                           "Disco Duro: " + ultimaTablet.getDiscoDuro()+ "\n" +
                           "Tipo de Pantalla: " + ultimaTablet.getTipoPantalla()+ "\n" +
                           "Memoria Nand: " + ultimaTablet.getMemoriaNAND()+ "\n" +
                           "Sistema Operativo: " + ultimaTablet.getSistemaOperativo();
                           
            
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }


    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
