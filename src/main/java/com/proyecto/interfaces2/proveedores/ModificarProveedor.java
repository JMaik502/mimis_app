/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.proyecto.interfaces2.proveedores;

import com.proyecto.interfaces2.Menu;
import com.proyecto.interfaces2.Menu2;
import com.proyecto.modelo.Usuario;

/**
 *
 * @author alexa
 */
public class ModificarProveedor extends javax.swing.JFrame {

    /**
     * Creates new form interfaz
     */
    Usuario usuario = new Usuario();
    
    public ModificarProveedor(Usuario u){
        this.usuario=u;
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public ModificarProveedor() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GENERAL = new javax.swing.JPanel();
        LEFT = new javax.swing.JPanel();
        registro1 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        txtNombreP = new javax.swing.JTextField();
        apellido3 = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        txtTelP = new javax.swing.JTextField();
        apellido2 = new javax.swing.JLabel();
        txtDireccionP = new javax.swing.JTextField();
        name4 = new javax.swing.JLabel();
        apellido6 = new javax.swing.JLabel();
        txtNit = new javax.swing.JTextField();
        name5 = new javax.swing.JLabel();
        btnAceptarP = new javax.swing.JButton();
        name2 = new javax.swing.JLabel();
        txtNombreP1 = new javax.swing.JTextField();
        apellido4 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        RIGHT = new javax.swing.JPanel();
        btnSalirP = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        brRight = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        GENERAL.setPreferredSize(new java.awt.Dimension(900, 600));
        GENERAL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LEFT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registro1.setFont(new java.awt.Font("Bookman Old Style", 3, 24)); // NOI18N
        registro1.setForeground(new java.awt.Color(102, 102, 102));
        registro1.setText("Modificar Proveedores");
        LEFT.add(registro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 280, 50));

        name.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        name.setForeground(new java.awt.Color(102, 102, 102));
        name.setText("Nombre");
        LEFT.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 100, 20));
        LEFT.add(txtNombreP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 320, 30));

        apellido3.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        apellido3.setForeground(new java.awt.Color(102, 102, 102));
        apellido3.setIcon(new javax.swing.ImageIcon(getClass().getResource("../../img/user.png"))); // NOI18N
        LEFT.add(apellido3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 30, 30));

        name1.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        name1.setForeground(new java.awt.Color(102, 102, 102));
        name1.setText("Número de Teléfono");
        LEFT.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 130, 20));

        txtTelP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelPActionPerformed(evt);
            }
        });
        LEFT.add(txtTelP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 320, 30));

        apellido2.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        apellido2.setForeground(new java.awt.Color(102, 102, 102));
        apellido2.setIcon(new javax.swing.ImageIcon(getClass().getResource("../../img/last.png"))); // NOI18N
        LEFT.add(apellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 30, 30));
        LEFT.add(txtDireccionP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 320, 30));

        name4.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        name4.setForeground(new java.awt.Color(102, 102, 102));
        name4.setText("Dirección");
        LEFT.add(name4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 130, 20));

        apellido6.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        apellido6.setForeground(new java.awt.Color(102, 102, 102));
        apellido6.setIcon(new javax.swing.ImageIcon(getClass().getResource("../../img/pass.png"))); // NOI18N
        LEFT.add(apellido6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 30, 30));
        LEFT.add(txtNit, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 320, 30));

        name5.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        name5.setForeground(new java.awt.Color(102, 102, 102));
        name5.setText("NIT");
        LEFT.add(name5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 130, 20));

        btnAceptarP.setBackground(new java.awt.Color(0, 153, 204));
        btnAceptarP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAceptarP.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptarP.setText("Aceptar");
        btnAceptarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarPActionPerformed(evt);
            }
        });
        LEFT.add(btnAceptarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, -1, -1));

        name2.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        name2.setForeground(new java.awt.Color(102, 102, 102));
        name2.setText("ID");
        LEFT.add(name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 100, 20));
        LEFT.add(txtNombreP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 320, 30));

        apellido4.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        apellido4.setForeground(new java.awt.Color(102, 102, 102));
        apellido4.setIcon(new javax.swing.ImageIcon(getClass().getResource("../../img/user.png"))); // NOI18N
        LEFT.add(apellido4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 30, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("../../img/users-left.png"))); // NOI18N
        LEFT.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 450, 620));

        GENERAL.add(LEFT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 600));

        RIGHT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        GENERAL.add(RIGHT, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, -1, -1));

        btnSalirP.setBackground(new java.awt.Color(0, 204, 204));
        btnSalirP.setText("SALIR");
        btnSalirP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirPMouseClicked(evt);
            }
        });
        GENERAL.add(btnSalirP, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 490, -1, -1));

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Proveedores");
        GENERAL.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, -1, -1));

        brRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("../../img/rightEdit.png"))); // NOI18N
        GENERAL.add(brRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 450, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GENERAL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(GENERAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirPMouseClicked
        if(usuario.getAdmin()){
            Menu m = new Menu(usuario);
            m.setVisible(true);
            this.setVisible(false);
        }else{
            Menu2 m = new Menu2(usuario);
            m.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnSalirPMouseClicked

    private void txtTelPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelPActionPerformed

    private void btnAceptarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAceptarPActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarProveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GENERAL;
    private javax.swing.JPanel LEFT;
    private javax.swing.JPanel RIGHT;
    private javax.swing.JLabel apellido2;
    private javax.swing.JLabel apellido3;
    private javax.swing.JLabel apellido4;
    private javax.swing.JLabel apellido6;
    private javax.swing.JLabel brRight;
    private javax.swing.JButton btnAceptarP;
    private javax.swing.JButton btnSalirP;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel name4;
    private javax.swing.JLabel name5;
    private javax.swing.JLabel registro1;
    private javax.swing.JTextField txtDireccionP;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNombreP;
    private javax.swing.JTextField txtNombreP1;
    private javax.swing.JTextField txtTelP;
    // End of variables declaration//GEN-END:variables
}
