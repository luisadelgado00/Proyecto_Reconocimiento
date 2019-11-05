
import com.itextpdf.text.DocumentException;
import java.applet.AudioClip;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class man extends javax.swing.JFrame {
    int contE=0;
    int contN=0;
    int contM=0;
    int contB=0;
    int contF=0;
    int contH=0;
    public man() {
        initComponents();
        this.setLocationRelativeTo(null);
        bm1.setVisible(true);
        bm2.setVisible(false);
        bm3.setVisible(false);
        mm1.setVisible(true);
        mm2.setVisible(false);
        mm3.setVisible(false);
        em1.setVisible(true);
        em2.setVisible(false);
        em3.setVisible(false);
        fm1.setVisible(true);
        fm2.setVisible(false);
        fm3.setVisible(false);
        hm1.setVisible(true);
        hm2.setVisible(false);
        hm3.setVisible(false);
        nm1.setVisible(true);
        nm2.setVisible(false);
        nm3.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        em1 = new javax.swing.JLabel();
        em2 = new javax.swing.JLabel();
        em3 = new javax.swing.JLabel();
        nm1 = new javax.swing.JLabel();
        nm2 = new javax.swing.JLabel();
        nm3 = new javax.swing.JLabel();
        bm1 = new javax.swing.JLabel();
        bm2 = new javax.swing.JLabel();
        bm3 = new javax.swing.JLabel();
        hm1 = new javax.swing.JLabel();
        hm2 = new javax.swing.JLabel();
        hm3 = new javax.swing.JLabel();
        mm1 = new javax.swing.JLabel();
        mm2 = new javax.swing.JLabel();
        mm3 = new javax.swing.JLabel();
        fm1 = new javax.swing.JLabel();
        fm2 = new javax.swing.JLabel();
        fm3 = new javax.swing.JLabel();
        Eback = new javax.swing.JButton();
        Enext = new javax.swing.JButton();
        Nback = new javax.swing.JButton();
        Nnext = new javax.swing.JButton();
        Bback = new javax.swing.JButton();
        Bnext = new javax.swing.JButton();
        Fback = new javax.swing.JButton();
        Fnext = new javax.swing.JButton();
        Hback = new javax.swing.JButton();
        Hnext = new javax.swing.JButton();
        Mback = new javax.swing.JButton();
        Mnext = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        JBreturn = new javax.swing.JButton();
        BtSearch = new javax.swing.JButton();
        jfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("EYES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("NOUSE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("EYES BROWN");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 390, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("HAIR");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("MALE");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("MOUTH");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        em1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_man/ojos_hombre_1_sin_fondo.png"))); // NOI18N
        em1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                em1MouseDragged(evt);
            }
        });
        jPanel1.add(em1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        em2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_man/ojos_hombre_2_sin_fondo.png"))); // NOI18N
        em2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                em2MouseDragged(evt);
            }
        });
        jPanel1.add(em2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        em3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_man/ojos_hombre_3_sin_fondo.png"))); // NOI18N
        em3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                em3MouseDragged(evt);
            }
        });
        jPanel1.add(em3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        nm1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_man/nariz_hombre_1_sin_fondo.png"))); // NOI18N
        nm1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                nm1MouseDragged(evt);
            }
        });
        jPanel1.add(nm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        nm2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_man/nariz_hombre_2_sin_fondo.png"))); // NOI18N
        nm2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                nm2MouseDragged(evt);
            }
        });
        jPanel1.add(nm2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        nm3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_man/nariz_hombre_3_sin_fondo.png"))); // NOI18N
        nm3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                nm3MouseDragged(evt);
            }
        });
        jPanel1.add(nm3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        bm1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_man/cejas_hombre_1_sin_fondo.png"))); // NOI18N
        bm1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bm1MouseDragged(evt);
            }
        });
        jPanel1.add(bm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 440, -1, -1));

        bm2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_man/cejas_hombre_2_sin_fondo.png"))); // NOI18N
        bm2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bm2MouseDragged(evt);
            }
        });
        jPanel1.add(bm2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 440, -1, -1));

        bm3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_man/cejas_hombre_3_sin_fondo.png"))); // NOI18N
        bm3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bm3MouseDragged(evt);
            }
        });
        jPanel1.add(bm3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 440, -1, -1));

        hm1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_man/pelo_hombre_1.png"))); // NOI18N
        hm1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                hm1MouseDragged(evt);
            }
        });
        jPanel1.add(hm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, -1, -1));

        hm2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_man/pelo_hombre_2.png"))); // NOI18N
        hm2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                hm2MouseDragged(evt);
            }
        });
        jPanel1.add(hm2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, -1, -1));

        hm3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_man/pelo_hombre_3.png"))); // NOI18N
        hm3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                hm3MouseDragged(evt);
            }
        });
        jPanel1.add(hm3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, -1, -1));

        mm1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_man/boca__hombre_1_sin_fondo.png"))); // NOI18N
        mm1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                mm1MouseDragged(evt);
            }
        });
        jPanel1.add(mm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        mm2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_man/boca_hombre_2_son_fondo.png"))); // NOI18N
        mm2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                mm2MouseDragged(evt);
            }
        });
        jPanel1.add(mm2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        mm3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_man/boca_hombre_3_sin_fondo.png"))); // NOI18N
        mm3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                mm3MouseDragged(evt);
            }
        });
        jPanel1.add(mm3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        fm1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_man/rostro_hombre_1_sin_rasgos.png"))); // NOI18N
        fm1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                fm1MouseDragged(evt);
            }
        });
        jPanel1.add(fm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));

        fm2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_man/rostro_hombre_2_sin_rasgos.png"))); // NOI18N
        fm2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                fm2MouseDragged(evt);
            }
        });
        jPanel1.add(fm2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));

        fm3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_man/rostro_hombre_3_sin_rasgos.png"))); // NOI18N
        fm3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                fm3MouseDragged(evt);
            }
        });
        jPanel1.add(fm3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));

        Eback.setText("BACK");
        Eback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EbackMouseClicked(evt);
            }
        });
        Eback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EbackActionPerformed(evt);
            }
        });
        jPanel1.add(Eback, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        Enext.setText("NEXT");
        Enext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EnextMouseClicked(evt);
            }
        });
        jPanel1.add(Enext, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        Nback.setText("BACK");
        Nback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NbackMouseClicked(evt);
            }
        });
        Nback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NbackActionPerformed(evt);
            }
        });
        jPanel1.add(Nback, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        Nnext.setText("NEXT");
        Nnext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NnextMouseClicked(evt);
            }
        });
        Nnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NnextActionPerformed(evt);
            }
        });
        jPanel1.add(Nnext, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, -1, -1));

        Bback.setText("BACK");
        Bback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BbackMouseClicked(evt);
            }
        });
        Bback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbackActionPerformed(evt);
            }
        });
        jPanel1.add(Bback, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 500, -1, -1));

        Bnext.setText("NEXT");
        Bnext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BnextMouseClicked(evt);
            }
        });
        Bnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BnextActionPerformed(evt);
            }
        });
        jPanel1.add(Bnext, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 500, -1, -1));

        Fback.setText("BACK");
        Fback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FbackMouseClicked(evt);
            }
        });
        Fback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FbackActionPerformed(evt);
            }
        });
        jPanel1.add(Fback, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 500, -1, -1));

        Fnext.setText("NEXT");
        Fnext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FnextMouseClicked(evt);
            }
        });
        Fnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FnextActionPerformed(evt);
            }
        });
        jPanel1.add(Fnext, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, -1, -1));

        Hback.setText("BACK");
        Hback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HbackMouseClicked(evt);
            }
        });
        Hback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HbackActionPerformed(evt);
            }
        });
        jPanel1.add(Hback, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 330, -1, -1));

        Hnext.setText("NEXT");
        Hnext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HnextMouseClicked(evt);
            }
        });
        Hnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HnextActionPerformed(evt);
            }
        });
        jPanel1.add(Hnext, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 330, -1, -1));

        Mback.setText("BACK");
        Mback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MbackMouseClicked(evt);
            }
        });
        jPanel1.add(Mback, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, -1, -1));

        Mnext.setText("NEXT");
        Mnext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MnextMouseClicked(evt);
            }
        });
        jPanel1.add(Mnext, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 600, -1, -1));

        exit.setBackground(new java.awt.Color(153, 0, 0));
        exit.setForeground(new java.awt.Color(240, 240, 240));
        exit.setText("EXIT");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 630, -1, -1));

        JBreturn.setBackground(new java.awt.Color(153, 0, 0));
        JBreturn.setForeground(new java.awt.Color(240, 240, 240));
        JBreturn.setText("MENU");
        JBreturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBreturnMouseClicked(evt);
            }
        });
        JBreturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBreturnActionPerformed(evt);
            }
        });
        jPanel1.add(JBreturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 630, -1, -1));

        BtSearch.setText("Search");
        BtSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtSearchMouseClicked(evt);
            }
        });
        jPanel1.add(BtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 560, -1, -1));

        jfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dactilar.png"))); // NOI18N
        jPanel1.add(jfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EbackActionPerformed
    }//GEN-LAST:event_EbackActionPerformed

    private void NbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NbackActionPerformed
    }//GEN-LAST:event_NbackActionPerformed

    private void NnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NnextActionPerformed
    }//GEN-LAST:event_NnextActionPerformed

    private void BbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbackActionPerformed
    }//GEN-LAST:event_BbackActionPerformed

    private void BnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BnextActionPerformed
    }//GEN-LAST:event_BnextActionPerformed

    private void FbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FbackActionPerformed
    }//GEN-LAST:event_FbackActionPerformed

    private void FnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FnextActionPerformed
    }//GEN-LAST:event_FnextActionPerformed

    private void HbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HbackActionPerformed
    }//GEN-LAST:event_HbackActionPerformed

    private void HnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HnextActionPerformed
    }//GEN-LAST:event_HnextActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
    System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
    }//GEN-LAST:event_exitActionPerformed

    private void JBreturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBreturnMouseClicked
        genero obj6 =new genero();
        obj6.setVisible(true);
        this.dispose();
                
    }//GEN-LAST:event_JBreturnMouseClicked

    private void JBreturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBreturnActionPerformed
       
    }//GEN-LAST:event_JBreturnActionPerformed

    private void EnextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnextMouseClicked
        
        if (contE==0) {
            em1.setVisible(false);
            em2.setVisible(true);
            em3.setVisible(false);
            contE=contE+1;
        }
        else if (contE==1) {
            em1.setVisible(false);
            em2.setVisible(false);
            em3.setVisible(true);
            contE=contE+1;
        }
        else if (contE==2) {
            em1.setVisible(false);
            em2.setVisible(false);
            em3.setVisible(true);        
        }
    }//GEN-LAST:event_EnextMouseClicked

    private void em1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_em1MouseDragged
        Mouse robot = new Mouse();
        em1.setLocation(robot.thisX()-em1.getWidth()-(em1.getX()/2), robot.thisY()-em1.getHeight());
    }//GEN-LAST:event_em1MouseDragged

    private void EbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EbackMouseClicked
        // TODO add your handling code here:
        if (contE==0) {
            em1.setVisible(true);
            em2.setVisible(false);
            em3.setVisible(false);
        }
        else if (contE==1) {
            em1.setVisible(true);
            em2.setVisible(false);
            em3.setVisible(false);
            contE=contE-1;
        }
        else if (contE==2) {
            em1.setVisible(false);
            em2.setVisible(true);
            em3.setVisible(false);
            contE=contE-1;
        }
    }//GEN-LAST:event_EbackMouseClicked

    private void NbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NbackMouseClicked
        // TODO add your handling code here:
        if (contN==0) {
            nm1.setVisible(true);
            nm2.setVisible(false);
            nm3.setVisible(false);
        }
        else if (contN==1) {
            nm1.setVisible(true);
            nm2.setVisible(false);
            nm3.setVisible(false);
            contN=contN-1;
        }
        else if (contN==2) {
            nm1.setVisible(false);
            nm2.setVisible(true);
            nm3.setVisible(false);
            contN=contN-1;
        }
        
    }//GEN-LAST:event_NbackMouseClicked

    private void NnextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NnextMouseClicked
        // TODO add your handling code here:
        if (contN==0) {
            nm1.setVisible(false);
            nm2.setVisible(true);
            nm3.setVisible(false);
            contN=contN+1;
        }
        else if (contN==1) {
            nm1.setVisible(false);
            nm2.setVisible(false);
            nm3.setVisible(true);
            contN=contN+1;
        }
        else if (contN==2) {
            nm1.setVisible(false);
            nm2.setVisible(false);
            nm3.setVisible(true);        
        }
    }//GEN-LAST:event_NnextMouseClicked

    private void MbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MbackMouseClicked
        // TODO add your handling code here:
        if (contM==0) {
            mm1.setVisible(true);
            mm2.setVisible(false);
            mm3.setVisible(false);
        }
        else if (contM==1) {
            mm1.setVisible(true);
            mm2.setVisible(false);
            mm3.setVisible(false);
            contM=contM-1;
        }
        else if (contM==2) {
            mm1.setVisible(false);
            mm2.setVisible(true);
            mm3.setVisible(false);
            contM=contM-1;
        }
    }//GEN-LAST:event_MbackMouseClicked

    private void MnextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MnextMouseClicked
        // TODO add your handling code here:
        if (contM==0) {
            mm1.setVisible(false);
            mm2.setVisible(true);
            mm3.setVisible(false);
            contM=contM+1;
        }
        else if (contM==1) {
            mm1.setVisible(false);
            mm2.setVisible(false);
            mm3.setVisible(true);
            contM=contM+1;
        }
        else if (contM==2) {
            mm1.setVisible(false);
            mm2.setVisible(false);
            mm3.setVisible(true);        
        }
    }//GEN-LAST:event_MnextMouseClicked

    private void BbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BbackMouseClicked
        // TODO add your handling code here:
        if (contB==0) {
            bm1.setVisible(true);
            bm2.setVisible(false);
            bm3.setVisible(false);
        }
        else if (contB==1) {
            bm1.setVisible(true);
            bm2.setVisible(false);
            bm3.setVisible(false);
            contB=contB-1;
        }
        else if (contB==2) {
            bm1.setVisible(false);
            bm2.setVisible(true);
            bm3.setVisible(false);
            contB=contB-1;
        }
    }//GEN-LAST:event_BbackMouseClicked

    private void BnextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BnextMouseClicked
        // TODO add your handling code here:
        if (contB==0) {
            bm1.setVisible(false);
            bm2.setVisible(true);
            bm3.setVisible(false);
            contB=contB+1;
        }
        else if (contB==1) {
            bm1.setVisible(false);
            bm2.setVisible(false);
            bm3.setVisible(true);
            contB=contB+1;
        }
        else if (contB==2) {
            bm1.setVisible(false);
            bm2.setVisible(false);
            bm3.setVisible(true);        
        }
    }//GEN-LAST:event_BnextMouseClicked

    private void FbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FbackMouseClicked
        // TODO add your handling code here:
        if (contF==0) {
            fm1.setVisible(true);
            fm2.setVisible(false);
            fm3.setVisible(false);
        }
        else if (contF==1) {
            fm1.setVisible(true);
            fm2.setVisible(false);
            fm3.setVisible(false);
            contF=contF-1;
        }
        else if (contF==2) {
            fm1.setVisible(false);
            fm2.setVisible(true);
            fm3.setVisible(false);
            contF=contF-1;
        }
    }//GEN-LAST:event_FbackMouseClicked

    private void FnextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FnextMouseClicked
        // TODO add your handling code here:
        if (contF==0) {
            fm1.setVisible(false);
            fm2.setVisible(true);
            fm3.setVisible(false);
            contF=contF+1;
        }
        else if (contF==1) {
            fm1.setVisible(false);
            fm2.setVisible(false);
            fm3.setVisible(true);
            contF=contF+1;
        }
        else if (contF==2) {
            fm1.setVisible(false);
            fm2.setVisible(false);
            fm3.setVisible(true);        
        } 
    }//GEN-LAST:event_FnextMouseClicked

    private void HbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HbackMouseClicked
        // TODO add your handling code here:}
        if (contH==0) {
            hm1.setVisible(true);
            hm2.setVisible(false);
            hm3.setVisible(false);
        }
        else if (contH==1) {
            hm1.setVisible(true);
            hm2.setVisible(false);
            hm3.setVisible(false);
            contH=contH-1;
        }
        else if (contH==2) {
            hm1.setVisible(false);
            hm2.setVisible(true);
            hm3.setVisible(false);
            contH=contH-1;
        }
    }//GEN-LAST:event_HbackMouseClicked

    private void HnextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HnextMouseClicked
        // TODO add your handling code here:
        if (contH==0) {
            hm1.setVisible(false);
            hm2.setVisible(true);
            hm3.setVisible(false);
            contH=contH+1;
        }
        else if (contH==1) {
            hm1.setVisible(false);
            hm2.setVisible(false);
            hm3.setVisible(true);
            contH=contH+1;
        }
        else if (contH==2) {
            hm1.setVisible(false);
            hm2.setVisible(false);
            hm3.setVisible(true);        
        } 
    }//GEN-LAST:event_HnextMouseClicked

    private void em2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_em2MouseDragged
        Mouse robot = new Mouse();
        em2.setLocation(robot.thisX()-em2.getWidth()-(em2.getX()/2), robot.thisY()-em2.getHeight());    }//GEN-LAST:event_em2MouseDragged

    private void em3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_em3MouseDragged
        Mouse robot = new Mouse();
        em3.setLocation(robot.thisX()-em3.getWidth()-(em3.getX()/2), robot.thisY()-em3.getHeight());    }//GEN-LAST:event_em3MouseDragged

    private void nm1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nm1MouseDragged
        Mouse robot = new Mouse();
        nm1.setLocation(robot.thisX()-em1.getWidth()-(em1.getX()/2), robot.thisY()-em1.getHeight());    }//GEN-LAST:event_nm1MouseDragged

    private void nm2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nm2MouseDragged
