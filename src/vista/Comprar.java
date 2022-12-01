/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author Daniela Lopez
 */
public class Comprar extends javax.swing.JFrame {

    /**
     * Creates new form Comprar
     */
    public Comprar() {
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

        panel_comprar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_atras_com = new javax.swing.JButton();
        btn_comprar = new javax.swing.JButton();
        txt_nom_com = new javax.swing.JTextField();
        txt_dir_com = new javax.swing.JTextField();
        txt_tel_com = new javax.swing.JTextField();
        txt_doc_com = new javax.swing.JTextField();
        txt_fac_com = new javax.swing.JTextField();
        cbx_celulares_comprar = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        lbl_TituloComprar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_comprar.setBackground(new java.awt.Color(204, 204, 204));
        panel_comprar.setForeground(new java.awt.Color(153, 153, 153));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Logo.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("NOMBRE :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("TELÉFONO : ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("DOCUMENTO : ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("DIRECCIÓN :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("MARCA :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 51));
        jLabel7.setText("AUDIFONOS : ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 51));
        jLabel8.setText("CARGADOR  : ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 51));
        jLabel9.setText("No FACTURA :");

        btn_atras_com.setBackground(new java.awt.Color(153, 153, 153));
        btn_atras_com.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btn_atras_com.setForeground(new java.awt.Color(0, 51, 51));
        btn_atras_com.setText("ATRAS");
        btn_atras_com.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_atras_com.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atras_comActionPerformed(evt);
            }
        });

        btn_comprar.setBackground(new java.awt.Color(153, 153, 153));
        btn_comprar.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btn_comprar.setForeground(new java.awt.Color(0, 51, 51));
        btn_comprar.setText("COMPRAR");
        btn_comprar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_comprarActionPerformed(evt);
            }
        });

        txt_nom_com.setBackground(new java.awt.Color(153, 153, 153));
        txt_nom_com.setForeground(new java.awt.Color(0, 0, 0));
        txt_nom_com.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nom_comActionPerformed(evt);
            }
        });

        txt_dir_com.setBackground(new java.awt.Color(153, 153, 153));
        txt_dir_com.setForeground(new java.awt.Color(0, 0, 0));

        txt_tel_com.setBackground(new java.awt.Color(153, 153, 153));
        txt_tel_com.setForeground(new java.awt.Color(0, 0, 0));

        txt_doc_com.setBackground(new java.awt.Color(153, 153, 153));
        txt_doc_com.setForeground(new java.awt.Color(0, 0, 0));

        txt_fac_com.setBackground(new java.awt.Color(153, 153, 153));
        txt_fac_com.setForeground(new java.awt.Color(0, 0, 0));

        cbx_celulares_comprar.setBackground(new java.awt.Color(153, 153, 153));
        cbx_celulares_comprar.setForeground(new java.awt.Color(0, 0, 0));
        cbx_celulares_comprar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NINGUNO", "SAMSUNG GALAXY S22 ULTRA", "APPLE 13 PRO MAX", "OPPO RENO 7 SERIES", "XIAOMI MI 11 ULTRA" }));
        cbx_celulares_comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_celulares_comprarActionPerformed(evt);
            }
        });

        jComboBox2.setBackground(new java.awt.Color(153, 153, 153));
        jComboBox2.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NINGUNO", "CARGADOR INALAMBRICO CARGA RAPIDA", "CARGADOR TURBO POWER TIPO C", "CARGADOR MAGNETICO TODAS LAS MARCAS", "POWER BANK" }));

        jComboBox3.setBackground(new java.awt.Color(153, 153, 153));
        jComboBox3.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NINGUNO", "AIR PODS PRO 2", "JBL IN EAR ENDURANCE", "SONY ZX SERIES MDR", "HUAWEI FREE BUDS 4I" }));

        lbl_TituloComprar.setBackground(new java.awt.Color(204, 204, 204));
        lbl_TituloComprar.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lbl_TituloComprar.setForeground(new java.awt.Color(0, 153, 153));
        lbl_TituloComprar.setText("COMPRAS");

        javax.swing.GroupLayout panel_comprarLayout = new javax.swing.GroupLayout(panel_comprar);
        panel_comprar.setLayout(panel_comprarLayout);
        panel_comprarLayout.setHorizontalGroup(
            panel_comprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_comprarLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(panel_comprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_comprarLayout.createSequentialGroup()
                        .addGroup(panel_comprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel_comprarLayout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(txt_nom_com, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_comprarLayout.createSequentialGroup()
                                .addGroup(panel_comprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(panel_comprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_doc_com)
                                    .addComponent(txt_tel_com)
                                    .addComponent(txt_dir_com))))
                        .addGap(53, 53, 53)
                        .addGroup(panel_comprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)))
                    .addGroup(panel_comprarLayout.createSequentialGroup()
                        .addComponent(lbl_TituloComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)))
                .addGap(26, 26, 26)
                .addGroup(panel_comprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_fac_com)
                    .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbx_celulares_comprar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_comprarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_comprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_comprarLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(205, 205, 205))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_comprarLayout.createSequentialGroup()
                        .addComponent(btn_atras_com, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btn_comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154))))
        );
        panel_comprarLayout.setVerticalGroup(
            panel_comprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_comprarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_TituloComprar)
                .addGap(31, 31, 31)
                .addGroup(panel_comprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_comprarLayout.createSequentialGroup()
                        .addGroup(panel_comprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_nom_com, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(panel_comprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_doc_com, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(panel_comprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_tel_com, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(panel_comprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_dir_com, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_comprarLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(panel_comprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cbx_celulares_comprar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel_comprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(panel_comprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(panel_comprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_fac_com, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(panel_comprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_atras_com, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_comprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panel_comprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_comprarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_comprarActionPerformed

    private void btn_atras_comActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atras_comActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_atras_comActionPerformed

    private void txt_nom_comActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nom_comActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nom_comActionPerformed

    private void cbx_celulares_comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_celulares_comprarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_celulares_comprarActionPerformed

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
            java.util.logging.Logger.getLogger(Comprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Comprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Comprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Comprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Comprar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_atras_com;
    public javax.swing.JButton btn_comprar;
    private javax.swing.JComboBox<String> cbx_celulares_comprar;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbl_TituloComprar;
    private javax.swing.JPanel panel_comprar;
    public javax.swing.JTextField txt_dir_com;
    public javax.swing.JTextField txt_doc_com;
    public javax.swing.JTextField txt_fac_com;
    public javax.swing.JTextField txt_nom_com;
    public javax.swing.JTextField txt_tel_com;
    // End of variables declaration//GEN-END:variables
}
