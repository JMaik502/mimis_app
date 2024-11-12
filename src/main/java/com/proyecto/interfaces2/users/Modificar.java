/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.proyecto.interfaces2.users;

import com.proyecto.DAO.UsuarioDAO;
import com.proyecto.interfaces2.users.Modificar;
import com.proyecto.modelo.Usuario;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author alexa
 */
public class Modificar extends javax.swing.JFrame {

    /**
     * Creates new form interfaz
     */
    Usuario usuario ;
    Usuario usuario2;
    public Modificar(Usuario u, Usuario q) {
        this.usuario = u;
        this.usuario2=q;
        initComponents();
        this.setLocationRelativeTo(null);
        llenardato(q);
    }

    private void llenardato(Usuario u) {
        txtApellido.setText(u.getNombre());
        txtApellido1.setText(String.valueOf(u.getId()));
        txtPassword.setText(u.getContrasena());
        txtUser.setText(u.getCorreo());
        if (u.getAdmin()) {
            jComboBox1.setSelectedIndex(0);
        } else {
            jComboBox1.setSelectedIndex(1);
        }
    }

    public Modificar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GENERAL = new javax.swing.JPanel();
        LEFT = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        apellido3 = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        apellido2 = new javax.swing.JLabel();
        name4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        apellido6 = new javax.swing.JLabel();
        name5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        apellido7 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        name2 = new javax.swing.JLabel();
        txtApellido1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        RIGHT = new javax.swing.JPanel();
        btnSalirU = new javax.swing.JButton();
        brRight = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        GENERAL.setPreferredSize(new java.awt.Dimension(900, 600));
        GENERAL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LEFT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Modificar Usuarios");
        LEFT.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 230, -1));

        name.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        name.setForeground(new java.awt.Color(102, 102, 102));
        name.setText("Nombre");
        LEFT.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 100, 20));
        LEFT.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 320, 30));

        apellido3.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        apellido3.setForeground(new java.awt.Color(102, 102, 102));
        apellido3.setIcon(new javax.swing.ImageIcon(getClass().getResource("../../img/user.png"))); // NOI18N
        LEFT.add(apellido3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 30, 30));

        name1.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        name1.setForeground(new java.awt.Color(102, 102, 102));
        name1.setText("Correo");
        LEFT.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 130, 20));

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        LEFT.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 320, 30));

        apellido2.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        apellido2.setForeground(new java.awt.Color(102, 102, 102));
        apellido2.setIcon(new javax.swing.ImageIcon(getClass().getResource("../../img/last.png"))); // NOI18N
        LEFT.add(apellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 30, 30));

        name4.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        name4.setForeground(new java.awt.Color(102, 102, 102));
        name4.setText("Contaseña");
        LEFT.add(name4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 130, 20));
        LEFT.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 320, 30));

        apellido6.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        apellido6.setForeground(new java.awt.Color(102, 102, 102));
        apellido6.setIcon(new javax.swing.ImageIcon(getClass().getResource("../../img/pass.png"))); // NOI18N
        LEFT.add(apellido6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 30, 30));

        name5.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        name5.setForeground(new java.awt.Color(102, 102, 102));
        name5.setText("Rol");
        LEFT.add(name5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 130, 20));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Trabajador" }));
        LEFT.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 320, 30));

        apellido7.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        apellido7.setForeground(new java.awt.Color(102, 102, 102));
        apellido7.setIcon(new javax.swing.ImageIcon(getClass().getResource("../../img/sync.png"))); // NOI18N
        LEFT.add(apellido7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, 20, 20));

        btnAceptar.setBackground(new java.awt.Color(0, 153, 204));
        btnAceptar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("MODIFICAR");
        LEFT.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, -1, -1));
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String nombre, contrasena, correo;
                boolean admin;
                nombre = txtApellido.getText();
                contrasena = txtPassword.getText();
                correo = txtUser.getText();
                if (jComboBox1.getSelectedIndex() == 0) {
                    admin = true;
                } else {
                    admin = false;
                }
                Usuario user = new Usuario(nombre, contrasena, correo, admin);
                user.setId(usuario2.getId());
                if(user.equals(usuario2)){
                    showMessageDialog(null, "Son Iguales");
                }else{
                    UsuarioDAO us = new UsuarioDAO();
                    us.editar(user);
                    llenardato(user);
                }
            }
        });
        name2.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        name2.setForeground(new java.awt.Color(102, 102, 102));
        name2.setText("ID");
        LEFT.add(name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 100, 20));
        LEFT.add(txtApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 320, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("../../img/users-left.png"))); // NOI18N
        LEFT.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 450, 620));

        GENERAL.add(LEFT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 600));

        RIGHT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        GENERAL.add(RIGHT, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, -1, -1));

        btnSalirU.setBackground(new java.awt.Color(0, 204, 204));
        btnSalirU.setText("SALIR");
        btnSalirU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirUMouseClicked(evt);
            }
        });
        GENERAL.add(btnSalirU, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 510, -1, -1));

        brRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("../../img/users-right2.png"))); // NOI18N
        GENERAL.add(brRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 450, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
                GENERAL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addComponent(GENERAL, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirUMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnSalirUMouseClicked
        VerUsers verUs = new VerUsers(usuario);
        verUs.setVisible(true);
        this.setVisible(false);
    }// GEN-LAST:event_btnSalirUMouseClicked

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:

    }// GEN-LAST:event_txtUserActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GENERAL;
    private javax.swing.JPanel LEFT;
    private javax.swing.JPanel RIGHT;
    private javax.swing.JLabel apellido2;
    private javax.swing.JLabel apellido3;
    private javax.swing.JLabel apellido6;
    private javax.swing.JLabel apellido7;
    private javax.swing.JLabel brRight;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnSalirU;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel name;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel name4;
    private javax.swing.JLabel name5;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}