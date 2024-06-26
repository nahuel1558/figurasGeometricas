
package Vista;

import Controlador.ControladorFiguras;
import Modelo.Circulo;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author nahue
 */
public class VistaCirculo extends javax.swing.JFrame {

    ControladorFiguras controladoraFiguras;
    /**
     * Creates new form VistaCirculo
     * @throws java.sql.SQLException
     */
    public VistaCirculo() throws SQLException {
        controladoraFiguras = ControladorFiguras.GetInstance();
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloCirculo = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        lblMedidasCirculo = new javax.swing.JLabel();
        lblRadio = new javax.swing.JLabel();
        txtRadioCirculo = new javax.swing.JTextField();
        btnCalcularMedidas = new javax.swing.JButton();
        lblResultados = new javax.swing.JLabel();
        lblPerimetro = new javax.swing.JLabel();
        lblArea = new javax.swing.JLabel();
        lblMedidaPerimetro = new javax.swing.JLabel();
        lblMedidaArea = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTituloCirculo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTituloCirculo.setText("CIRCULO");

        btnVolver.setText("VOLVER");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        lblMedidasCirculo.setText("MEDIDAS DEL CIRCULO");

        lblRadio.setText("RADIO : ");

        txtRadioCirculo.setText("2.00");
        txtRadioCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRadioCirculoActionPerformed(evt);
            }
        });

        btnCalcularMedidas.setText("CALCULAR");
        btnCalcularMedidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularMedidasActionPerformed(evt);
            }
        });

        lblResultados.setText("RESULTADOS");

        lblPerimetro.setText("PERIMETRO :");

        lblArea.setText("AREA :");

        lblMedidaPerimetro.setText("MEDIDAS");

        lblMedidaArea.setText("MEDIDAS");

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTituloCirculo)
                        .addGap(238, 238, 238))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCalcularMedidas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRadio)
                                .addGap(18, 18, 18)
                                .addComponent(txtRadioCirculo))
                            .addComponent(lblMedidasCirculo))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblResultados)
                                .addGap(146, 146, 146))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPerimetro)
                                    .addComponent(lblArea))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMedidaArea)
                                    .addComponent(lblMedidaPerimetro))
                                .addGap(108, 108, 108))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTituloCirculo)
                    .addComponent(btnVolver))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMedidasCirculo)
                    .addComponent(lblResultados))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblRadio)
                        .addComponent(txtRadioCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPerimetro)
                            .addComponent(lblMedidaPerimetro))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblArea)
                            .addComponent(lblMedidaArea))))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcularMedidas)
                    .addComponent(btnLimpiar))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnCalcularMedidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularMedidasActionPerformed
        try{
            float medidaRadio = Float.parseFloat(txtRadioCirculo.getText());
            
            float resultadoPerimetro = controladoraFiguras.calcularPerimetroCirculo(medidaRadio);
            float resultadoArea = controladoraFiguras.calcularSuperficieCirculo(medidaRadio);
            
            lblMedidaPerimetro.setText(String.valueOf(resultadoPerimetro));
            lblMedidaArea.setText(String.valueOf(resultadoArea));
            
        }catch(NumberFormatException exception){
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un numero valido para el radio del circulo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
            
    }//GEN-LAST:event_btnCalcularMedidasActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        
        txtRadioCirculo.setText(" ");
        
        
        lblMedidaPerimetro.setText("");
        lblMedidaArea.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtRadioCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRadioCirculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRadioCirculoActionPerformed

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
            java.util.logging.Logger.getLogger(VistaCirculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaCirculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaCirculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaCirculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new VistaCirculo().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(VistaCirculo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularMedidas;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblMedidaArea;
    private javax.swing.JLabel lblMedidaPerimetro;
    private javax.swing.JLabel lblMedidasCirculo;
    private javax.swing.JLabel lblPerimetro;
    private javax.swing.JLabel lblRadio;
    private javax.swing.JLabel lblResultados;
    private javax.swing.JLabel lblTituloCirculo;
    private javax.swing.JTextField txtRadioCirculo;
    // End of variables declaration//GEN-END:variables
}
