

import javax.swing.JOptionPane;
import java.applet.AudioClip;

public class login extends javax.swing.JFrame {
private String usuario,contraseña;

    public login() {
        initComponents();
        this.setLocationRelativeTo(null);
        AudioClip sonido;
        String direccion= "/SONIDO/Demi.wav";
        sonido = java.applet.Applet.newAudioClip(getClass().getResource(direccion));
        sonido.play();
    }
public void datos(String user, String password){
    usuario = "police";
        contraseña = "1234";
}
   


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();
        jBEntrar = new javax.swing.JButton();
        textPass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 0, 51));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("USER:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("PASSWORD:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        textUser.setBackground(new java.awt.Color(240, 240, 240));
        textUser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textUser.setForeground(new java.awt.Color(102, 0, 0));
        jPanel1.add(textUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 131, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("Caso Cerrado");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jbSalir.setBackground(new java.awt.Color(102, 0, 0));
        jbSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(240, 240, 240));
        jbSalir.setText("Exit");
        jbSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbSalirMouseClicked(evt);
            }
        });
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, -1));

        jBEntrar.setBackground(new java.awt.Color(0, 51, 204));
        jBEntrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBEntrar.setForeground(new java.awt.Color(240, 240, 240));
        jBEntrar.setText("Enter");
        jBEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBEntrarMouseClicked(evt);
            }
        });
        jPanel1.add(jBEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, -1));

        textPass.setBackground(new java.awt.Color(240, 240, 240));
        textPass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textPass.setForeground(new java.awt.Color(51, 0, 0));
        textPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPassActionPerformed(evt);
            }
        });
        jPanel1.add(textPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 130, -1));

        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dactilar.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 340));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSalirMouseClicked
            System.exit(0);
    }//GEN-LAST:event_jbSalirMouseClicked

    private void jBEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEntrarMouseClicked
        datos(usuario,contraseña);
        if (usuario.equals(textUser.getText()) && contraseña.equals(textPass.getText())) {
            genero ob1 = new genero();
            ob1.setVisible(true);
            this.dispose(); 
        }
        else if (textUser.getText().equals("") && textPass.getText().equals("")) {
        JOptionPane.showMessageDialog(null,"User or password are empty \nPlease enter it.");
        textUser.setFocusable(true);
        }
        else if (textUser.getText().equals("")) {
            JOptionPane.showMessageDialog(this,"User is empty \nPlease enter it.");
            textUser.setFocusable(true);
        }
        else if (textPass.getText().equals("")) {
            JOptionPane.showMessageDialog(this,"Password is empty \nPlease enter it.");
            textPass.setFocusable(true);
        }
         else if(textUser.getText().compareTo(usuario)!=0 && textPass.getText().compareTo(contraseña)!=0){
        JOptionPane.showMessageDialog(this,"User or password are incorrect \nPlease enter it again.");
           textUser.setFocusable(true);
        }
        else if(textUser.getText().compareTo(usuario)!=0){
        JOptionPane.showMessageDialog(this,"User is incorrect \nPlease enter it again.");
          textUser.setFocusable(true);
        }
        else if (textPass.getText().compareTo(contraseña) !=0) {
            JOptionPane.showMessageDialog(this,"Password is incorrect \nPlease enter it again.");
            textPass.setFocusable(true);
        }
      
        
        
    }//GEN-LAST:event_jBEntrarMouseClicked

    private void textPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPassActionPerformed

    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEntrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbSalir;
    private javax.swing.JPasswordField textPass;
    private javax.swing.JTextField textUser;
    // End of variables declaration//GEN-END:variables
}
