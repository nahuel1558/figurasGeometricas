package Vista;

import Controlador.ControladorFiguras;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class VistaTriangulo extends javax.swing.JFrame {
    
    ControladorFiguras controladoraFiguras;

    
    public VistaTriangulo() throws SQLException {
        controladoraFiguras = ControladorFiguras.GetInstance();
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloTriangulo = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        lblTextoMedidasTriangulo = new javax.swing.JLabel();
        lblLado1Triangulo = new javax.swing.JLabel();
        lblLado2Triangulo = new javax.swing.JLabel();
        lblBaseTriangulo = new javax.swing.JLabel();
        txtBaseTriangulo = new javax.swing.JTextField();
        txtLado1Triangulo = new javax.swing.JTextField();
        txtLado2Triangulo = new javax.swing.JTextField();
        btnCalcularMedidas = new javax.swing.JButton();
        lblPerimetro = new javax.swing.JLabel();
        lblArea = new javax.swing.JLabel();
        lblMedidaPerimetro = new javax.swing.JLabel();
        lblMedidaArea = new javax.swing.JLabel();
        lblAltura = new javax.swing.JLabel();
        lblMedidaAltura = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        bntLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTituloTriangulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTituloTriangulo.setText("TRIANGULO");

        btnVolver.setText("VOLVER");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        lblTextoMedidasTriangulo.setText("MEDIDAS DEL TRIANGULO");

        lblLado1Triangulo.setText("LADO 1 :");

        lblLado2Triangulo.setText("LADO 2:");

        lblBaseTriangulo.setText("BASE : ");

        txtBaseTriangulo.setText("3.00");
        txtBaseTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBaseTrianguloActionPerformed(evt);
            }
        });

        txtLado1Triangulo.setText("5.00");

        txtLado2Triangulo.setText("5.00");

        btnCalcularMedidas.setText("CALCULAR");
        btnCalcularMedidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularMedidasActionPerformed(evt);
            }
        });

        lblPerimetro.setText("PERIMETRO :");

        lblArea.setText("AREA :");

        lblMedidaPerimetro.setText("MEDIDAS");

        lblMedidaArea.setText("MEDIDAS");

        lblAltura.setText("ALTURA :");

        lblMedidaAltura.setText("MEDIDAS");

        lblResultado.setText("RESULTADOS");

        bntLimpiar.setText("LIMPIAR");
        bntLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVolver)
                        .addGap(83, 83, 83)
                        .addComponent(lblTituloTriangulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBaseTriangulo)
                            .addComponent(lblLado2Triangulo)
                            .addComponent(btnCalcularMedidas)
                            .addComponent(lblLado1Triangulo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtBaseTriangulo, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                .addComponent(txtLado1Triangulo)
                                .addComponent(txtLado2Triangulo))
                            .addComponent(bntLimpiar)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTextoMedidasTriangulo)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPerimetro)
                                    .addComponent(lblArea)
                                    .addComponent(lblAltura))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMedidaAltura)
                                    .addComponent(lblMedidaArea)
                                    .addComponent(lblMedidaPerimetro)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblResultado)
                                .addGap(37, 37, 37)))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVolver)
                    .addComponent(lblTituloTriangulo))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTextoMedidasTriangulo)
                    .addComponent(lblResultado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBaseTriangulo)
                    .addComponent(txtBaseTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPerimetro)
                    .addComponent(lblMedidaPerimetro))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLado1Triangulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblArea)
                        .addComponent(lblMedidaArea))
                    .addComponent(lblLado1Triangulo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLado2Triangulo)
                    .addComponent(txtLado2Triangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAltura)
                    .addComponent(lblMedidaAltura))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcularMedidas)
                    .addComponent(bntLimpiar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBaseTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBaseTrianguloActionPerformed
        
    }//GEN-LAST:event_txtBaseTrianguloActionPerformed

    private void btnCalcularMedidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularMedidasActionPerformed
        try{
            float medidaBase = Float.parseFloat(txtBaseTriangulo.getText());
            float medidaLado1 = Float.parseFloat(txtLado1Triangulo.getText());
            float medidaLado2 = Float.parseFloat(txtLado2Triangulo.getText());
            
            float resultadoPerimetro = controladoraFiguras.calcularPerimetroTriangulo(medidaLado1, medidaLado2, medidaBase);
            float resultadoArea = controladoraFiguras.calcularSuperficieTriangulo(medidaLado1, medidaLado2, medidaBase);
            float resultadoAltura = controladoraFiguras.calcularAlturaTriangulo(medidaLado1, medidaLado2, medidaBase);
            
            lblMedidaPerimetro.setText(String.valueOf(resultadoPerimetro));
            lblMedidaArea.setText(String.valueOf(resultadoArea));
            lblMedidaAltura.setText(String.valueOf(resultadoAltura));
            
        }catch(NumberFormatException exception){
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un numero valido para las medidas del triangulo.", "Error", JOptionPane.ERROR_MESSAGE);
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

    private void bntLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntLimpiarActionPerformed
    
        txtBaseTriangulo.setText("");
        txtLado1Triangulo.setText("");
        txtLado2Triangulo.setText("");
        
        
        lblMedidaPerimetro.setText("");
        lblMedidaArea.setText("");
        lblMedidaAltura.setText("");
    }//GEN-LAST:event_bntLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(VistaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new VistaTriangulo().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(VistaTriangulo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntLimpiar;
    private javax.swing.JButton btnCalcularMedidas;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblBaseTriangulo;
    private javax.swing.JLabel lblLado1Triangulo;
    private javax.swing.JLabel lblLado2Triangulo;
    private javax.swing.JLabel lblMedidaAltura;
    private javax.swing.JLabel lblMedidaArea;
    private javax.swing.JLabel lblMedidaPerimetro;
    private javax.swing.JLabel lblPerimetro;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblTextoMedidasTriangulo;
    private javax.swing.JLabel lblTituloTriangulo;
    private javax.swing.JTextField txtBaseTriangulo;
    private javax.swing.JTextField txtLado1Triangulo;
    private javax.swing.JTextField txtLado2Triangulo;
    // End of variables declaration//GEN-END:variables
}