Mouse robot = new Mouse();
        nm2.setLocation(robot.thisX()-nm2.getWidth()-(nm2.getX()/2), robot.thisY()-nm2.getHeight());    }//GEN-LAST:event_nm2MouseDragged

    private void nm3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nm3MouseDragged
        Mouse robot = new Mouse();
        nm3.setLocation(robot.thisX()-nm3.getWidth()-(nm3.getX()/2), robot.thisY()-nm3.getHeight());    }//GEN-LAST:event_nm3MouseDragged

    private void bm1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bm1MouseDragged
        Mouse robot = new Mouse();
        bm1.setLocation(robot.thisX()-bm1.getWidth()-(bm1.getX()/2), robot.thisY()-bm1.getHeight());    }//GEN-LAST:event_bm1MouseDragged

    private void bm2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bm2MouseDragged
        Mouse robot = new Mouse();
        bm2.setLocation(robot.thisX()-bm2.getWidth()-(bm2.getX()/2), robot.thisY()-bm2.getHeight());    }//GEN-LAST:event_bm2MouseDragged

    private void bm3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bm3MouseDragged
        Mouse robot = new Mouse();
        bm3.setLocation(robot.thisX()-bm3.getWidth()-(bm3.getX()/2), robot.thisY()-bm3.getHeight());    }//GEN-LAST:event_bm3MouseDragged

    private void hm1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hm1MouseDragged
        Mouse robot = new Mouse();
        hm1.setLocation(robot.thisX()-hm1.getWidth()-(hm1.getX()/2), robot.thisY()-hm1.getHeight());    }//GEN-LAST:event_hm1MouseDragged

    private void hm2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hm2MouseDragged
        Mouse robot = new Mouse();
        hm2.setLocation(robot.thisX()-hm2.getWidth()-(hm2.getX()/2), robot.thisY()-hm2.getHeight());    }//GEN-LAST:event_hm2MouseDragged

    private void hm3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hm3MouseDragged
        Mouse robot = new Mouse();
        hm3.setLocation(robot.thisX()-hm3.getWidth()-(hm3.getX()/2), robot.thisY()-hm3.getHeight());    }//GEN-LAST:event_hm3MouseDragged

    private void mm1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mm1MouseDragged
        Mouse robot = new Mouse();
        mm1.setLocation(robot.thisX()-mm1.getWidth()-(mm1.getX()/2), robot.thisY()-mm1.getHeight());    }//GEN-LAST:event_mm1MouseDragged

    private void mm2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mm2MouseDragged
        Mouse robot = new Mouse();
        mm2.setLocation(robot.thisX()-mm2.getWidth()-(mm2.getX()/2), robot.thisY()-mm2.getHeight());    }//GEN-LAST:event_mm2MouseDragged

    private void mm3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mm3MouseDragged
        Mouse robot = new Mouse();
        mm3.setLocation(robot.thisX()-mm3.getWidth()-(mm3.getX()/2), robot.thisY()-mm3.getHeight());    }//GEN-LAST:event_mm3MouseDragged

    private void fm1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fm1MouseDragged
        Mouse robot = new Mouse();
        fm1.setLocation(robot.thisX()-fm1.getWidth()-(fm1.getX()/2), robot.thisY()-fm1.getHeight());        }//GEN-LAST:event_fm1MouseDragged

    private void fm2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fm2MouseDragged
        Mouse robot = new Mouse();
        fm2.setLocation(robot.thisX()-fm2.getWidth()-(fm2.getX()/2), robot.thisY()-fm2.getHeight());    }//GEN-LAST:event_fm2MouseDragged

    private void fm3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fm3MouseDragged
        Mouse robot = new Mouse();
        fm3.setLocation(robot.thisX()-fm3.getWidth()-(fm3.getX()/2), robot.thisY()-fm3.getHeight());    }//GEN-LAST:event_fm3MouseDragged

    private void BtSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtSearchMouseClicked
        String Y = name();
        SearchMen file = new SearchMen();
        file.arch(Y);
        JOptionPane.showMessageDialog(null, "Thanks, your result is in the destination folder 'Destino' ");
        login logeo = new login();
        this.dispose();
        logeo.setVisible(true);    
    }//GEN-LAST:event_BtSearchMouseClicked
    public String name(){
        String rut="";
        if (hm1.isVisible()==true) rut=rut+"hm1";
        if (hm2.isVisible()==true) rut=rut+"hm2";
        if (hm3.isVisible()==true) rut=rut+"hm3";
        if (bm1.isVisible()==true) rut=rut+"bm1";
        if (bm2.isVisible()==true) rut=rut+"bm2";
        if (bm3.isVisible()==true) rut=rut+"bm3";
        if (em1.isVisible()==true) rut=rut+"em1";
        if (em2.isVisible()==true) rut=rut+"em2";
        if (em3.isVisible()==true) rut=rut+"em3";
        if (nm1.isVisible()==true) rut=rut+"nm1";
        if (nm2.isVisible()==true) rut=rut+"nm2";
        if (nm3.isVisible()==true) rut=rut+"nm3";
        if (mm1.isVisible()==true) rut=rut+"mm1";
        if (mm2.isVisible()==true) rut=rut+"mm2";
        if (mm3.isVisible()==true) rut=rut+"mm3";
        if (fm1.isVisible()==true) rut=rut+"fm1";
        if (fm2.isVisible()==true) rut=rut+"fm2";
        if (fm3.isVisible()==true) rut=rut+"fm3";
        return rut;
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new man().setVisible(true);
            }
        });
        man rob = new man();
        rob.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bback;
    private javax.swing.JButton Bnext;
    private javax.swing.JButton BtSearch;
    private javax.swing.JButton Eback;
    private javax.swing.JButton Enext;
    private javax.swing.JButton Fback;
    private javax.swing.JButton Fnext;
    private javax.swing.JButton Hback;
    private javax.swing.JButton Hnext;
    private javax.swing.JButton JBreturn;
    private javax.swing.JButton Mback;
    private javax.swing.JButton Mnext;
    private javax.swing.JButton Nback;
    private javax.swing.JButton Nnext;
    private javax.swing.JLabel bm1;
    private javax.swing.JLabel bm2;
    private javax.swing.JLabel bm3;
    private javax.swing.JLabel em1;
    private javax.swing.JLabel em2;
    private javax.swing.JLabel em3;
    private javax.swing.JButton exit;
    private javax.swing.JLabel fm1;
    private javax.swing.JLabel fm2;
    private javax.swing.JLabel fm3;
    private javax.swing.JLabel hm1;
    private javax.swing.JLabel hm2;
    private javax.swing.JLabel hm3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jfondo;
    private javax.swing.JLabel mm1;
    private javax.swing.JLabel mm2;
    private javax.swing.JLabel mm3;
    private javax.swing.JLabel nm1;
    private javax.swing.JLabel nm2;
    private javax.swing.JLabel nm3;
    // End of variables declaration//GEN-END:variables
}
