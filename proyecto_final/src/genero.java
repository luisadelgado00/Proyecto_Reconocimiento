public class genero extends javax.swing.JFrame {
    public genero() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
public String genero="";
public String ejecutar(){
    String x=genero;
    System.out.println("Ejecutar: "+x);
    return x;
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        male = new javax.swing.JButton();
        femeale = new javax.swing.JButton();
        male_img = new javax.swing.JLabel();
        jbexit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Choose  gender of the suspect ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 290, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 255));
        jLabel6.setText("Caso Cerrado");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        male.setBackground(new java.awt.Color(0, 204, 204));
        male.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_man/male.png"))); // NOI18N
        male.setText("MALE");
        male.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maleMouseClicked(evt);
            }
        });
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel1.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 180, -1));

        femeale.setBackground(new java.awt.Color(255, 153, 153));
        femeale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_mujer/female.png"))); // NOI18N
        femeale.setText("FEMALE");
        femeale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                femealeMouseClicked(evt);
            }
        });
        jPanel1.add(femeale, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 200, -1));
        jPanel1.add(male_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));

        jbexit.setBackground(new java.awt.Color(153, 0, 0));
        jbexit.setForeground(new java.awt.Color(240, 240, 240));
        jbexit.setText("EXIT");
        jbexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbexitMouseClicked(evt);
            }
        });
        jPanel1.add(jbexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, -1, -1));

        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dactilar.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 340));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void maleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maleMouseClicked
  
     man rob = new man();
     rob.setVisible(true);
     this.genero="Male";
     this.dispose();
    }//GEN-LAST:event_maleMouseClicked

    private void femealeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_femealeMouseClicked
       this.dispose();
       woman rob = new woman();
       rob.setVisible(true);
       this.genero="Femeale";
      
    }//GEN-LAST:event_femealeMouseClicked

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleActionPerformed

    private void jbexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbexitMouseClicked
     System.exit(0);    }//GEN-LAST:event_jbexitMouseClicked

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton femeale;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbexit;
    private javax.swing.JButton male;
    private javax.swing.JLabel male_img;
    // End of variables declaration//GEN-END:variables
}
