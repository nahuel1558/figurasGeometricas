package Vista;

import Controlador.ControladorFiguras;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VistaCuadrado extends javax.swing.JFrame {

    ControladorFiguras controladoraFiguras;

    public VistaCuadrado() throws SQLException {

        controladoraFiguras = ControladorFiguras.GetInstance();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloCuadrado = new javax.swing.JLabel();
        lblLado1 = new javax.swing.JLabel();
        lblTextoMedidaCuadrado = new javax.swing.JLabel();
        txtLadoCuadrado = new javax.swing.JTextField();
        lblPerimetro = new javax.swing.JLabel();
        lblArea = new javax.swing.JLabel();
        lblMedidaPerimetro = new javax.swing.JLabel();
        lblMedidaArea = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        btnCalcularMedidas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTituloCuadrado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTituloCuadrado.setText("CUADRADO");

        lblLado1.setText("LADO 1:");

        lblTextoMedidaCuadrado.setText("MEDIDA DE UN LADO DEL CUADRADO");

        txtLadoCuadrado.setText("2.50");
        txtLadoCuadrado.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        txtLadoCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLadoCuadradoActionPerformed(evt);
            }
        });

        lblPerimetro.setText("PERIMETRO :");

        lblArea.setText("AREA :");

        lblMedidaPerimetro.setText("MEDIDAS");

        lblMedidaArea.setText("MEDIDAS");

        btnVolver.setText("VOLVER");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnCalcularMedidas.setText("CALCULAR");
        btnCalcularMedidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularMedidasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCalcularMedidas)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTituloCuadrado)
                        .addGap(208, 208, 208))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTextoMedidaCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLado1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLadoCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPerimetro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMedidaPerimetro)
                            .addComponent(lblMedidaArea))
                        .addContainerGap(80, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTituloCuadrado)
                    .addComponent(btnVolver))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTextoMedidaCuadrado)
                    .addComponent(lblPerimetro)
                    .addComponent(lblMedidaPerimetro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLado1)
                    .addComponent(txtLadoCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblArea)
                    .addComponent(lblMedidaArea))
                .addGap(18, 18, 18)
                .addComponent(btnCalcularMedidas)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLadoCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLadoCuadradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLadoCuadradoActionPerformed

    private void btnCalcularMedidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularMedidasActionPerformed
        try {
            float medidaLado = Float.parseFloat(txtLadoCuadrado.getText());

            float perimetroResultado = controladoraFiguras.calcularPerimetroCuadrado(medidaLado);
            lblMedidaPerimetro.setText(String.valueOf(perimetroResultado));
            float areaResultado = controladoraFiguras.calcularSuperficieCuadrado(medidaLado);
            lblMedidaArea.setText(String.valueOf(areaResultado));

        } catch (NumberFormatException exception) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un numero valido para la medida del lado del cuadrado.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnCalcularMedidasActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.setVisible(false);
        VistaFigura vistaFigura = null;
        try {
            vistaFigura = new VistaFigura();
        } catch (SQLException ex) {
            Logger.getLogger(VistaCuadrado.class.getName()).log(Level.SEVERE, null, ex);
        }
        vistaFigura.setVisible(true);
     }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(VistaCuadrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaCuadrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaCuadrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaCuadrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new VistaCuadrado().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(VistaCuadrado.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularMedidas;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblLado1;
    private javax.swing.JLabel lblMedidaArea;
    private javax.swing.JLabel lblMedidaPerimetro;
    private javax.swing.JLabel lblPerimetro;
    private javax.swing.JLabel lblTextoMedidaCuadrado;
    private javax.swing.JLabel lblTituloCuadrado;
    private javax.swing.JTextField txtLadoCuadrado;
    // End of variables declaration//GEN-END:variables
}
