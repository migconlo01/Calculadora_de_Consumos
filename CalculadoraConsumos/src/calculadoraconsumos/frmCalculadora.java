/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadoraconsumos;

/**
 *
 * @author DAW
 */
public class frmCalculadora extends javax.swing.JFrame {

    /**
     * Creates new form frmCalculadora
     */
    public frmCalculadora() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDistancia = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtConsumoMedio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrecioCombustible = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtResultadoEuros = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtResultadoLitros = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPasajeros = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEurosPersona = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("CALCULADORA DE CONSUMOS DE COMBUSTIBLE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel2.setText("Introduzca la distancia en kilómetros: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 20));
        getContentPane().add(txtDistancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 160, -1));

        jLabel3.setText("Introduzca el consumo medio en litros: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        txtConsumoMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConsumoMedioActionPerformed(evt);
            }
        });
        getContentPane().add(txtConsumoMedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 160, -1));

        jLabel4.setText("Introduzca el precio del combustible: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));
        getContentPane().add(txtPrecioCombustible, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 160, -1));

        jButton1.setText("CALCULAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 120, -1));

        jButton2.setText("BORRAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 360, 120, -1));

        jLabel5.setText("RESULTADO EN EUROS");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, -1, -1));

        txtResultadoEuros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadoEurosActionPerformed(evt);
            }
        });
        getContentPane().add(txtResultadoEuros, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, 190, -1));

        jLabel6.setText("LITROS GASTADOS");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, -1, -1));
        getContentPane().add(txtResultadoLitros, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 190, -1));

        jLabel7.setText("Introduzca el número de pasajeros:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        txtPasajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasajerosActionPerformed(evt);
            }
        });
        getContentPane().add(txtPasajeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 160, -1));

        jLabel8.setText("PRECIO POR PASAJERO");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, -1, -1));
        getContentPane().add(txtEurosPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 560, 190, -1));

        jLabel9.setText("*Los resultados obtenidos son aproximados");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 630, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtConsumoMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConsumoMedioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsumoMedioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        double distancia, precio, consumo, litros, gasto, gastoPersona, pasajeros;
        
        distancia = Double.parseDouble(txtDistancia.getText());
        precio = Double.parseDouble(txtPrecioCombustible.getText());
        consumo = Double.parseDouble(txtConsumoMedio.getText());
        pasajeros = Integer.parseInt(txtPasajeros.getText());
        litros = (distancia*consumo)/100;
        txtResultadoLitros.setText(String.valueOf(litros));
        gasto = litros * precio; 
        txtResultadoEuros.setText(String.valueOf(gasto));
        gastoPersona = gasto / pasajeros;
        txtEurosPersona.setText(String.valueOf(gastoPersona));
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        // TODO add your handling code here:
        txtDistancia.setText("");
        txtPrecioCombustible.setText("");
        txtConsumoMedio.setText("");
        txtResultadoEuros.setText("");
        txtResultadoLitros.setText("");
        txtEurosPersona.setText("");
        txtPasajeros.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtPasajerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasajerosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasajerosActionPerformed

    private void txtResultadoEurosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadoEurosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadoEurosActionPerformed

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
            java.util.logging.Logger.getLogger(frmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtConsumoMedio;
    private javax.swing.JTextField txtDistancia;
    private javax.swing.JTextField txtEurosPersona;
    private javax.swing.JTextField txtPasajeros;
    private javax.swing.JTextField txtPrecioCombustible;
    private javax.swing.JTextField txtResultadoEuros;
    private javax.swing.JTextField txtResultadoLitros;
    // End of variables declaration//GEN-END:variables
}
