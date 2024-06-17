package Vista;

import Metodos.Metodos_sql;
//import com.sun.awt.AWTUtilities;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class frmLogin extends javax.swing.JFrame {

    public frmLogin() {
        initComponents();
        setLocationRelativeTo(null); //Centra la vantana en la pantalla
        //
        Shape forma = new RoundRectangle2D.Double(0, 0, getBounds().width, getBounds().height, 20, 20);
        //AWTUtilities.setWindowShape(this, forma);
    }
    Metodos_sql metodos = new Metodos_sql();

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
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo_farmacia.png"))); // NOI18N

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-xbox-cross-25.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-caduceus-25.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-nurse-25.png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-doctors-bag-25 (1).png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 600));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Gotham Thin", 0, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Iniciar Sesión");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 275, 53));

        jLabel4.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("USUARIO:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CONTRASEÑA:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        btnIngresar.setBackground(new java.awt.Color(73, 181, 172));
        btnIngresar.setFont(new java.awt.Font("Gotham Extra Light", 0, 18)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-login-20.png"))); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.setBorderPainted(false);
        btnIngresar.setContentAreaFilled(false);
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnIngresar.setFocusPainted(false);
        btnIngresar.setRequestFocusEnabled(false);
        btnIngresar.setVerifyInputWhenFocusTarget(false);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        btnIngresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnIngresarKeyPressed(evt);
            }
        });
        jPanel2.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 210, 60));

        txtUsuario.setBackground(new java.awt.Color(33, 45, 62));
        txtUsuario.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(153, 204, 255));
        txtUsuario.setBorder(null);
        txtUsuario.setCaretColor(new java.awt.Color(73, 181, 172));
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });
        jPanel2.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 270, 40));

        txtContraseña.setBackground(new java.awt.Color(33, 45, 62));
        txtContraseña.setFont(txtContraseña.getFont().deriveFont(txtContraseña.getFont().getSize()+7f));
        txtContraseña.setForeground(new java.awt.Color(255, 255, 255));
        txtContraseña.setBorder(null);
        txtContraseña.setCaretColor(new java.awt.Color(73, 181, 172));
        txtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyPressed(evt);
            }
        });
        jPanel2.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 270, 36));

        jSeparator1.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator1.setForeground(new java.awt.Color(73, 181, 172));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 310, 10));

        jSeparator2.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator2.setForeground(new java.awt.Color(73, 181, 172));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 310, 10));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-male-user-25.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 48, 36));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Lock_25px.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 48, 42));

        jLabel9.setFont(new java.awt.Font("Gotham Thin", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(73, 181, 172));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("x");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 30, 30));

        btnSalir.setBackground(new java.awt.Color(73, 181, 172));
        btnSalir.setFont(new java.awt.Font("Gotham Extra Light", 0, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-power-off-button-20.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalir.setFocusPainted(false);
        btnSalir.setFocusable(false);
        btnSalir.setRequestFocusEnabled(false);
        btnSalir.setVerifyInputWhenFocusTarget(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 210, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 400, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        if (txtUsuario.getText().isEmpty() || txtContraseña.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor rellene todos los campos");
        } else {

            String busqueda_usuario = metodos.buscarUsuarioRegistrado(txtUsuario.getText(), txtContraseña.getText());
            String buscarUsuario = metodos.UsuarioInvitado(txtUsuario.getText(), txtContraseña.getText());

            if (busqueda_usuario.equals("USUARIO ENCONTRADO")) {
                String busqueda_nombre = metodos.buscarNombre(txtUsuario.getText());
                JOptionPane.showMessageDialog(this, "Bienvenido(a): \n"    + busqueda_nombre + "\nRol: Administrador","Ingreso Exitoso",
                        JOptionPane.PLAIN_MESSAGE, icono("/Iconos/usss1.png", 60, 60));
                frmPrincipal ventana = new frmPrincipal();

                String busquedaUsuario = metodos.buscarUsuario(txtUsuario.getText());
                ventana.lblNombreUsuario.setText(busquedaUsuario);

                String busqueda_Rol = metodos.buscarTipoUsuario(txtUsuario.getText());
                ventana.lblRol.setText(busqueda_Rol);

                String busqueda_Id = metodos.buscarId(txtUsuario.getText());
                ventana.lblId.setText(busqueda_Id);
                ventana.setVisible(true);
                //frmPrincipal.mnuInvitado.setVisible(false);
                this.dispose();
                //AdministrarPerfil.jpInvitado.setVisible(false);
            } else if (buscarUsuario.equals("USUARIO ENCONTRADO")) {
                String busqueda_nombre = metodos.buscarNombre(txtUsuario.getText());
                JOptionPane.showMessageDialog(this, "Bienvenido(a): \n"+ busqueda_nombre + "\nRol: Vendedor","Ingreso Exitoso",
                        JOptionPane.PLAIN_MESSAGE, icono("/Iconos/Vend1.png", 60, 60));
                frmPrincipal ventana = new frmPrincipal();

                String busquedaUsuario = metodos.buscarUsuario(txtUsuario.getText());
                ventana.lblNombreUsuario.setText(busquedaUsuario);

                String busqueda_Rol = metodos.buscarTipoUsuario(txtUsuario.getText());
                ventana.lblRol.setText(busqueda_Rol);

                String busqueda_Id = metodos.buscarId(txtUsuario.getText());
                ventana.lblId.setText(busqueda_Id);

                ventana.setVisible(true);
//                frmProductos.btnReporte.setVisible(false);
//                frmClientes.btnImprimir.setVisible(false);
                
                frmPrincipal.MnuAdministrador.setVisible(false);
                frmPrincipal.mniEmpleado.setVisible(false);
                frmPrincipal.mniReportes.setVisible(false);
                frmPrincipal.jmuEmpleados.setVisible(false);
                frmPrincipal.mnuComprobante.setVisible(false);
                frmPrincipal.mnuCompra.setVisible(false);
                
                
                this.dispose();
                //AdministrarPerfil.jpAdmin.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "USUARIO NO REGISTRADO");
                txtUsuario.requestFocus();
            }
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtContraseña.requestFocus();

        }
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void txtContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            btnIngresar.requestFocus();

        }
    }//GEN-LAST:event_txtContraseñaKeyPressed

    private void btnIngresarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnIngresarKeyPressed
        if (txtUsuario.getText().isEmpty() || txtContraseña.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor rellene todos los campos");
        } else {

            String busqueda_usuario = metodos.buscarUsuarioRegistrado(txtUsuario.getText(), txtContraseña.getText());
            String buscarUsuario = metodos.UsuarioInvitado(txtUsuario.getText(), txtContraseña.getText());

            if (busqueda_usuario.equals("USUARIO ENCONTRADO")) {
                String busqueda_nombre = metodos.buscarNombre(txtUsuario.getText());
                JOptionPane.showMessageDialog(this, "Bienvenido(a): \n"    + busqueda_nombre + "\nRol: Administrador","Ingreso Exitoso",
                        JOptionPane.PLAIN_MESSAGE, icono("/Iconos/usss1.png", 60, 60));
                frmPrincipal ventana = new frmPrincipal();

                String busquedaUsuario = metodos.buscarUsuario(txtUsuario.getText());
                ventana.lblNombreUsuario.setText(busquedaUsuario);

                String busqueda_Rol = metodos.buscarTipoUsuario(txtUsuario.getText());
                ventana.lblRol.setText(busqueda_Rol);

                String busqueda_Id = metodos.buscarId(txtUsuario.getText());
                ventana.lblId.setText(busqueda_Id);

                ventana.setVisible(true);
                //frmPrincipal.mnuInvitado.setVisible(false);
                this.dispose();
                // AdministrarPerfil.jpInvitado.setVisible(false);
            } else if (buscarUsuario.equals("USUARIO ENCONTRADO")) {
                String busqueda_nombre = metodos.buscarNombre(txtUsuario.getText());
                JOptionPane.showMessageDialog(this, "Bienvenido(a): \n"+ busqueda_nombre + "\nRol: Vendedor","Ingreso Exitoso",
                        JOptionPane.PLAIN_MESSAGE, icono("/Iconos/Vend1.png", 60, 60));
                frmPrincipal ventana = new frmPrincipal();

                String busquedaUsuario = metodos.buscarUsuario(txtUsuario.getText());
                ventana.lblNombreUsuario.setText(busquedaUsuario);

                String busqueda_Rol = metodos.buscarTipoUsuario(txtUsuario.getText());
                ventana.lblRol.setText(busqueda_Rol);

                String busqueda_Id = metodos.buscarId(txtUsuario.getText());
                ventana.lblId.setText(busqueda_Id);

                ventana.setVisible(true);
//                frmProductos.btnReporte.setVisible(false);
//                frmClientes.btnImprimir.setVisible(false);
                
                frmPrincipal.MnuAdministrador.setVisible(false);
                frmPrincipal.mniEmpleado.setVisible(false);
                frmPrincipal.mniReportes.setVisible(false);
                frmPrincipal.jmuEmpleados.setVisible(false);
                frmPrincipal.mnuComprobante.setVisible(false);
                frmPrincipal.mnuCompra.setVisible(false);
                
                this.dispose();
               // AdministrarPerfil.jpAdmin.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "USUARIO NO REGISTRADO");
                txtUsuario.requestFocus();
            }
        }
    }//GEN-LAST:event_btnIngresarKeyPressed

    public Icon icono(String path, int width, int heigth) {
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage()
                .getScaledInstance(width, heigth, java.awt.Image.SCALE_SMOOTH));
        return img;
    }
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField txtContraseña;
    public static javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
