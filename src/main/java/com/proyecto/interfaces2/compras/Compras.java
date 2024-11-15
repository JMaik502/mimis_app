/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.proyecto.interfaces2.compras;

import com.proyecto.interfaces2.*;
import com.proyecto.modelo.Usuario;

/**
 *
 * @author alexa
 */
public class Compras extends javax.swing.JFrame {

    /**
     * Creates new form interfaz
     */
    Usuario usuario = new Usuario();

    public Compras(Usuario u) {
        this.usuario = u;
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public Compras() {
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
        LEFT2 = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        name1 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        registro1 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        name4 = new javax.swing.JLabel();
        jComboProv = new javax.swing.JComboBox<>();
        txtPassword1 = new javax.swing.JTextField();
        name6 = new javax.swing.JLabel();
        txtApellido1 = new javax.swing.JTextField();
        name2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        name3 = new javax.swing.JLabel();
        jComboCat = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        RIGHT = new javax.swing.JPanel();
        btnSalirU = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        brRight = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        GENERAL.setPreferredSize(new java.awt.Dimension(900, 600));
        GENERAL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LEFT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LEFT2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        name.setForeground(new java.awt.Color(102, 102, 102));
        name.setText("Precio");
        LEFT2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 100, 20));

        btnAceptar.setBackground(new java.awt.Color(0, 153, 204));
        btnAceptar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("GENERAR");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        LEFT2.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, -1, -1));

        name1.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        name1.setForeground(new java.awt.Color(102, 102, 102));
        name1.setText("Proveedor");
        LEFT2.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 130, 20));
        LEFT2.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 240, 30));

        registro1.setFont(new java.awt.Font("Bookman Old Style", 3, 24)); // NOI18N
        registro1.setForeground(new java.awt.Color(102, 102, 102));
        registro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("../../img/mCompras.png"))); // NOI18N
        LEFT2.add(registro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 110, 110));
        LEFT2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 100, 30));

        name4.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        name4.setForeground(new java.awt.Color(102, 102, 102));
        name4.setText("Código");
        LEFT2.add(name4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 70, 20));

        jComboProv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Trabajador" }));
        LEFT2.add(jComboProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 240, 30));
        LEFT2.add(txtPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 100, 30));

        name6.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        name6.setForeground(new java.awt.Color(102, 102, 102));
        name6.setText("Cantidad");
        LEFT2.add(name6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 70, 20));

        txtApellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellido1ActionPerformed(evt);
            }
        });
        LEFT2.add(txtApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 100, 30));

        name2.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        name2.setForeground(new java.awt.Color(102, 102, 102));
        name2.setText("Producto");
        LEFT2.add(name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 100, 20));

        jTable1.setModel(
                new javax.swing.table.DefaultTableModel(
                        new Object[][] { { null, null, null, null }, { null, null, null, null },
                                { null, null, null, null }, { null, null, null, null } },
                        new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
        jScrollPane1.setViewportView(jTable1);

        LEFT2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 380, 250));

        name3.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        name3.setForeground(new java.awt.Color(102, 102, 102));
        name3.setText("Categoría");
        LEFT2.add(name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 130, 20));

        jComboCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fruta", "Verdura", " " }));
        LEFT2.add(jComboCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 240, 30));

        jLabel2.setText("¡Agregar una nueva categoría!");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        LEFT2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 530, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("../../img/users-left.png"))); // NOI18N
        LEFT2.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 450, 640));

        LEFT.add(LEFT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Compras");
        GENERAL.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, -1, -1));

        brRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("../../img/rightEdit.png"))); // NOI18N
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
        if(usuario.getAdmin()){
            Menu m = new Menu(usuario);
            m.setVisible(true);
            this.setVisible(false);
        }else{
            Menu2 m = new Menu2(usuario);
            m.setVisible(true);
            this.setVisible(false);
        }
    }// GEN-LAST:event_btnSalirUMouseClicked

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:

    }// GEN-LAST:event_btnAceptarActionPerformed

    private void txtApellido1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtApellido1ActionPerformed
        // TODO add your handling code here:

    }// GEN-LAST:event_txtApellido1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel2MouseClicked
        Categoria cat = new Categoria(usuario);
        cat.setVisible(true);
        this.setVisible(false);
    }// GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Compras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GENERAL;
    private javax.swing.JPanel LEFT;
    private javax.swing.JPanel LEFT2;
    private javax.swing.JPanel RIGHT;
    private javax.swing.JLabel brRight;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnSalirU;
    private javax.swing.JLabel fondo;
    private javax.swing.JComboBox<String> jComboCat;
    private javax.swing.JComboBox<String> jComboProv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel name3;
    private javax.swing.JLabel name4;
    private javax.swing.JLabel name6;
    private javax.swing.JLabel registro1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPassword1;
    // End of variables declaration//GEN-END:variables
}
